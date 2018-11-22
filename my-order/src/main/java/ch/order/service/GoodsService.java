package ch.order.service;

import ch.order.entity.Goods;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 9:43
 * version 1.0
 */
@Service
public class GoodsService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "queryGoodsByIdError")
    public Goods queryGoodsById(String id){
        String serviceId = "my-goods";
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        if(instances.isEmpty() || instances == null){
            return null;
        }
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://"+serviceInstance.getServiceId()+":"+serviceInstance.getPort();
        Goods forEntity = restTemplate.getForObject(url+"/goods/"+id, Goods.class);
        return forEntity;
    }

    /**
     * 断路器返回类型和参数都要和原始相同
     * @param id
     * @return
     */
    public Goods queryGoodsByIdError(String id){
        Goods goods = new Goods();
        goods.setDesc("请求不到商品服务,服务器出现异常.请求参数"+id);
        return goods;
    }
}

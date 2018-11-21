package ch.order.service;

import ch.order.entity.Goods;
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
    public Goods queryGoodsById(String id){
        String serviceId = "my-goods";
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        if(instances.isEmpty() || instances == null){
            return null;
        }
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort();
        Goods forEntity = restTemplate.getForObject(url+"/goods/"+id, Goods.class);
        return forEntity;
    }
}

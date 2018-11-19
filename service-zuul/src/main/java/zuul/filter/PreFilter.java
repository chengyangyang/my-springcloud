package zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月19日 17:18
 * version 1.0
 */
@Component
public class PreFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(PreFilter.class);

    public PreFilter() {
        super();
    }

    /**
     * 过滤类型
     * pre：可以在请求被路由之前调用。
     routing：在路由请求时候被调用。
     post：在routing和error过滤器之后被调用。
     error：处理请求时发生错误时被调用。
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否进行过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤规则
     * @return
     */
    @Override
    public Object run() {
        logger.info("pre--模拟身份认证");
        // TODO: 2017/12/24  身份不通过，跟oauth,jwt
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.put("start",System.currentTimeMillis());
        return null;
    }
}

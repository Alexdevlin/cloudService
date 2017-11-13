package com.dyl;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by duyunlei on 13/11/2017.
 */

@Component
public class MyFilter  extends ZuulFilter{

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);


    /**
     * 路由之前
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
        return 0;
    }

    /**
     * 是否过滤，true永远过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * @return
     */
    @Override
    public Object run() {

        System.out.println("来来来，检查一下是不是良民身份再走。。。");
        return null;
    }

}

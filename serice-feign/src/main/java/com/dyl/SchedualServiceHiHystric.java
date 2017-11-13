package com.dyl;

import org.springframework.stereotype.Component;

/**
 * Created by duyunlei on 13/11/2017.
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return name+"出错啦 出错啦";
    }
}

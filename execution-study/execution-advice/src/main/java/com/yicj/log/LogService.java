package com.yicj.log;

import com.yicj.anno.AdminOnly;
import com.yicj.bean.Product;
import org.springframework.stereotype.Component;

@Component
public class LogService implements Loggable{
    @Override
    @AdminOnly
    public void log() {
        System.out.println("log from LogService");
    }

    public void annoArg(Product product){
        System.out.println("execute log service annoArg");
    }
}
package com.yicj.log;

import org.springframework.stereotype.Component;

/**
 * Created by cat on 2017-02-19.
 */
@Component
public class LogService implements Loggable{

    @Override
    public void log() {
        System.out.println("log from LogService");
    }

}

package com.liukai.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Kay on 2017/5/31.
 */
public class ServiceMain {

    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring/applicationContext.xml"});
        context.start();
        System.out.println("ros service started in "+(System.currentTimeMillis()-begin)/1000+" seconds! Press any key to exit.");
        System.in.read();
    }
}

package com.example.dependencyinjectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dependencyinjectiondemo.bean.Restaurant;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "DI!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        Restaurant restaurant =context.getBean("rRef",Restaurant.class);
        System.out.println(restaurant);
    }
    
    
}

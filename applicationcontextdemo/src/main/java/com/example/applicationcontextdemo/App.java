package com.example.applicationcontextdemo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.applicationcontextdemo.bean.Connection;
 class App 
{
    public static void main( String[] args )
    {
        System.out.println( "welcome to application context" );
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
        System.out.println("Application context ioc container created");
        
        Connection c1=(Connection)context.getBean("con1");
        Connection c2=context.getBean("con2",Connection.class);
       Connection c3=context.getBean("con1",Connection.class);
        
        System.out.println("c1 is "+c1+"and hashcode"+c1.hashCode());
       System.out.println("c2 is "+c2+"and hashcode"+c2.hashCode());
        System.out.println("c3 is "+c3+"and hashcode"+c1.hashCode());
    }
}

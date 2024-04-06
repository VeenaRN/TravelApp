package com.example.estore;

import com.example.estore.bean.Connection;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "spring core bean factory ioc" );
        
        //traditionally we create objects using new operator and write data inside it.
//        Connection con1=new Connection();
//        con1.setUrl("jdbc:mysql://localhost/estore");
//        con1.setUsername("veena");
//        con1.setPassword("v@123");
//        
//        System.out.println("connection "+con1);
        
        //as per IOC objects be created by spring FW IOC container
        //as a developer we will not create the objects we will configure objects using xml file
        
        Resource resource =new ClassPathResource("context.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        System.out.println("bean factory created");
        
        //getting reference of beans from the BF IOC Container
        Connection c1=(Connection) factory.getBean("con1");
       Connection c2=factory.getBean("con2",Connection.class);
       Connection c3=factory.getBean("con2",Connection.class);
       
       System.out.println("c1 is "+c1+" and hashcode is "+c1.hashCode());
       System.out.println("c2 is "+c2+" and hashcode is "+c2.hashCode());
       System.out.println("c3 is "+c3+" and hashcode is "+c3.hashCode()); 
    }
}

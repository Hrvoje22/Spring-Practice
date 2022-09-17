package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.config.PcConfig;
import com.cydeo.streotype_annotation.monitorfactory.AcerMonitor;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        Monitor theMonitor2 = (Monitor)container.getBean("acerMonitor");
        Monitor theMonitor3 = container.getBean(AcerMonitor.class); //or ("acerMonitor",Monitor.class)
        System.out.println(theMonitor.getSize());
        System.out.println(theMonitor2.getSize());
        System.out.println(theMonitor3.getSize());

        //with casting we can get the other object that is not Primary




    }
}

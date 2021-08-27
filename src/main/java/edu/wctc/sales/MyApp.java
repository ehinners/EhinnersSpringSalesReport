package edu.wctc.sales;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MyApp
{
    public static void main(String[] args)
    {
        /*
        Instantiates spring stuff for configurations.
        Creates a reportController object with a factory method, then calls its method.
        */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((ReportController)context.getBean("reportController")).report();

        // TODO
        // Implement Summary Report
    }
}

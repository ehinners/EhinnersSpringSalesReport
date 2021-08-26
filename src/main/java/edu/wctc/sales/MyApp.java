package edu.wctc.sales;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MyApp
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((ReportController)context.getBean("reportController")).report();

        // QUESTIONS
        // Should I abstract out the order? What if they start adding package weight? What if a new shipping cost uses weight for calculation?
        // How thorough do I allow for shipping types? What countries should I expect?
        // How much from the sample list's signature could change that our program would allow for?
        // What options should the user be allowed? Can this be a simple input then output?

        // TODO
        // Implement inputs from user for CSVs
        //  - Console
        //  - File
        // Implement another shipping scheme
        // Implement more report types
        // Display Shipping cost in report
    }
}

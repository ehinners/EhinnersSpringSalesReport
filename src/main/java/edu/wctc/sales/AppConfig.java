package edu.wctc.sales;

import edu.wctc.sales.iface.DataInput;
import edu.wctc.sales.iface.ReportOutput;
import edu.wctc.sales.iface.ShippingRate;
import edu.wctc.sales.impl.DetailSalesReport;
import edu.wctc.sales.impl.FreeShipping;
import edu.wctc.sales.impl.FreeShippingOverThreshold;
import edu.wctc.sales.impl.ReportInputRawDataDebug;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.sales")
public class AppConfig
{
    /*
    Spring configuration file.
    Allows spring to instantiate objects needed for the overall program with factory methods.
    Here, different implementations of interfaces can be defined for greater customization of the program.
    See each individual interface and implementation for more information, as well as spring framework's documentation.
     */
    //Signature of ReportController Constructor:
    //public ReportController(DataInput salesList, UserInput in, ShippingRate rate, UserOutput out, ReportOutput display)

    @Bean
    public DataInput dataInput()
    {
        return new ReportInputRawDataDebug();
    }

    @Bean
    public ReportOutput dataOutput() {return new DetailSalesReport();}

    @Bean
    public ShippingRate shippingRate()
    {
        //return new FreeShipping();
        return new FreeShippingOverThreshold();
    }

}

package edu.wctc.sales;

import edu.wctc.sales.iface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportController
{
    /*
    This class is the main brains of the program, holding objects and calling methods.
    The main constructor is handled by part of the spring framework in conjunction with the configuration file.
    This class is responsible for:
     - taking input from a DataInput object
     - Altering it with a ShippingRate object
     - Then displaying a report through a ReportOutput object
     */
    private DataInput salesList;
    private UserInput in;
    private ShippingRate rate;
    private UserOutput out;
    private ReportOutput display;

    /*@Autowired
    public ReportController(DataInput salesList, UserInput in, ShippingRate rate, UserOutput out, ReportOutput display)*/
    @Autowired
    public ReportController(DataInput salesList, ShippingRate rate, ReportOutput display)
    {
        //this.in = in;
        //this.out = out;
        this.salesList = salesList;
        this.rate = rate;
        this.display = display;
        System.out.println("////////////Controller Initialized////////////");
    }

    public void report()
    {
        // First step, get the orders list
        List<Order> orders = salesList.dataIn();
        System.out.println("Sales List Gotten");
        // Second step, calculate each order's shipping,
        for (Order sale : orders)
        {
            rate.calculateShippingCost(sale);
        }
        System.out.println("Shipping Cost Calculated");
        // Third step, output the report
        display.displayReport(orders);
    }
}

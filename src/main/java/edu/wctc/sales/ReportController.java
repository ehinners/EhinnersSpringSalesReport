package edu.wctc.sales;

import edu.wctc.sales.iface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportController
{
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
            /*
            System.out.print(orders.get(i).getCustomer() + "/");
            System.out.print(orders.get(i).getCountry() + "/");
            System.out.print(orders.get(i).getAmount() + "/");
            System.out.print(orders.get(i).getTax() + "/");
            System.out.print(orders.get(i).getShipping() + "/");
            System.out.println();
            */
        }
        System.out.println("Shipping Cost Calculated");
        // Third step, output the report
        display.displayReport(orders);
    }
}

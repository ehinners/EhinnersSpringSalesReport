package edu.wctc.sales.impl;


import edu.wctc.sales.Order;
import edu.wctc.sales.iface.ReportOutput;

import java.util.List;

public class DetailSalesReport implements ReportOutput
{
    private String reportTitle = "SALES DETAIL REPORT";

    @Override
    public void displayReport(List<Order> orders)
    {


        System.out.print("==============================================================================");
        System.out.println("===========================================================================");
        System.out.printf("%77s \n", reportTitle);
        System.out.print("==============================================================================");
        System.out.println("===========================================================================");
        System.out.printf("%-60s","Customer");
        System.out.printf("%-57s","Country");
        System.out.printf("%12s","Amount");
        System.out.printf("%12s","Tax");
        System.out.printf("%12s\n","Shipping");
        System.out.print("------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        int i = 0;
        for (Order temp : orders)
        {
            System.out.printf("%-60s",orders.get(i).getCustomer());
            System.out.printf("%-57s",orders.get(i).getCountry());
            System.out.printf("%12.2f",orders.get(i).getAmount());
            System.out.printf("%12.2f",orders.get(i).getTax());
            System.out.printf("%12.2f",orders.get(i).getShipping());
            i++;
            System.out.println();
        }
        System.out.print("==============================================================================");
        System.out.println("===========================================================================");
    }
}

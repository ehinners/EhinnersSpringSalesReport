package edu.wctc.sales.impl;

import edu.wctc.sales.Order;
import edu.wctc.sales.iface.DataInput;

import java.util.ArrayList;
import java.util.List;

public class ReportInputRawDataDebug implements DataInput
{
    /*
    This class provides raw data for the rest of the program to modify and display.
    Overall more sophisticated implementations from the same interface are intended as input instead of this,
    but are not necessarily required as part of the scope of the original assignment.

    For more information see the related interface.
     */

    @Override
    public List<Order> dataIn()
    {
        List<String> sales = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        sales.add("Stacy Read,United States,190.95,10.45");
        sales.add("R.B. Whitaker,United States,54.33,4.35");
        sales.add("Rabindranath Tagore,India,117.89,11.20");
        sales.add("Lindsay Ellis,United States,25.19,1.51");
        sales.add("Shin Takahashi,Japan,145.00,10.88");
        sales.add("Erich Gamma,United States,53.63,3.50");
        sales.add("Iain M. Banks,Scotland,75.42,6.71");
        sales.add("Meg Ray,United States,11.99,1.05");

        for (String csvFromSales : sales)
        {
            orders.add(new Order(csvFromSales));
        }

        return orders;
    }
}

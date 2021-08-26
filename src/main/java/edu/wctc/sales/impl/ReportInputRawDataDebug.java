package edu.wctc.sales.impl;

import edu.wctc.sales.iface.DataInput;

import java.util.ArrayList;
import java.util.List;

public class ReportInputRawDataDebug implements DataInput
{

    @Override
    public List<String> dataIn()
    {
        List<String> orders = new ArrayList<>();

        orders.add("Stacy Read,United States,190.95,10.45");
        orders.add("R.B. Whitaker,United States,54.33,4.35");
        orders.add("Rabindranath Tagore,India,117.89,11.20");
        orders.add("Lindsay Ellis,United States,25.19,1.51");
        orders.add("Shin Takahashi,Japan,145.00,10.88");
        orders.add("Erich Gamma,United States,53.63,3.50");
        orders.add("Iain M. Banks,Scotland,75.42,6.71");
        orders.add("Meg Ray,United States,11.99,1.05");

        return orders;
    }
}

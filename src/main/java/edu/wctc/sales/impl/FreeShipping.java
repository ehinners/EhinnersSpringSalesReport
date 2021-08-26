package edu.wctc.sales.impl;

import edu.wctc.sales.Order;
import edu.wctc.sales.iface.ShippingRate;

public class FreeShipping implements ShippingRate
{

    private double shippingCost = 0.00;

    @Override
    public void calculateShippingCost(Order order)
    {
        order.setShipping(shippingCost);
    }
}

package edu.wctc.sales.impl;

import edu.wctc.sales.Order;
import edu.wctc.sales.iface.ShippingRate;

public class FreeShipping implements ShippingRate
{

    /*
    * This Class calculates individual order shipping costs as 0.00.
    * See related interface for more information.
    * */
    private double shippingCost = 0.00;

    @Override
    public void calculateShippingCost(Order order)
    {
        order.setShipping(shippingCost);
    }
}

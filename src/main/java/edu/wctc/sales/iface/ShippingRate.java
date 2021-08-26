package edu.wctc.sales.iface;

import edu.wctc.sales.Order;

public interface ShippingRate
{
    void calculateShippingCost(Order order);
}

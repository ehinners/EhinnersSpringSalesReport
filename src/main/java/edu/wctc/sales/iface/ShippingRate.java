package edu.wctc.sales.iface;

import edu.wctc.sales.Order;

public interface ShippingRate
{
    // Interface for algorithm which calculates shipping cost for order.
    // ReportController calls this in a loop to calculate all orders within a List
    void calculateShippingCost(Order order);
}

package edu.wctc.sales.iface;

import edu.wctc.sales.Order;

import java.util.List;

public interface DataInput
{
    // Interface for data input. Should output an arrayList of Orders.
    List<Order> dataIn();
}

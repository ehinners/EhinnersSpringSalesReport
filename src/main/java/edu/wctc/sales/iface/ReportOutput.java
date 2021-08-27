package edu.wctc.sales.iface;

import edu.wctc.sales.Order;

import java.util.List;

public interface ReportOutput
{
    // Interface for formatted displays of data from the ArrayList of orders
    void displayReport(List<Order> orders);
}

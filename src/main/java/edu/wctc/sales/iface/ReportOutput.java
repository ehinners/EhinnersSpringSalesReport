package edu.wctc.sales.iface;

import edu.wctc.sales.Order;

import java.util.List;

public interface ReportOutput
{
    void displayReport(List<Order> orders);
}

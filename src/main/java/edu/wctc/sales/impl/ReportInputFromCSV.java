package edu.wctc.sales.impl;

import edu.wctc.sales.iface.DataInput;

import java.util.ArrayList;
import java.util.List;

public class ReportInputFromCSV implements DataInput {
    @Override
    public List<String> dataIn()
    {
        List<String> orders = new ArrayList<>();

        return orders;
    }
}

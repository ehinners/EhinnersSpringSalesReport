package edu.wctc.sales.impl;

import edu.wctc.sales.Order;
import edu.wctc.sales.iface.ReportOutput;

import java.util.ArrayList;
import java.util.List;

public class SummarySalesReport implements ReportOutput
{
    /*
    This Class is responsible for displaying a formatted report, as does all DetailSalesReports.
    This implementation outputs to CONSOLE.
    This format scans the orders found in the argument list and holds
    a sum of attributes of like orders along the country of origin.
    This implementation outputs a formatted line of each country's attributes, as stored in the respective sums.
    * */
    String reportTitle = "SALES SUMMARY REPORT";

    @Override
    public void displayReport(List<Order> orders)
    {
        System.out.print("================================================");
        System.out.println("=============================================");
        System.out.printf("%54s \n", reportTitle);
        System.out.print("================================================");
        System.out.println("=============================================");
        System.out.printf("%-57s","Country");
        System.out.printf("%12s","Amount");
        System.out.printf("%12s","Tax");
        System.out.printf("%12s\n","Shipping");
        System.out.print("------------------------------------------------");
        System.out.println("---------------------------------------------");


        // Parallel lists for holding each attribute sum separated by country
        List<String> countries = new ArrayList<>();
        List<Double> amounts = new ArrayList<>();
        List<Double> taxes = new ArrayList<>();
        List<Double> shippingList = new ArrayList<>();

        String countryCompare; // Holds a temporary value of the current iterated order's country of origin
        boolean found; // flag value to ensure loop doesn't attempt to scan an empty ArrayList
        int countriesPosition = 0; // Holds an iterative position for all parallel lists to reference

        // Holds temporary values that can be added to for the calculation of sums
        double amountTemp = 0.00;
        double taxTemp = 0.00;
        double shippingTemp = 0.00;

        for (Order temp : orders)
        {
            found = false;
            countryCompare = temp.getCountry();

            if(countries !=null)
            {
                countriesPosition = 0;
                for(String listedCountry : countries)
                {
                    if(listedCountry.equals(countryCompare))
                    {
                        // if the country of origin for the current iterated order object
                        // has already been stored in the ArrayList of country names:
                        // flag found as true so there is no duplicate entries in the ArrayLists
                        found = true;

                        // then take each numerical attribute of the value stored in the respective parallel array,
                        // increase it by the current iterated order object's respective stored numerical attribute,
                        // then overwrite the old parallel array's value on the same index with the new one
                        amountTemp = amounts.get(countriesPosition);
                        amountTemp += temp.getAmount();
                        amounts.set(countriesPosition, amountTemp);

                        taxTemp = taxes.get(countriesPosition);
                        taxTemp += temp.getTax();
                        taxes.set(countriesPosition, taxTemp);

                        shippingTemp = shippingList.get(countriesPosition);
                        shippingTemp += temp.getShipping();
                        shippingList.set(countriesPosition, shippingTemp);
                    }
                    countriesPosition++;
                }
            }
            // if the ArrayList for a given attribute is either empty, OR
            // has no respective entry for a new country name
            // add those values each to their respective part of the parallel ArrayLists
            if(!found || countries==null)
            {
                countries.add(temp.getCountry());
                amounts.add(temp.getAmount());
                taxes.add(temp.getTax());
                shippingList.add(temp.getShipping());
            }
        }

        // using an iterative index to tie the parallel ArrayLists together,
        // output each value in each List along that same index
        countriesPosition = 0;
        for(String listedCountry :countries)
        {
            System.out.printf("%-57s",listedCountry);
            System.out.printf("%12.2f",amounts.get(countriesPosition));
            System.out.printf("%12.2f",taxes.get(countriesPosition));
            System.out.printf("%12.2f",shippingList.get(countriesPosition));
            System.out.println();
            countriesPosition++;
        }
        System.out.print("================================================");
        System.out.println("=============================================");
    }
}

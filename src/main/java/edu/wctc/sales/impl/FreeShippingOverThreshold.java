package edu.wctc.sales.impl;

import edu.wctc.sales.Order;
import edu.wctc.sales.iface.ShippingRate;

public class FreeShippingOverThreshold implements ShippingRate {

    private double threshold = 80.00;
    private double shippingCostLow = 0.00;

    // Geographical Regions as determined by the United Nations Geoscheme
    // Regions with no assigned value are assumed to be illegible for shipping
    private double shippingCostNorthernAmerica = 4.99;
    private double shippingCostCentralAmerica = 5.99;
    private double shippingCostSouthAmerica = 6.99;
    private double shippingCostCaribbean = 6.99;

    private double shippingCostWesternEurope = 8.99;
    private double shippingCostSouthernEurope = 8.99;
    private double shippingCostNorthernEurope = 7.99;
    private double shippingCostEasternEurope = 9.99;

    private double shippingCostCentralAsia = 10.99;
    private double shippingCostWesternAsia = 10.99;
    private double shippingCostEasternAsia = 10.99;
    private double shippingCostSouthernAsi = 9.99;
    private double shippingCostSoutheasternAsia = 9.99;

    private double shippingCostNorthernAfrica = 10.99;
    private double shippingCostWesternAfrica = 10.99;
    private double shippingCostMiddleAfrica = 10.99;
    private double shippingCostEasternAfrica = 10.99;
    private double shippingCostSouthernAfrica = 10.99;

    private double shippingCostAUandNZ = 9.99;
    private double shippingCostPacificIslands = 9.99;

    private double shippingCostCuba = 29.99;
    private double shippingCostNorthKorea = 29.99;

    @Override
    public void calculateShippingCost(Order order)
    {
        String country = order.getCountry();
        if(order.getAmount()>threshold)
        {
            order.setShipping(shippingCostLow);
        }
        else
        {
            if(country.equals("United States"))
            {
                order.setShipping(shippingCostNorthernAmerica);
            }
            if(country.equals("India"))
            {
                order.setShipping(shippingCostSoutheasternAsia);
            }
            if(country.equals("Japan"))
            {
                order.setShipping(shippingCostSoutheasternAsia);
            }
            if(country.equals("Scotland"))
            {
                order.setShipping(shippingCostNorthernEurope);
            }
        }
    }
}

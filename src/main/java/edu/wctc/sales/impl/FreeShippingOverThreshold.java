package edu.wctc.sales.impl;

import edu.wctc.sales.Order;
import edu.wctc.sales.iface.ShippingRate;

public class FreeShippingOverThreshold implements ShippingRate {

    /* This class calculates shipment rates based on two factors:
     - Overall order cost (the "amount" attribute of an order)
     - Country of origin on an order (the "country" attribute of an order)
     If the order cost exceeds a defined threshold, shipping is set at the "shippingCostLow"
     Else, the order cost is defined by the country of origin.

     NOTE: For simplicity, not every country is implemented here for calculation.
     A more intensive amount of options for countries should be defined by the designated signature of the input.
     The shipment cost should not be responsible for where a customer is allowed to order from.

     For more detail, see the related interface.
    */

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

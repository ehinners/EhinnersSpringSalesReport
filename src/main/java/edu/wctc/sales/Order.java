package edu.wctc.sales;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
    private String customer;
    private String country;
    private double amount;
    private double tax;
    private double shipping;

    public Order(String csvLine)
    {
        int i = 0;
        for (String temp : csvLine.split(",")) {
            switch (i)
            {
                case 0:
                    customer = temp;
                    break;
                case 1:
                    country = temp;
                    break;
                case 2:
                    amount = Double.parseDouble(temp);
                    break;
                case 3:
                    tax = Double.parseDouble(temp);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            i++;
        }
    }



    public String getCustomer() {
        return customer;
    }


    public void setCustomer(String customer) {
        this.customer = customer;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public double getTax() {
        return tax;
    }


    public void setTax(double tax) {
        this.tax = tax;
    }


    public double getShipping() {
        return shipping;
    }


    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}

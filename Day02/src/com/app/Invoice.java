package com.app;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription,
                   int quantity, double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Getter and Setter for partNumber
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    // Getter and Setter for partDescription
    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    // Getter and Setter for pricePerItem
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Calculate Invoice Amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
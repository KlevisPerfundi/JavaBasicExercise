package org.example.Exercise7;

public class Car {
    private String model;
    private int productYear;
    private String color;
    private  boolean used;

    private int mileAge;

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public int getMileAge() {
        return mileAge;
    }

    public int drive(int mileAge){
        int value = mileAge+getMileAge();
        if (value>0){
            used=true;
        }else{
            used=false;
    }
    return value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUsed() {
        return used;
    }
}

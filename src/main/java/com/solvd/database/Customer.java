package com.solvd.database;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private Integer id;
    private String fName;
    private String lName;
    private String phoneNumber;
    private Vehicle vehicle;

    public Customer(String fName, String lName, String phoneNumber, Vehicle vehicle) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.vehicle = vehicle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void chooseService(CarServiceShop company, Catalogue service){
        List<Catalogue> servicesChosen = new ArrayList<>();
        for(int i=0; i<servicesChosen.size(); i++){
            servicesChosen.add(service);
        }
    }
}

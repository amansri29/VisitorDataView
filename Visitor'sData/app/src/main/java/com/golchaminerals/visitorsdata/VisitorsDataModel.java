package com.golchaminerals.visitorsdata;

/**
 * Created by Ashok.Sharma on 17-Nov-17.
 */

public class VisitorsDataModel {

    String firstName, lastName, mobileNumber, whomToMeet, inTime, inDate, purpose, remarks, profileImage, from, noOfPeople;

    public VisitorsDataModel(String firstName, String lastName, String mobileNumber, String whomToMeet, String inTime, String inDate, String purpose, String remarks, String profileImage, String from, String noOfPeople ) {
        this.firstName= firstName;
        this.lastName= lastName;
        this.mobileNumber= mobileNumber;
        this.whomToMeet= whomToMeet;
        this.inDate= inDate;
        this.inTime= inTime;
        this.purpose= purpose;
        this.remarks= remarks;
        this.profileImage = profileImage;
        this.from = from;
        this.noOfPeople = noOfPeople;






    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getWhomToMeet() {
        return whomToMeet;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getNoOfPeople() {
        return noOfPeople;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getInTime() {
        return inTime;
    }

    public String getInDate() {
        return inDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getFrom() {
        return from;
    }


}

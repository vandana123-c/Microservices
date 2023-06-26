package com.mycompany.Webfunction;

import java.util.Date;

public class TollRecord { 
    String stationid;
    String licenseplate;
    Date timestamp;
    public String getStationid() {
        return stationid;
    }
    public void setStationid(String stationid) {
        this.stationid = stationid;
    }
    public String getLicenseplate() {
        return licenseplate;
    }
    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


    



}
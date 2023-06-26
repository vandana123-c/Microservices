package com.mycompany.SecureUI;



public class Tolldata {

    String stationid;
    String licenseplate;
    
    String timestamp;

    public Tolldata(String stationid, String licenseplate, String timestamp) {
        this.stationid = stationid;
        this.licenseplate = licenseplate;
        this.timestamp = timestamp;
    }
    
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
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    



}
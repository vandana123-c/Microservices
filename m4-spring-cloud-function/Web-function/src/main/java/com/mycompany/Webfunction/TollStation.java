package com.mycompany.Webfunction;

public class TollStation {

    String stationid;
    Float milemarker;
    Integer stallcount;

    public TollStation(String stationid,Float milemarker,Integer stallcount)
    {
        this.stationid=stationid;
        this.milemarker=milemarker;
        this.stallcount=stallcount;

    }
   
    public void setstationid(String stationid){
        this.stationid=stationid;
    }
    public String getstationid(){
       return  this.stationid;
    }
    public void setmilemarker(Float milemarker){
        this.milemarker=milemarker;
    }
    public Float getmilemarker(){
        return this.milemarker;
    }
    public void setstallcount(Integer stallcount){
         this.stallcount=stallcount;
    }
    public String getstallcount(){
        return  this.stationid;
    }



}

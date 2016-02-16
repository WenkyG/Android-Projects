package com.example.venky.eventlist;

/**
 * Created by Venky on 2/15/2016.
 */
public class Event {
    public String eventName;
    public String eventDesc;
    public String eventLocation;
    public String eventDate;
    Event() {
        this.eventName = null;
        this.eventDesc = null;
        this.eventLocation = null;
        this.eventDate = null;
    }
    Event(String eventName,String eventDesc,String eventLocation,String eventDate){
        this.eventName = eventName;
        this.eventDesc = eventDesc;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public void setEventDesc(String eventDesc){
        this.eventDesc = eventDesc;
    }
    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
     public String getEventName() {
         return eventName;
     }
    public String getEventDesc() {
        return eventDesc;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public String getEventDate() {
        return eventDate;
    }
}

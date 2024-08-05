package com.scaler.greetings;

public class Greetings {
    /**write a function displaying a greeting message based on the time of the day**/
    public String greet(){
    int hour = java.time.LocalTime.now().getHour();
    if(hour>=0 && hour<12){
        return "Good Morning";
    } else if (hour>=12 && hour<16) {
        return "Good Afternoon";
    }else if(hour>=16 && hour<20){
        return "Good Evening";
    }
    else{
        return "Good Night";
    }
    }
}
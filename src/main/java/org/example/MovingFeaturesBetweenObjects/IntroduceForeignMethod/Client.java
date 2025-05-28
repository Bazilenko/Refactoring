package org.example.MovingFeaturesBetweenObjects.IntroduceForeignMethod;

import java.util.Calendar;

public class Client {

    public boolean isWeekend(Calendar date){
        return DateUtils.isWeekend(date);
    }

    public void doSomething(){
        Calendar currentDate = Calendar.getInstance();
        if(DateUtils.isWeekend(currentDate))
            System.out.println("It's weekend");
        else
            System.out.println("It's not weekend");
    }
}

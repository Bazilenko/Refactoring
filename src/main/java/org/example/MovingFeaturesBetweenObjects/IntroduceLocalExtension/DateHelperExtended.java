package org.example.MovingFeaturesBetweenObjects.IntroduceLocalExtension;

import java.util.Date;

public class DateHelperExtended extends DateHelper{
    public static int daysBetween(Date startDate, Date endDate){
        long diffInMillis = endDate.getTime() - startDate.getTime();
        return (int) (diffInMillis / (1000 * 60 * 60 * 24));
    }
}

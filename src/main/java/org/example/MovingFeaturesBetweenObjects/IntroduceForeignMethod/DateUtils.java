package org.example.MovingFeaturesBetweenObjects.IntroduceForeignMethod;

import java.util.Calendar;

public class DateUtils {

    public static boolean isWeekend(Calendar date){
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY;
    }
}

package com.brownsuagr.qasystem.utils;

import java.util.Calendar;

public class TimeFormat {
    public String TimeFormat(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        return year+" 年 "+month+" 月 "+day+" 日 ";
    }

}

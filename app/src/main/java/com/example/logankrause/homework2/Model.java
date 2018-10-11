package com.example.logankrause.homework2;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Observable;

public class Model extends Observable {

    private String hours;
    private String minutes;
    private String seconds;
    private Activity act;
    Collection<View> views;

    public String getSecond() {
        return seconds;
    }
    public String getHour() {
        return hours;
    }
    public String getMinute() {
        return minutes;
    }

    public void setTime(String hour, String minutes, String seconds)
    {
        this.hours = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHour(String hour)
    {
        this.hours = hour;
        setChanged();
        notifyObservers();
    }

    public void setMinute(String minute)
    {
        this.minutes = minute;
        setChanged();
        notifyObservers();
    }


    public void setSecond(String seconds)
    {
        this.seconds = seconds;
        setChanged();
        notifyObservers();
    }


    // Gets the custom time made by the user
    // Updates every second.
    // Q: Should it update in this method or another one?
    public String getTime()
    {
        final Calendar cal = Calendar.getInstance();
        final Date date = new Date();
        cal.setTime(date);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Thread t = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    while(true)
                    {
                        Thread.sleep(1000);
                    }
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        return format.format(cal.getTime());
    }
}

package com.example.logankrause.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DigitalClock;
import android.widget.EditText;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Digital extends AppCompatActivity {

    private Model _m;
    private EditText hour;
    private EditText minute;
    private EditText second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital);

        hour = (EditText) findViewById(R.id.hours);
        minute = (EditText) findViewById(R.id.minutes);
        second = (EditText) findViewById(R.id.seconds);
    }

    public void setModel(Model _m) {
        this._m = _m;
    }

}

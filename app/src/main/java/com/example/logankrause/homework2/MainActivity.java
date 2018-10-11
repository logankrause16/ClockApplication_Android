package com.example.logankrause.homework2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Collection;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

public class MainActivity extends Activity implements Observer, View.OnClickListener
{

    private EditText hours;
    private EditText minutes;
    private EditText seconds;
    private Collection<View> views;
    private Model _m = new Model();
    private Button analogBtn;
    private Button digitalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analogBtn = (Button) findViewById(R.id.addAnalog);
        digitalBtn = (Button) findViewById(R.id.addDigital);
        analogBtn.setOnClickListener(this);
        digitalBtn.setOnClickListener(this);
    }

    @Override
    public void update(Observable o, Object arg) {}

    @Override
    public void onClick(View v)
    {
        hours = findViewById(R.id.hours);
        minutes = findViewById(R.id.minutes);
        seconds = findViewById(R.id.seconds);

        _m.setHour(hours.toString());
        _m.setMinute(minutes.toString());
        _m.setSecond(seconds.toString());
        switch (v.getId())
        {
            case R.id.addAnalog:
                Intent analog = new Intent(this, Analog.class);
                startActivity(analog);
                break;

            case R.id.addDigital:
                Intent digital = new Intent(MainActivity.this, Digital.class);
                Digital set = new Digital();
                set.setModel(_m);
                startActivity(digital);
                break;
        }
    }
}
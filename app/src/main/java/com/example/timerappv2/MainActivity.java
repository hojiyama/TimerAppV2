package com.example.timerappv2;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends Activity {

    private int year,month,day ,age;

    private TextView dispView;
    private TextView ageView;

    //プレファレンス
    private static final String PREFS_FILE = "MyPrefsFile";
    private static final String YEAR = "YEAR";
    private static final String MONTH = "MONTH";
    private static final String DAY = "DAY";
    private static final String HOUR = "HOUR";
    private static final String MINUTE = "MINUTE";
    private static final String SECOND = "SECOND";

    public class ClearButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){

                SharedPreferences prefs = getSharedPreferences(PREFS_FILE,Activity.MODE_PRIVATE);
           
    }

    public class SetButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            new DatePickerDialog(MainActivity.this,android.R.style.Theme_Holo_Light_Dialog,new DatePickerDialog.OnDateSetListener(){
                @Override
                public void onDateSet(DatePicker view, int year ,int monthOfYear,int dayOfMonth){
                    MainActivity.this.year = year;
                    month = monthOfYear;
                    day = dayOfMonth;
                    showResult();
                    savePrefs();
                }
            },1979,6,3).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

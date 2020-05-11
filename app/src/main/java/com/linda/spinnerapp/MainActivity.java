package com.linda.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp_vice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      String[] vice_meal_array ={"咖啡","果汁","汽水"};
      sp_vice =(Spinner)findViewById(R.id.sp_vice);
        ArrayAdapter<String> ad_vice = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,vice_meal_array);
        sp_vice.setAdapter(ad_vice);
        }

    public void btnOK(View view) {
        Spinner sp_main =(Spinner)findViewById(R.id.sp_main);
        String main =sp_main.getSelectedItem().toString();
        String vice =sp_vice.getSelectedItem().toString();
        TextView show =(TextView)findViewById(R.id.txvshow);
        show.setText("主餐:"+ main +"\n"+"副餐:"+vice);
}
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView)findViewById(R.id.Name);
        name.setText("이름 : 정희찬");
        name.setTextSize(TypedValue.COMPLEX_UNIT_SP,24);
        name.setTextColor(0xffff00ff);
        name.setBackgroundColor(0xff0000ff);
    }
}

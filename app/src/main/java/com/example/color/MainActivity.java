package com.example.color;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Spinner spinner;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        spinner=findViewById(R.id.spinner);

    }

    public void click(View view) {
        number=spinner.getSelectedItemPosition();
        String [] des=getResources().getStringArray(R.array.discription);
        textView.setText(des[number]);
    }
}

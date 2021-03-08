package com.mytest.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int Count = 0;
    private TextView CountText;
    private Button Zero;
    private Button CB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountText = (TextView) findViewById(R.id.textView3);
        Zero = (Button) findViewById(R.id.button2);
        CB = (Button) findViewById(R.id.button3);
    }

    private void showCountText(){
        if(CountText != null)
            CountText.setText(Integer.toString(Count));
    }

    public void addOne(View view) {
        Count++;
        Zero.setBackgroundColor(Color.MAGENTA);
        if(Count%2 == 0 )
            CB.setBackgroundColor(Color.GREEN);
        else
            CB.setBackgroundColor(Color.BLUE);
        showCountText();
    }

    public void zero(View view) {
        Count = 0;
        Zero.setBackgroundColor(Color.GRAY);
        showCountText();
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, "This is a Toast.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
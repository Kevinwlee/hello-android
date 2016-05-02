package com.example.kevin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class TallyActivity extends AppCompatActivity {

    private TextView tallyTextView;
    private int tally = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tally);

        tallyTextView = (TextView) findViewById(R.id.tally_text_view);
        updateDisplay();
    }

    public void addTapped(View view) {
        tally++;
        Log.d("ADD", String.valueOf(tally));
        updateDisplay();
    }

    public void subtractTapped(View view) {
        tally--;
        Log.d("SUB", String.valueOf(tally));
        updateDisplay();
    }

    private void updateDisplay() {
        tallyTextView.setText(String.valueOf(tally));
    }
}

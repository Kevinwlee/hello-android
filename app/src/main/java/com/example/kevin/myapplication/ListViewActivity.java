package com.example.kevin.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.sql.Array;
import java.util.ArrayList;

public class ListViewActivity extends ListActivity {

    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        String[] items =  {"one", "two", "three"};
        mAdapter  = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, items);

    }
}

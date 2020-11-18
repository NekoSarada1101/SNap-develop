package com.example.snap_develop.activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.snap_develop.R;

import java.util.ArrayList;
import java.util.HashMap;

public class UserActivity extends AppCompatActivity {
    ListView lv;
    SimpleAdapter sAdapter;
    ArrayList<HashMap<String, String>> listData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        listData = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> data1 = new HashMap<String, String>();
        data1.put("", "");
        data1.put("", "");
        data1.put("", "");
        listData.add(data1);

        HashMap<String, String> data2 = new HashMap<String, String>();
        data2.put("", "");
        data2.put("", "");
        data2.put("", "");
        listData.add(data2);


        sAdapter = new SimpleAdapter(this, listData,
                R.layout.list_user,
                new String[]{"", "", ""},
                new int[]{R.id.userpicture, R.id.username, R.id.userid, R.id.date,
                        R.id.postcontents, R.id.postpicture,
                        R.id.comment, R.id.favorite, R.id.favoritequantity, R.id.location,
                        R.id.locationinfomation});

        lv = (ListView) findViewById(R.id.postList);
        lv.setAdapter(sAdapter);

    }
}
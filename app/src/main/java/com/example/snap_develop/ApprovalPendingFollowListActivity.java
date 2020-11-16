package com.example.snap_develop;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class ApprovalPendingFollowListActivity extends AppCompatActivity {
    ListView lv;
    SimpleAdapter sAdapter;
    ArrayList<HashMap<String, String>> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approval_pending_follow_list);

        listData = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> data1 = new HashMap<String, String>();
        data1.put("username", "西山大成");
        data1.put("userid", "t1233");
        listData.add(data1);

        HashMap<String, String> data2 = new HashMap<String, String>();
        data2.put("username", "井上r");
        data2.put("userid", "ijdsbf");
        listData.add(data2);


        sAdapter = new SimpleAdapter(this, listData,
                R.layout.activity_approval_pending_follow_list_row,
                new String[]{"usericon", "username", "userid"},
                new int[]{R.id.userView, R.id.userName, R.id.userId});
        lv = (ListView) findViewById(R.id.applicatedFollowList);
        lv.setAdapter(sAdapter);
    }
}
package com.example.admin.fragment_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InforActivity extends AppCompatActivity {
    Fragment_Content fragment_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);
        fragment_content = (Fragment_Content) getFragmentManager().findFragmentById(R.id.fragmentContent);
        Intent intent = getIntent();
        String getURL = intent.getStringExtra("link");
        fragment_content.SetURL(getURL);
    }
}

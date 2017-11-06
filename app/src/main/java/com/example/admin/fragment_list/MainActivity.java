package com.example.admin.fragment_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements StringURL {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void LoadURL(String link) {
        Fragment_Content fragment_content = (Fragment_Content) getFragmentManager().findFragmentById(R.id.fragmentContent);
        if(fragment_content != null){
            fragment_content.SetURL(link);
        }else {
            Intent intent = new Intent(this,InforActivity.class);
            intent.putExtra("link",link);
            startActivity(intent);
        }

    }
}

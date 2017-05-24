package com.codeclan.code.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TopCloudTechnologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cloud_tech_list);

        TopCloudTechnology cloudTechList = new TopCloudTechnology();
        ArrayList<CloudTechnology>  list = cloudTechList.getList();


        TopCloudTechnologyAdapter cloudTechAdapter = new TopCloudTechnologyAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cloudTechAdapter);
    }

    public void getCloudTechnology(View listItem){
        CloudTechnology cloudTech = (CloudTechnology) listItem.getTag();
        Log.d("Cloud Technology name: ", cloudTech.getName());
    }
}

package com.codeclan.code.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopCloudTechnologyAdapter extends ArrayAdapter<CloudTechnology> {

    public TopCloudTechnologyAdapter(Context context, ArrayList<CloudTechnology> cloudTechnologies){
        super(context, 0, cloudTechnologies);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.cloud_tech_item, parent, false);
        }

        CloudTechnology currentCloudTechnology = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(String.valueOf(currentCloudTechnology.getRanking()));

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentCloudTechnology.getName());

        TextView category =  (TextView) listItemView.findViewById(R.id.category);
        category.setText(currentCloudTechnology.getCategory());

        TextView year =  (TextView) listItemView.findViewById(R.id.year);
        year.setText(String.valueOf(currentCloudTechnology.getYear()));

        listItemView.setTag(currentCloudTechnology);
        return listItemView;
    }
}

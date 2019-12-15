package com.example.notetakingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EventAdapter extends ArrayAdapter<Event> {
    private  int resourced;

    public EventAdapter(@NonNull Context context, int resource, @NonNull List<Event> objects ){
        super(context, resource, objects);
        this.resourced = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Event event = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourced,parent,false);
        TextView user = (TextView) view.findViewById(R.id.tvUser);
        TextView context = (TextView) view.findViewById(R.id.tvContext);
        GridView imageGridView = (GridView) view.findViewById(R.id.image_gridview);
        return view;
    }
}

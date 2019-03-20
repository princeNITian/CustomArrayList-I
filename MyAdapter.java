package com.example.prince.hsam9;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    ArrayList<Item> arrayList = new ArrayList<>();
    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Item> objects) {
        super(context, resource, objects);
        arrayList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View view = convertView;
        convertView = inflater.inflate(R.layout.list_view_items,null);
        ImageView icon = (ImageView)convertView.findViewById(R.id.imageView);
        icon.setImageResource(arrayList.get(position).getImage());
        TextView text = (TextView) convertView.findViewById(R.id.textView);
        text.setText(arrayList.get(position).getName());
        return convertView;

    }
}

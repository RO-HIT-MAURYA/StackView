package com.citizencenter.stackview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class StackAdapter extends ArrayAdapter<StackItem> {
    private ArrayList<StackItem> items;
    private Context con;

    public StackAdapter(Context context, int resource, ArrayList<StackItem> objects) {
        super(context, resource, objects);

        this.items = objects;
        this.con = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list, null);
        }

        StackItem stackItem = items.get(position);

        if (stackItem != null) {
            TextView textView = view.findViewById(R.id.textView);
            ImageView imageView = view.findViewById(R.id.imageView);

            if (textView != null) {
                textView.setText(stackItem.txt);
                imageView.setImageDrawable(stackItem.img);
            }
        }

        return view;
    }
}

package com.citizencenter.stackview;

import android.arch.lifecycle.ViewModelStore;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.StackView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    StackView stackView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stackView = findViewById(R.id.stackView);
        ArrayList<StackItem> items = new ArrayList<>();

        items.add(new StackItem("image1", ContextCompat.getDrawable(this,R.drawable.error)));
        items.add(new StackItem("image2", ContextCompat.getDrawable(this,R.drawable.loading)));
        items.add(new StackItem("image3", ContextCompat.getDrawable(this,R.drawable.one)));
        items.add(new StackItem("image4", ContextCompat.getDrawable(this,R.drawable.two)));
        items.add(new StackItem("image5", ContextCompat.getDrawable(this,R.drawable.three)));

        StackAdapter adapt = new StackAdapter(this,R.layout.list,items);

        stackView.setAdapter(adapt);
    }
}

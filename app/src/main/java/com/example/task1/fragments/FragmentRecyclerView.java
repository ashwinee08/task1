package com.example.task1.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task1.R;
import com.example.task1.adapters.RecyclerViewAdapter;
import com.example.task1.interfaces.ChangePicture;

public class FragmentRecyclerView extends Fragment{

    private RecyclerView recyclerView;
    private Context context;
    private String[] texts={
            "Watermelon",
            "Apple",
            "Banana",
            "Orange",
            "Strawberry",
            "Watermelon",
            "Apple",
            "Banana",
            "Orange",
            "Strawberry"
    };
    private int[] images={
            R.drawable.watermelon,
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.orange,
            R.drawable.straw,
            R.drawable.watermelon,
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.orange,
            R.drawable.straw
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.recycler_view_layout,container,false);
        recyclerView=view.findViewById(R.id.recyceler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RecyclerViewAdapter(context,images,texts));
        return view;
    }
}

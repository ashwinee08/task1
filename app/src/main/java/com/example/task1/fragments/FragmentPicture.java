package com.example.task1.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task1.R;
import com.example.task1.interfaces.ChangePicture;

public class FragmentPicture extends Fragment implements ChangePicture {


    private  Context context;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.picture_layout,container,false);
        return view;
    }


    @Override
    public void changeThePictureWithId(int id) {

    }
}

package com.example.task1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.task1.interfaces.ChangePicture;

public class MainActivity extends AppCompatActivity implements ChangePicture{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void changeThePictureWithId(View v) {
        ImageView imageView=findViewById(R.id.image_to_be_shown);
        ImageView imageViewToBeShownNow=v.findViewById(R.id.image_in_list);
        imageView.setImageDrawable(imageViewToBeShownNow.getDrawable());

        Toast.makeText(this,"We are in the Main Activity", Toast.LENGTH_SHORT).show();
    }
}

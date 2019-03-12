package com.example.task1.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.task1.MainActivity;
import com.example.task1.R;
import com.example.task1.interfaces.ChangePicture;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>  {


    private Context context;
    private ChangePicture changePicture= (ChangePicture) context;
    private int[] images;
    private String[] texts;
    public RecyclerViewAdapter(Context context,int[] images, String[] texts){
        this.context=context;
        this.images =images;
        this.texts=texts;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_inner_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
        recyclerViewHolder.imageView.setImageResource(images[i]);
        recyclerViewHolder.textView.setText(texts[i]);
    }

    @Override
    public int getItemCount() {
        return texts.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView textView;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_in_list);
            textView=itemView.findViewById(R.id.text_for_image);
        }

        @Override
        public void onClick(View v) {
           
        }
    }
}

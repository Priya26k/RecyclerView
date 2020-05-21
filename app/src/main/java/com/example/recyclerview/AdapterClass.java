package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {

    private ArrayList<ModelClass> modelClasses;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelClasses, Context context) {
        this.modelClasses = modelClasses;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.ViewHolder holder, int position) {
        ModelClass modelClass = modelClasses.get(position);
        holder.textView.setText(modelClass.getText());
        holder.imageView.setImageResource(modelClass.getDrawable());
    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View view) {
            super(view);
            textView = (TextView)view.findViewById(R.id.textView);
            imageView = (ImageView)view.findViewById(R.id.imageview);
        }
    }
}

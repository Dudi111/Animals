package com.example.animals;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {
    private ArrayList<Animals> animalslist;
    private clickListener clicklistener;

    public AnimalAdapter(ArrayList<Animals> animalslist,clickListener clicklistener) {
        this.animalslist = animalslist;
        this.clicklistener=clicklistener;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);
        return new AnimalHolder(view,clicklistener);

    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder holder, int position) {
        Animals animals=animalslist.get(position);
        holder.setdata(animals);

    }

    @Override
    public int getItemCount() {
        return animalslist.size();
    }
}

package com.example.animals;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalHolder extends RecyclerView.ViewHolder {
    private ImageView ivimage;
    private TextView tvnaam;
    private TextView tvawaj;
    private RelativeLayout relative;
    private clickListener clicklistener;

    public AnimalHolder(@NonNull  View itemView, clickListener clicklistener) {
        super(itemView);
        this.clicklistener=clicklistener;
        init(itemView);
    }

    private void init(View itemView){
        ivimage=itemView.findViewById(R.id.ivAnimalImg);
        tvnaam=itemView.findViewById(R.id.tvName);
        tvawaj=itemView.findViewById(R.id.tvsound);
        relative=itemView.findViewById(R.id.relative);

    }
    public void setdata(Animals animal) {
      ivimage.setImageResource(animal.getImage());
        tvnaam.setText(animal.getName());
        tvawaj.setText(animal.getSound());
      relative.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              clicklistener.onitemclicked(animal,getAdapterPosition());
          }
      });
    }

}

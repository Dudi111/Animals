package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements clickListener {
    private RecyclerView recycle;
    private ArrayList<Animals> animalsList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini();
        buildlist();
        recyclerview();
    }
    private void ini(){
        recycle=findViewById(R.id.Recycler);
    }
    private void buildlist(){
      Animals animals=new Animals("Lion","Roar",R.drawable.lion);
      animalsList.add(animals);

        Animals animals2=new Animals("Camel","boooo",R.drawable.camel);
        animalsList.add(animals2);
        Animals animals3=new Animals("Horse","neigh",R.drawable.horse);
        animalsList.add(animals3);

        Animals animals5=new Animals("Tiger","snarl",R.drawable.tiger);
        animalsList.add(animals5);
        Animals animals6=new Animals("Zebra","neigh",R.drawable.zebra);
        animalsList.add(animals6);
        Animals animals7=new Animals("Giraffe","bleat",R.drawable.giraffe);
        animalsList.add(animals7);
        Animals animals8=new Animals("Deer","buck",R.drawable.deer);
        animalsList.add(animals8);
        Animals animals9=new Animals("Elephant","trumpet",R.drawable.ele2);
        animalsList.add(animals9);
        Animals animals10=new Animals("Lion","Roar",R.drawable.lion);
        animalsList.add(animals10);

        Animals animals12=new Animals("Camel","boooo",R.drawable.camel);
        animalsList.add(animals12);
        Animals animals13=new Animals("Horse","neigh",R.drawable.horse);
        animalsList.add(animals13);

        Animals animals15=new Animals("Tiger","snarl",R.drawable.tiger);
        animalsList.add(animals15);
        Animals animals16=new Animals("Zebra","neigh",R.drawable.zebra);
        animalsList.add(animals16);
        Animals animals17=new Animals("Giraffe","bleat",R.drawable.giraffe);
        animalsList.add(animals17);
        Animals animals18=new Animals("Deer","buck",R.drawable.deer);
        animalsList.add(animals18);
        Animals animals19=new Animals("Elephant","trumpet",R.drawable.ele2);
        animalsList.add(animals19);

    }
    private void recyclerview() {
        AnimalAdapter studentadap = new AnimalAdapter(animalsList,this);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this,2);
        recycle.setLayoutManager(linearLayoutManager);
        recycle.setAdapter(studentadap);

    }

    @Override
    public void onitemclicked(Animals animals,int position) {
        Toast.makeText(this,animals.getName(),Toast.LENGTH_SHORT).show();
    }
}
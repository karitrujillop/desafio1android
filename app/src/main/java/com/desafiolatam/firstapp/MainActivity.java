package com.desafiolatam.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView miimagen= findViewById(R.id.miImagen);


        Picasso.get().load("https:/unsplash.com/photos/nVsvIhl4fSc").into(miimagen);

        Button mibotoncito = findViewById(R.id.mi_button);


        mibotoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Usuario Ingresado con éxito", Toast.LENGTH_SHORT).show();


                //intentExample();


            }


        });
    }

    //private void intentExample(){
        //Intent intent= new Intent(  this, Main2Activity.class);
        //startActivity(intent);
    }





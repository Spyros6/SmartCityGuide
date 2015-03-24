package com.example.smartcityguide;


import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    

     Button btnRestaurant = (Button)findViewById(R.id.btnRestaurant);
     btnRestaurant.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Restaurant.class);
    startActivity(intent);
    }
    });
     
     Button btnHair = (Button)findViewById(R.id.btnHair);
     btnHair.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, HairCare.class);
    startActivity(intent);
    }
    });
     
     Button btnCafe = (Button)findViewById(R.id.btnCafe);
     btnCafe.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Cafe.class);
    startActivity(intent);
    }
    });
     
     Button btnCinemas = (Button)findViewById(R.id.btnCinemas);
     btnCinemas.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Cinemas.class);
    startActivity(intent);
    }
    });
     
     Button btnFastFood = (Button)findViewById(R.id.btnFastFood);
     btnFastFood.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, FastFood.class);
    startActivity(intent);
    }
    });
     
     Button btnFuel = (Button)findViewById(R.id.btnFuel);
     btnFuel.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Fuel.class);
    startActivity(intent);
    }
    });
     
     Button btnSuperMarkets = (Button)findViewById(R.id.btnSuperMarkets);
     btnSuperMarkets.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, SuperMarkets.class);
    startActivity(intent);
    }
    });
     
     Button btnBakery = (Button)findViewById(R.id.btnBakery);
     btnBakery.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Bakery.class);
    startActivity(intent);
    }
    });
     
     Button btnAuto = (Button)findViewById(R.id.btnAuto);
     btnAuto.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, AutoRepairs.class);
    startActivity(intent);
    }
    });
     
     Button btnBanks = (Button)findViewById(R.id.btnBanks);
     btnBanks.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Banks.class);
    startActivity(intent);
    }
    });
     
     Button btnPharmacy = (Button)findViewById(R.id.btnPharmacy);
     btnPharmacy.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Pharmacy.class);
    startActivity(intent);
    }
    });
     
     Button btnBars = (Button)findViewById(R.id.btnBars);
     btnBars.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity.this, Bars.class);
    startActivity(intent);
    }
    });
     
     
}
   
}
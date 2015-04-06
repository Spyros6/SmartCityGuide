package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Restaurant extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_restaurant);
	
	

	     Button btnArguroupolis1 = (Button)findViewById(R.id.btnArguroupolis1);
	     btnArguroupolis1.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Restaurant.this, ArguroupolisRestaurant.class);
	    startActivity(intent);
	    }
	    });
	     
	     Button btnHelliniko1 = (Button)findViewById(R.id.btnHelliniko1);
	     btnHelliniko1.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Restaurant.this, HellinikoRestaurant.class);
	    startActivity(intent);
	    }
	    });
	 }
	

	
}

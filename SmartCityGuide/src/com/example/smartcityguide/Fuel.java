package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Fuel extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fuel);
	

		  Button btnArguroupolis6 = (Button)findViewById(R.id.btnArguroupolis6);
		     btnArguroupolis6.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Fuel.this, ArgyroupolisFuel.class);
		    startActivity(intent);
		    }
		    });
		     
		     Button btnHelliniko6 = (Button)findViewById(R.id.btnHelliniko6);
		     btnHelliniko6.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Fuel.this, HellinikoFuel.class);
		    startActivity(intent);
		    }
		    });
		 }
	

	
}

package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cinemas extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cinemas);
	
		 Button btnArgyroupolis4 = (Button)findViewById(R.id.btnArgyroupolis4);
	     btnArgyroupolis4.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Cinemas.this, ArgyroupolisCinemas.class);
	    startActivity(intent);
	    }
	    });
	     
	     Button btnHelliniko4 = (Button)findViewById(R.id.btnHelliniko4);
	     btnHelliniko4.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Cinemas.this, HellinikoCinemas.class);
	    startActivity(intent);
	    }
	    });
	}

	
}

package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cafe extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cafe);
	
		 Button btnArguroupolis3 = (Button)findViewById(R.id.btnArgyroupolis3);
	     btnArguroupolis3.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Cafe.this, ArgyroupolisCafe.class);
	    startActivity(intent);
	    }
	    });
	     
	     Button btnHelliniko3 = (Button)findViewById(R.id.btnHelliniko3);
	     btnHelliniko3.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Cafe.this, HellinikoCafe.class);
	    startActivity(intent);
	    }
	    });
	}

	

	
}

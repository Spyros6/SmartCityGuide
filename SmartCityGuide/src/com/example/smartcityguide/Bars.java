package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Bars extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bars);
	

		  Button btnArguroupolis = (Button)findViewById(R.id.btnArgyroupolis);
		     btnArguroupolis.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Bars.this, ArgyroupolisBars.class);
		    startActivity(intent);
		    }
		    });
		     
		     Button btnHelliniko = (Button)findViewById(R.id.btnHelliniko);
		     btnHelliniko.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Bars.this, HellinikoBars.class);
		    startActivity(intent);
		    }
		    });
	}

	
}

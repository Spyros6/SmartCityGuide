package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Bakery extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bakery);
	

		  Button btnArguroupolis8 = (Button)findViewById(R.id.btnArguroupolis8);
		     btnArguroupolis8.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Bakery.this, ArgyroupolisBakery.class);
		    startActivity(intent);
		    }
		    });
		     
		     Button btnHelliniko8 = (Button)findViewById(R.id.btnHelliniko8);
		     btnHelliniko8.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Bakery.this, HellinikoBakery.class);
		    startActivity(intent);
		    }
		    });
	}

	
}

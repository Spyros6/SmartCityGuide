package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Banks extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_banks);
	

		     Button btnArguroupolis10 = (Button)findViewById(R.id.btnArguroupolis10);
		     btnArguroupolis10.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Banks.this, ArgyroupolisBanks.class);
		    startActivity(intent);
		    }
		    });
		     
		     Button btnHelliniko10 = (Button)findViewById(R.id.btnHelliniko10);
		     btnHelliniko10.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Banks.this, HellinikoBanks.class);
		    startActivity(intent);
		    }
		    });
	}

	
}

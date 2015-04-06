package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Pharmacy extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pharmacy);
	

		  Button btnArguroupolis11 = (Button)findViewById(R.id.btnArguroupolis11);
		     btnArguroupolis11.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Pharmacy.this, ArgyroupolisPharmacy.class);
		    startActivity(intent);
		    }
		    });
		     
		     Button btnHelliniko11 = (Button)findViewById(R.id.btnHelliniko11);
		     btnHelliniko11.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(Pharmacy.this, HellinikoPharmacy.class);
		    startActivity(intent);
		    }
		    });
	}

	
}

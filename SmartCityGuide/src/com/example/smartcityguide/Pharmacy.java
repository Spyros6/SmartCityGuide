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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pharmacy, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

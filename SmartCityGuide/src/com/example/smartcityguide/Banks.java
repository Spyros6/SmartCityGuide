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

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.banks, menu);
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

package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Doctors extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_doctors);
	
		 Button btnArguroupolis2 = (Button)findViewById(R.id.btnArguroupolis2);
	     btnArguroupolis2.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Doctors.this, ArgyroupolisDoctors.class);
	    startActivity(intent);
	    }
	    });
	     
	     Button btnHelliniko2 = (Button)findViewById(R.id.btnHelliniko2);
	     btnHelliniko2.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(Doctors.this, HellinikoDoctors.class);
	    startActivity(intent);
	    }
	    });
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.doctors, menu);
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

package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AutoRepairs extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_repairs);
	

		  Button btnArguroupolis9 = (Button)findViewById(R.id.btnArguroupolis9);
		     btnArguroupolis9.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(AutoRepairs.this, ArgyroupolisAutoRepairs.class);
		    startActivity(intent);
		    }
		    });
		     
		     Button btnHelliniko9 = (Button)findViewById(R.id.btnHelliniko9);
		     btnHelliniko9.setOnClickListener(new OnClickListener() {

		    @Override
		    public void onClick(View v) {
		    Intent intent = new Intent(AutoRepairs.this, HellinikoAutoRepairs.class);
		    startActivity(intent);
		    }
		    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.auto_repairs, menu);
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

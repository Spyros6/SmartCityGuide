package com.example.smartcityguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AutoServiceArgyroupolis extends ActionBarActivity {

	@SuppressWarnings("unused")
	private Button callBtn;
	private Button webBtn;

	Button btnShowLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_auto_service_argyroupolis);

		Button callBtn = (Button) findViewById(R.id.btncall);
	    callBtn.setOnClickListener(new OnClickListener() 
	    {
			 	
	        @Override
			public void onClick(View v) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+30 2109939589"));
				startActivity(callIntent);
				
			   }
	    });

	    Button webBtn = (Button) findViewById(R.id.btnweb);
	    webBtn.setOnClickListener(new OnClickListener()
	    {

			@Override
			public void onClick(View v) {

				String url = "https://www.facebook.com/pages/Auto-Service-Tuning/156620619584?sk=timeline";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
	  }
	    	
	    });
		

	    Button btnShowLocation = (Button)findViewById(R.id.show_location);
	    btnShowLocation.setOnClickListener(new OnClickListener() {
	    
	   
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AutoServiceArgyroupolis.this, MapAutoService.class);
			    startActivity(intent);
			    }
			    });
	    	
	  }

	}









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

public class XaraArgyroupolis extends ActionBarActivity {

	@SuppressWarnings("unused")
	private Button callBtn;
	private Button webBtn;
	
	Button btnShowLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xara_argyroupolis);

		Button callBtn = (Button) findViewById(R.id.btncall);
	    callBtn.setOnClickListener(new OnClickListener() 
	    {
			 	
	        @Override
			public void onClick(View v) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+30  2109945450 "));
				startActivity(callIntent);
				
			   }
	    });

	    Button webBtn = (Button) findViewById(R.id.btnweb);
	    webBtn.setOnClickListener(new OnClickListener()
	    {

			@Override
			public void onClick(View v) {

				String url = "http://www.vrisko.gr/details/5f1b0g72bd_g3e_17g6ga7d65b4kb46_?what=%CE%91%CF%81%CF%84%CE%BF%CF%80%CE%BF%CE%B9%CE%B5%CE%AF%CE%B1%20%CE%A6%CE%BF%CF%8D%CF%81%CE%BD%CE%BF%CE%B9&where=%CE%91%CF%81%CE%B3%CF%85%CF%81%CE%BF%CF%8D%CF%80%CE%BF%CE%BB%CE%B7";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
	  }
	    	
	    });
		

	    Button btnShowLocation = (Button)findViewById(R.id.show_location);
	    btnShowLocation.setOnClickListener(new OnClickListener() {
	    
	   
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(XaraArgyroupolis.this, MapXaraArgyroupolis.class);
			    startActivity(intent);
			    }
			    });
	    	
	  }
	
}


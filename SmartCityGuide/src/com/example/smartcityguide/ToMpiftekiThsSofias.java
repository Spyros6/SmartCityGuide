package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ToMpiftekiThsSofias extends ActionBarActivity {

	@SuppressWarnings("unused")
	private Button callBtn;
	private Button webBtn;

	Button btnShowLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_to_mpifteki_ths_sofias);

		Button callBtn = (Button) findViewById(R.id.btncall);
	    callBtn.setOnClickListener(new OnClickListener() 
	    {
			 	
	        @Override
			public void onClick(View v) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+30 2109924928 "));
				startActivity(callIntent);
				
			   }
	    });

	    Button webBtn = (Button) findViewById(R.id.btnweb);
	    webBtn.setOnClickListener(new OnClickListener()
	    {

			@Override
			public void onClick(View v) {

				String url = "http://www.thelosouvlakia.gr/delivery_%CE%91%CF%84%CF%84%CE%B9%CE%BA%CE%AE_%CE%91%CF%81%CE%B3%CF%85%CF%81%CE%BF%CF%8D%CF%80%CE%BF%CE%BB%CE%B7_%CE%A4%CE%9F_%CE%9C%CE%A0%CE%99%CE%A6%CE%A4%CE%95%CE%9A%CE%99_%CE%A4%CE%97%CE%A3_%CE%A3%CE%9F%CE%A6%CE%99%CE%91%CE%A3_v-2819-1,93.aspx#";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
	  }
	    	
	    });
		

	    Button btnShowLocation = (Button)findViewById(R.id.show_location);
	    btnShowLocation.setOnClickListener(new OnClickListener() {
	    
	   
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ToMpiftekiThsSofias.this, MapMpiftekiSofias.class);
			    startActivity(intent);
			    }
			    });
	    	
	  }

	}








		 
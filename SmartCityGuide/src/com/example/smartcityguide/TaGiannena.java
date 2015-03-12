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

public class TaGiannena extends ActionBarActivity {

	@SuppressWarnings("unused")
	private Button callBtn;
	private Button webBtn;
	
	Button btnShowLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ta_giannena);

		Button callBtn = (Button) findViewById(R.id.btncall);
	    callBtn.setOnClickListener(new OnClickListener() 
	    {
			 	
	        @Override
			public void onClick(View v) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+30  2109619202 "));
				startActivity(callIntent);
				
			   }
	    });

	    Button webBtn = (Button) findViewById(R.id.btnweb);
	    webBtn.setOnClickListener(new OnClickListener()
	    {

			@Override
			public void onClick(View v) {

				String url = "https://www.facebook.com/pages/%CE%91%CF%81%CF%84%CE%BF%CF%80%CE%BF%CE%B9%CE%B5%CE%AF%CE%BF-%CE%96%CE%B1%CF%87%CE%B1%CF%81%CE%BF%CF%80%CE%BB%CE%B1%CF%83%CF%84%CE%B5%CE%AF%CE%BF-%CE%A4%CE%B1-%CE%93%CE%B9%CE%AC%CE%BD%CE%BD%CE%B5%CE%BD%CE%B1/283348305045798";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
	  }
	    	
	    });
		

	    Button btnShowLocation = (Button)findViewById(R.id.show_location);
	    btnShowLocation.setOnClickListener(new OnClickListener() {
	    
	   
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(TaGiannena.this, MapTaGiannena.class);
			    startActivity(intent);
			    }
			    });
	    	
	  }
	
}


	
	



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

public class EllhnikoBakery extends ActionBarActivity {

	@SuppressWarnings("unused")
	private Button callBtn;
	private Button webBtn;
	
	Button btnShowLocation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ellhniko_bakery);
	
		Button callBtn = (Button) findViewById(R.id.btncall);
	    callBtn.setOnClickListener(new OnClickListener() 
	    {
			 	
	        @Override
			public void onClick(View v) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+30 2109618587 "));
				startActivity(callIntent);
				
			   }
	    });

	    Button webBtn = (Button) findViewById(R.id.btnweb);
	    webBtn.setOnClickListener(new OnClickListener()
	    {

			@Override
			public void onClick(View v) {

				String url = "https://www.facebook.com/pages/%CE%91%CF%81%CF%84%CE%BF%CF%80%CE%BF%CE%B9%CE%90%CE%B1-%CE%96%CE%B1%CF%87%CE%B1%CF%81%CE%BF%CF%80%CE%BB%CE%B1%CF%83%CF%84%CE%B9%CE%BA%CE%AE-%CE%93%CF%8C%CF%84%CF%83%CE%B7%CF%82-%CE%92-%CE%A7%CF%81%CE%AE%CF%83%CF%84%CE%BF%CF%82/861873977198795";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
	  }
	    	
	    });
		

	    Button btnShowLocation = (Button)findViewById(R.id.show_location);
	    btnShowLocation.setOnClickListener(new OnClickListener() {
	    
	   
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(EllhnikoBakery.this, MapEllinikon.class);
			    startActivity(intent);
			    }
			    });
	    	
	  }
	
}


	
	



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

public class GiourasBakery extends ActionBarActivity {

	@SuppressWarnings("unused")
	private Button callBtn;
	private Button webBtn;
	
	Button btnShowLocation;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_giouras_bakery);

		Button callBtn = (Button) findViewById(R.id.btncall);
	    callBtn.setOnClickListener(new OnClickListener() 
	    {
			 	
	        @Override
			public void onClick(View v) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:+30 2109618893  "));
				startActivity(callIntent);
				
			   }
	    });

	    Button webBtn = (Button) findViewById(R.id.btnweb);
	    webBtn.setOnClickListener(new OnClickListener()
	    {

			@Override
			public void onClick(View v) {

				String url = "http://www.magiclamp.gr/categories/stores-companies?pid=637&sid=2105:%CE%9F-%CE%A6%CE%BF%CF%8D%CF%81%CE%BD%CE%BF%CF%82-%CE%A4%CE%BF%CF%85-%CE%93%CE%B9%CE%BF%CF%8D%CF%81%CE%B1-%CE%91%CF%81%CF%84%CE%BF%CF%80%CE%BF%CE%B9%CE%B5%CE%AF%CE%BF";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
	  }
	    	
	    });
		

	    Button btnShowLocation = (Button)findViewById(R.id.show_location);
	    btnShowLocation.setOnClickListener(new OnClickListener() {
	    
	   
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(GiourasBakery.this, MapGiouras.class);
			    startActivity(intent);
			    }
			    });
	    	
	  }
	
}


	
	



		
package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FastFood extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fast_food);
	
		 Button btnArguroupolis5 = (Button)findViewById(R.id.btnArguroupolis5);
	     btnArguroupolis5.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(FastFood.this, ArgyroupolisFastFood.class);
	    startActivity(intent);
	    }
	    });
	     
	     Button btnHelliniko5 = (Button)findViewById(R.id.btnHelliniko5);
	     btnHelliniko5.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {
	    Intent intent = new Intent(FastFood.this, HellinikoFastFood.class);
	    startActivity(intent);
	    }
	    });
	}

	
}

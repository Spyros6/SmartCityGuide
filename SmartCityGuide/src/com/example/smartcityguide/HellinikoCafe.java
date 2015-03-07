package com.example.smartcityguide;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class HellinikoCafe extends ListActivity {

	String arr[] = {"Terminal Cafe" ,
			"Coffee Island" ,
			"Whispers Cafe" ,
			"Sorhdon" , 
			"Replay Cafe Bistro",
			"Sis Cafe"};
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_helliniko_cafe);
		l=getListView();	
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);	
		l.setAdapter(adapter);
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
	     super.onListItemClick(l, v, position, id);
	     
	     if (position == 0) {
	    		Intent intent = new Intent(this, TerminalCafe.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 1) {
	    		Intent intent = new Intent(this, CoffeeIslandHelliniko.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 2) {
	    		Intent intent = new Intent(this, WhispersCafe.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 3) {
	    		Intent intent = new Intent(this, Sorhdon.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 4) {
	    		Intent intent = new Intent(this, ReplayCafeBistro.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 5) {
	    		Intent intent = new Intent(this, SisCafe.class);
	    		startActivity(intent);
	    		}
	}
	


	
}

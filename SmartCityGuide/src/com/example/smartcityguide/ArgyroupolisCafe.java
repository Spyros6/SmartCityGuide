package com.example.smartcityguide;

import android.support.v7.app.ActionBarActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArgyroupolisCafe extends ListActivity {

	String arr[] = {"I Cafe Bar", 
			"Eterno Cafe Bar" ,
			"Inverso" ,
			"Besito Cafe" , 
			"Hug Cafe" ,
			"Antithesis Cafe" ,
			"Siempre Cafe",
			"All Piccolo",
			"Coffe Island",
			"Vintage Cafe Bar"};
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_argyroupolis_cafe);
		l=getListView();	
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);	
		l.setAdapter(adapter);
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
	     super.onListItemClick(l, v, position, id);

	     if (position == 0) {
	    		Intent intent = new Intent(this, ICafeBar.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 1) {
	    		Intent intent = new Intent(this, EternoCafeBar.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 2) {
	    		Intent intent = new Intent(this, Inverso.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 3) {
	    		Intent intent = new Intent(this, BesitoCafe.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 4) {
	    		Intent intent = new Intent(this, HugCafe.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 5) {
	    		Intent intent = new Intent(this, AntithesisCafe.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 6) {
	    		Intent intent = new Intent(this, SiempreCafe.class);
	    		startActivity(intent);
	    		}
	     if (position == 7) {
	    		Intent intent = new Intent(this, AllPiccolo.class);
	    		startActivity(intent);
	    		}
	     if (position == 8) {
	    		Intent intent = new Intent(this, CoffeeIsland.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 9) {
	    		Intent intent = new Intent(this, VintageCafeBar.class);
	    		startActivity(intent);
	    		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.argyroupolis_cafe, menu);
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

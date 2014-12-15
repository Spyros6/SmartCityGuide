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

public class ArgyroupolisBars extends ListActivity {

	String arr[] = {"Erotimatiko", 
			"Mparallou" ,
			"Barrel Haus" ,
			"Vale Vale" ,
			"Fabrica",
			"Hug Cafe Bar",
			"I Cafe Bar"};
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_argyroupolis_bars);
		l=getListView();	
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);	
		l.setAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
	     super.onListItemClick(l, v, position, id);

	     if (position == 0) {
	    		Intent intent = new Intent(this, ErotimatikoArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     if (position == 1) {
	    		Intent intent = new Intent(this, MparallouArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     if (position == 2) {
	    		Intent intent = new Intent(this, BarrelHausArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     if (position == 3) {
	    		Intent intent = new Intent(this, ValeValeArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     if (position == 4) {
	    		Intent intent = new Intent(this, FabricaArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     if (position == 5) {
	    		Intent intent = new Intent(this, ICafeBar.class);
	    		startActivity(intent);
	    		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.argyroupolis_bars, menu);
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

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

public class ArgyroupolisFastFood extends ListActivity {

	String arr[] = { 
			"Stash Kalamaki" ,
			"Thurio Souvlaki Bar" ,
			"O Leuteris" ,
			"O Mpaltas" ,
			"Oi Pites tou Ntenh" ,
			"Nostimies",
			"GiaSouvlaki",
			"Goody's",
			"Everest",
			"Yammi Yammi",
			"Vegas Burger",
			"Twenty 11",
			"Oi Pites ths Gewrgias"};
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_argyroupolis_fast_food);
		l=getListView();	
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);	
		l.setAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
	     super.onListItemClick(l, v, position, id);

	     if (position == 0) {
	    		Intent intent = new Intent(this, StashKalamaki.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 1) {
	    		Intent intent = new Intent(this, ThurioSouvlakiBar.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 2) {
	    		Intent intent = new Intent(this, LefterisArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 3) {
	    		Intent intent = new Intent(this, Mpaltas.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 4) {
	    		Intent intent = new Intent(this, PitesTouNtenh.class);
	    		startActivity(intent);
	    		}
	   
	     if (position == 5) {
	    		Intent intent = new Intent(this, Nostimies.class);
	    		startActivity(intent);
	    		}
	     if (position == 6) {
	    		Intent intent = new Intent(this, GiaSouvlaki.class);
	    		startActivity(intent);
	    		}
	     if (position == 7) {
	    		Intent intent = new Intent(this, GoodysArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     if (position == 8) {
	    		Intent intent = new Intent(this, EverestArgyroupolis.class);
	    		startActivity(intent); 
	    		}
	     if (position == 9) {
	    		Intent intent = new Intent(this, YammiYammi.class);
	    		startActivity(intent);
	    		}
	     if (position == 10) {
	    		Intent intent = new Intent(this, VegasBurger.class);
	    		startActivity(intent);
	    		}
	     if (position == 11) {
	    		Intent intent = new Intent(this, Twenty11.class);
	    		startActivity(intent);
	    		}
	     if (position == 12) {
	    		Intent intent = new Intent(this, PitesThsGewrgias.class);
	    		startActivity(intent);
	    		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.argyroupolis_fast_food, menu);
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

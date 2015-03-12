package com.example.smartcityguide;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ArgyroupolisFastFood extends ListActivity {

	String arr[] = { 
			"Stash Kalamaki" ,
			"O Leuteris" ,
			"Oi Pites tou Ntenh" ,
			"GiaSouvlaki",
			"Goody's",
			"Everest",
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
	    		Intent intent = new Intent(this, LefterisArgyroupolis.class);
	    		startActivity(intent);
	     }
	     
	     if (position == 2) {
	    		Intent intent = new Intent(this, PitesTouNtenh.class);
	    		startActivity(intent);
	    		}
	  
	     if (position == 3) {
	    		Intent intent = new Intent(this, GiaSouvlaki.class);
	    		startActivity(intent);
	    		}
	     if (position == 4) {
	    		Intent intent = new Intent(this, GoodysArgyroupolis.class);
	    		startActivity(intent);
	    		}
	     if (position == 5) {
	    		Intent intent = new Intent(this, EverestArgyroupolis.class);
	    		startActivity(intent); 
	    		}

	     if (position == 6) {
	    		Intent intent = new Intent(this, PitesThsGewrgias.class);
	    		startActivity(intent);
	    		}
	}
	
}



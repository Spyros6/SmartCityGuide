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

public class ArguroupolisRestaurant extends ListActivity {

	String arr[] = {"Sousami", 
			"H Elia"
			, "La Pasteria" 
			, "Treis to Ladi..." 
			,"To Mpifteki ths Sofias"
			,"H Kouzina ths Plateias"};

	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arguroupolis_restaurant);
		l=getListView();	
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);	
		l.setAdapter(adapter);
		
	}

	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
	     super.onListItemClick(l, v, position, id);

	     if (position == 0) {
	    		Intent intent = new Intent(this, Sousami.class);
	    		startActivity(intent);
	    		}
	    
	     
	     if (position == 1) {
	    		Intent intent = new Intent(this, Elia.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 2) {
	    		Intent intent = new Intent(this, LaPasteria.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 3) {
	    		Intent intent = new Intent(this, TreisToLadi.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 4) {
	    		Intent intent = new Intent(this, ToMpiftekiThsSofias.class);
	    		startActivity(intent);
	    		}
	     
	     if (position == 5) {
	    		Intent intent = new Intent(this, KouzinaThsPlateias.class);
	    		startActivity(intent);
	    		}
	    
	}


}

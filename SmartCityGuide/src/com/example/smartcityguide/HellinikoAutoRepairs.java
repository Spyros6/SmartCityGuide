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

public class HellinikoAutoRepairs extends ListActivity {

	String arr[] = {"Service Tech Konidaris N.",
			    "Romanos Power" ,
			    "Servizi Italiani" , 
			    "Afoi Ntinou OE" ,
			    "Lampropoulos Georgios H." ,
			    "Palaiopanhs Eustratios & Sia OE" ,
			    "Kisandrakis Matthaios H.",
			    "Karakyrgiakos Argyrios G.",
			    "Dakar Service AE",
			    "GSM Service",
			    "Racing Service",
			    "Syrigos Nikolaos E.",
			    "Mauropoulos Dimitrios K."};
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_helliniko_auto_repairs);
		l=getListView();	
		ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);	
		l.setAdapter(adapter);
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
	     super.onListItemClick(l, v, position, id);

	     if (position == 0) {
	    		Intent intent = new Intent(this, ServiceTechHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 1) {
	    		Intent intent = new Intent(this, RomanosPowerHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 2) {
	    		Intent intent = new Intent(this, ServiziItalianiHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 3) {
	    		Intent intent = new Intent(this, NtinouHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 4) {
	    		Intent intent = new Intent(this, LampropoulosHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 5) {
	    		Intent intent = new Intent(this, PalaiopanhsHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 6) {
	    		Intent intent = new Intent(this, KisandrakisHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 7) {
	    		Intent intent = new Intent(this, KarakyrgiakosHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 8) {
	    		Intent intent = new Intent(this, DakarServiceHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 9) {
	    		Intent intent = new Intent(this, GSMServiceHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 10) {
	    		Intent intent = new Intent(this, RacingServiceHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 11) {
	    		Intent intent = new Intent(this, SyrigosHelliniko.class);
	    		startActivity(intent);
	    		}
	     if (position == 12) {
	    		Intent intent = new Intent(this, MauropoulosHelliniko.class);
	    		startActivity(intent);
	    		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.helliniko_auto_repairs, menu);
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

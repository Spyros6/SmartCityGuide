package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MapEverestEll extends Activity {

private final LatLng LOCATION_EVEREST_ELL = new LatLng(37.8908217 ,23.7607694);
	
	private GoogleMap mapeverestell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_everest_ell);
	
		mapeverestell = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapeverestell.addMarker(new MarkerOptions().position(LOCATION_EVEREST_ELL ).title("Dimitriou Gounari 46 kai Pontou, Elliniko  - 16777"));

}

       public void onClick_EverestEll(View v) {
	  mapeverestell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	   CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_EVEREST_ELL , 16);
	   mapeverestell.animateCamera(update);
	}

}


	
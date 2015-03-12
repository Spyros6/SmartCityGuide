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

public class MapTaGiannena extends Activity {

private final LatLng LOCATION_TA_GIANNENA= new LatLng(37.889615 ,23.76112);
	
	private GoogleMap maptagiannena;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_ta_giannena);

		maptagiannena = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maptagiannena.addMarker(new MarkerOptions().position(LOCATION_TA_GIANNENA ).title("Dimitriou Gounari 60, Elliniko  - 16777"));

}

       public void onClick_TaGiannena(View v) {
    	   maptagiannena.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	         CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TA_GIANNENA , 16);
	         maptagiannena.animateCamera(update);
	}

}

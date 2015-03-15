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

public class MapTreisToLadi extends  Activity {

private final LatLng LOCATION_TREIS_TO_LADI= new LatLng(37.908715 ,23.7498857);
	
	private GoogleMap maptreistoladi;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_treis_to_ladi);
	

		maptreistoladi = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maptreistoladi.addMarker(new MarkerOptions().position(LOCATION_TREIS_TO_LADI ).title("Ethnarchou Makariou 91, Argyroupoli - 16452"));

}

       public void onClick_TreisToLadi(View v) {
    	   maptreistoladi.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TREIS_TO_LADI , 16);
	       maptreistoladi.animateCamera(update);
	}

}

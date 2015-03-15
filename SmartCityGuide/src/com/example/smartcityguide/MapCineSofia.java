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

public class MapCineSofia extends Activity {

private final LatLng LOCATION_CINE_SOFIA= new LatLng(37.9054717 ,23.7509693);
	
	private GoogleMap mapcinesofia;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_cine_sofia);
	
		 mapcinesofia = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		 mapcinesofia.addMarker(new MarkerOptions().position(LOCATION_CINE_SOFIA ).title("Eustathiadi 2  kai  Plateia Agias Triados, Argyroupoli - 16452"));

}

       public void onClick_CineSofia(View v) {
    	   mapcinesofia.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CINE_SOFIA , 16);
	       mapcinesofia.animateCamera(update);
	}

}

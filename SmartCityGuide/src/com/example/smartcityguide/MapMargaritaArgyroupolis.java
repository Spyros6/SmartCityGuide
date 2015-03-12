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

public class MapMargaritaArgyroupolis extends Activity {

private final LatLng LOCATION_MARGARITA= new LatLng(37.9036233 ,23.7502854);
	
	private GoogleMap mapmargarita;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_margarita_argyroupolis);

		mapmargarita = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapmargarita.addMarker(new MarkerOptions().position(LOCATION_MARGARITA ).title("Marinou Geroulanou 103, Argyroupoli  - 16452"));

}

       public void onClick_Margarita(View v) {
    	   mapmargarita.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	         CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_MARGARITA , 16);
	         mapmargarita.animateCamera(update);
	}

}

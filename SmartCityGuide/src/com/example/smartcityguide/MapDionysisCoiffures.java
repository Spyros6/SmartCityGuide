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


public class MapDionysisCoiffures extends Activity {

	private final LatLng LOCATION_DIONYSIS_COIFFURES = new LatLng(37.892328,23.756971);

	private GoogleMap mapdionysiscoiffures;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_dionysis_coiffures);

		mapdionysiscoiffures = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapdionysiscoiffures.addMarker(new MarkerOptions().position(LOCATION_DIONYSIS_COIFFURES).title("Leoforos Iasonidou 57-59, Elliniko - 16777"));
	}

	public void onClick_DionysisCoiffures(View v) {
		mapdionysiscoiffures.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_DIONYSIS_COIFFURES  , 16);
		mapdionysiscoiffures.animateCamera(update);
		
	}
	
}


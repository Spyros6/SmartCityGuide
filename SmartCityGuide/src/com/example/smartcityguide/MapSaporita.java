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

public class MapSaporita extends Activity {

private final LatLng LOCATION_SAPORITA = new LatLng(37.8923321 ,23.7572606);
	
	private GoogleMap mapsaporita;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_saporita);
		
		mapsaporita = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsaporita.addMarker(new MarkerOptions().position(LOCATION_SAPORITA).title("Leoforos Iasonidou 56, Elliniko - 16777"));

	}
	
	public void onClick_Saporita(View v) {
		mapsaporita.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SAPORITA, 16);
		mapsaporita.animateCamera(update);
		
	}
	
}

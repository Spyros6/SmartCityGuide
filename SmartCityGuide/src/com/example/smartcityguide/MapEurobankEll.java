package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;

public class MapEurobankEll extends ActionBarActivity {

private final LatLng LOCATION_EUROBANK_ELL = new LatLng(37.8923303 ,23.7571359);
	
	private GoogleMap mapeurobankell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_eurobank_ell);
	
		mapeurobankell = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapeurobankell.addMarker(new MarkerOptions().position(LOCATION_EUROBANK_ELL).title("Leoforos Iasonidou 54 , Elliniko - 16777"));

	}
	
	public void onClick_EurobankEll(View v) {
		mapeurobankell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_EUROBANK_ELL, 16);
		mapeurobankell.animateCamera(update);
		
	}
	
}

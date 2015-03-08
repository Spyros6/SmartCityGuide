package com.example.smartcityguide;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MapSpuropoulos extends  Activity {

private final LatLng LOCATION_SPUROPOULOS = new LatLng(37.906472 ,23.741658);
	
	private GoogleMap mapspuropoulos;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_spuropoulos);

		mapspuropoulos = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapspuropoulos.addMarker(new MarkerOptions().position(LOCATION_SPUROPOULOS).title("Titanos 26, Elliniko - 16777"));

	}
	
	public void onClick_Spuropoulos(View v) {
		mapspuropoulos.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SPUROPOULOS, 16);
		mapspuropoulos.animateCamera(update);
		
	}
	
}

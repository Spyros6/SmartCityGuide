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

public class MapCarrefourMarinopoulosArg extends Activity {

private final LatLng LOCATION_MARINOPOULOS_ARG = new LatLng(37.913351,23.745142);
	
	private GoogleMap mapmarinopoulosarg;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_carrefour_marinopoulos_arg);
	
		mapmarinopoulosarg  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapmarinopoulosarg.addMarker(new MarkerOptions().position(LOCATION_MARINOPOULOS_ARG).title("Ethnarxou Makariou 11, Argyroupoli - 16452"));
	
	}

	public void onClick_MarinopoulosArg(View v) {
		mapmarinopoulosarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_MARINOPOULOS_ARG , 16);
		mapmarinopoulosarg.animateCamera(update);
		
	}
	
	
}

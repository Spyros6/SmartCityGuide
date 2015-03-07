package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MapBesitoCafe extends ActionBarActivity {

private final LatLng LOCATION_BESITO_CAFE = new LatLng(37.907027, 23.7482151);
	
	private GoogleMap mapbesitocafe;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_besito_cafe);
	
		mapbesitocafe  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapbesitocafe.addMarker(new MarkerOptions().position(LOCATION_BESITO_CAFE).title("28hs Oktomvriou kai Thrakis 10, Argyroupoli - 16452"));
	}

	public void onClick_BesitoCafe(View v) {
		mapbesitocafe.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BESITO_CAFE , 16);
		mapbesitocafe.animateCamera(update);
		
	}
}

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

public class MapTerminalCafe extends Activity {

private final LatLng LOCATION_TERMINAL = new LatLng(37.892195, 23.7483);
	
	private GoogleMap mapterminal;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_terminal_cafe);
	 
		mapterminal  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapterminal.addMarker(new MarkerOptions().position(LOCATION_TERMINAL).title("Leoforos Iasonidou 1, Elliniko - 16777"));
	
	}

	public void onClick_Terminal(View v) {
		mapterminal.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TERMINAL , 16);
		mapterminal.animateCamera(update);
		
	}
	
}

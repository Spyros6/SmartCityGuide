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

public class MapShell extends Activity {

private final LatLng LOCATION_SHELL = new LatLng(37.9150774, 23.7545534);
	
	private GoogleMap mapshell;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_shell);
	
		mapshell  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapshell.addMarker(new MarkerOptions().position(LOCATION_SHELL).title("Argyroupoleos 89, Argyroupoli - 16451"));
		
	}

	public void onClick_Shell(View v) {
		mapshell.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SHELL, 16);
		mapshell.animateCamera(update);
		
	}
	
}

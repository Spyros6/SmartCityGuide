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

public class MapVasilopoulosArg extends  Activity {

private final LatLng LOCATION_VASILOPOULOS_ARG = new LatLng(37.9123615,23.754604);
	
	private GoogleMap mapvasilopoulosarg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_vasilopoulos_arg);
	
		mapvasilopoulosarg  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapvasilopoulosarg.addMarker(new MarkerOptions().position(LOCATION_VASILOPOULOS_ARG).title("Argyroupoleos 63, Argyroupoli - 16451"));
	
	}

	public void onClick_VasilopoulosArg(View v) {
		mapvasilopoulosarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_VASILOPOULOS_ARG , 16);
		mapvasilopoulosarg.animateCamera(update);
		
	}

	
	
}

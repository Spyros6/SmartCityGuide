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

public class MapInversion extends Activity {

private final LatLng LOCATION_INVERSO = new LatLng(37.9060172, 23.748591);
	
	private GoogleMap mapinverso;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_inversion);
	

	mapinverso  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
	mapinverso.addMarker(new MarkerOptions().position(LOCATION_INVERSO).title("Alexioupolews 25, Argyroupoli - 16452"));
}


public void onClick_Inverso(View v) {
	mapinverso.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_INVERSO, 16);
	mapinverso.animateCamera(update);
	
}
}

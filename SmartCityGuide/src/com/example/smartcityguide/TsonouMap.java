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

public class TsonouMap extends Activity {

private final LatLng LOCATION_TSONOU = new LatLng(37.90965,23.755936);
	
	private GoogleMap maptsonou;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tsonou_map);

	
		maptsonou  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maptsonou.addMarker(new MarkerOptions().position(LOCATION_TSONOU).title("Peloponnhsou 116, Argyroupoli - 16451"));

	}
	
	public void onClick_Tsonou(View v) {
		maptsonou.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TSONOU, 16);
		maptsonou.animateCamera(update);
		
	}
}


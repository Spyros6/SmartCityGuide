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

public class MapNdrangheta extends Activity {

private final LatLng LOCATION_NDRANGHETA = new LatLng(37.8921297, 23.7498909);
	
	private GoogleMap mapndrangheta;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_ndrangheta);
	
		mapndrangheta  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapndrangheta.addMarker(new MarkerOptions().position(LOCATION_NDRANGHETA).title("Leoforos Iasonidou 10, Helliniko - 16777"));
	
	}

	public void onClick_Ndrangheta(View v) {
		mapndrangheta.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_NDRANGHETA , 16);
		mapndrangheta.animateCamera(update);
		
	}
	
}

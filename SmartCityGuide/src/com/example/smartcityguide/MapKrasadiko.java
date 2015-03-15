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

public class MapKrasadiko extends  Activity {

private final LatLng LOCATION_KRASADIKO = new LatLng(37.894746 ,23.751088);
	
	private GoogleMap mapkrasadiko;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_krasadiko);

		mapkrasadiko = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapkrasadiko.addMarker(new MarkerOptions().position(LOCATION_KRASADIKO).title("Rizountos 72, Elliniko - 16777"));

}

       public void onClick_Krasadiko(View v) {
    	
    	   mapkrasadiko.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_KRASADIKO , 16);
	       mapkrasadiko.animateCamera(update);
	}

}

  
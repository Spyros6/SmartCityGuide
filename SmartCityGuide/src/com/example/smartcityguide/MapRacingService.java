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

public class MapRacingService extends  Activity {

private final LatLng LOCATION_RACING_SERVICE = new LatLng(37.8953307 ,23.7578326);
	
	private GoogleMap mapracingservice;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_racing_service);
	
		mapracingservice = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapracingservice.addMarker(new MarkerOptions().position(LOCATION_RACING_SERVICE).title("Afroditis 93 , Elliniko - 16777"));

}

       public void onClick_RacingService(View v) {
    	
    	   mapracingservice.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_RACING_SERVICE, 16);
	       mapracingservice.animateCamera(update);
	}

}


		

	
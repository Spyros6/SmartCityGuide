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

public class MapCarTechnology extends Activity {

private final LatLng LOCATION_CAR_TECHNOLOGY = new LatLng(37.91702 ,23.7527966);
	
	private GoogleMap mapcartechnology;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_car_technology);

		mapcartechnology = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapcartechnology.addMarker(new MarkerOptions().position(LOCATION_CAR_TECHNOLOGY).title("Argyroupoleos 109 , Argyroupoli - 16451"));

}

       public void onClick_CarTechnology(View v) {
    	
    	   mapcartechnology.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CAR_TECHNOLOGY , 16);
	       mapcartechnology.animateCamera(update);
	}

}

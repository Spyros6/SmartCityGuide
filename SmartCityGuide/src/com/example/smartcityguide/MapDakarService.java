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

public class MapDakarService extends Activity {

private final LatLng LOCATION_DAKAR_SERVICE = new LatLng(37.8924583 ,23.7488578);
	
	private GoogleMap mapdakarservice;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_dakar_service);

		mapdakarservice = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapdakarservice.addMarker(new MarkerOptions().position(LOCATION_DAKAR_SERVICE).title("Chaldeias 49, Elliniko - 16777"));

}

       public void onClick_DakarService(View v) {
    	
    	   mapdakarservice.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_DAKAR_SERVICE , 16);
	       mapdakarservice.animateCamera(update);
	}

}


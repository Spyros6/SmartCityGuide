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

public class MapAutoService extends Activity {

private final LatLng LOCATION_AUTO_SERVICE = new LatLng(37.9115134 ,23.742256);
	
	private GoogleMap mapautoservice;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_auto_service);
   
		mapautoservice = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapautoservice.addMarker(new MarkerOptions().position(LOCATION_AUTO_SERVICE).title("Leontos 36 , Argyroupoli - 16452"));

}

       public void onClick_AutoService(View v) {
    	
    	   mapautoservice.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_AUTO_SERVICE , 16);
	       mapautoservice.animateCamera(update);
	}

}

  

		  
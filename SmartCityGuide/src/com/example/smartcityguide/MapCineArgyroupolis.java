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

public class MapCineArgyroupolis extends Activity {

private final LatLng LOCATION_CINE_ARGYROUPOLIS= new LatLng(37.9082472 ,23.7523674);
	
	private GoogleMap mapcineargyroupolis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_cine_argyroupolis);
		
		mapcineargyroupolis = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapcineargyroupolis.addMarker(new MarkerOptions().position(LOCATION_CINE_ARGYROUPOLIS ).title("Leoforos Kyprou 68 kai Dodekanhsou, Argyroupoli  - 16452"));

}

       public void onClick_CineArgyroupolis(View v) {
    	   mapcineargyroupolis.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CINE_ARGYROUPOLIS , 16);
	       mapcineargyroupolis.animateCamera(update);
	}

}

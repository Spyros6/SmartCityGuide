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

public class MapGSMService extends Activity {

private final LatLng LOCATION_GSM_SERVICE = new LatLng(37.9078209 ,23.7430616);
	
	private GoogleMap mapgsmservice;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_gsmservice);

		mapgsmservice = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapgsmservice.addMarker(new MarkerOptions().position(LOCATION_GSM_SERVICE).title("Komnhnon 11 , Elliniko - 16777"));

}

       public void onClick_GSMService(View v) {
    	
    	   mapgsmservice.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_GSM_SERVICE, 16);
	       mapgsmservice.animateCamera(update);
	}

}


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

public class MapKMService extends Activity {

private final LatLng LOCATION_KM_SERVICE = new LatLng(37.9037443 ,23.746038);
	
	private GoogleMap mapkmservice;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_kmservice);
	
		mapkmservice = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapkmservice.addMarker(new MarkerOptions().position(LOCATION_KM_SERVICE).title("Leoforos Vouliagmenis 26 , Argyroupoli - 16452"));

}

       public void onClick_KMService(View v) {
    	
    	   mapkmservice.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_KM_SERVICE , 16);
	       mapkmservice.animateCamera(update);
	}

}

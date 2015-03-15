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

public class MapJeepService extends Activity {

private final LatLng LOCATION_JEEP_SERVICE = new LatLng(37.914072 ,23.754819);
	
	private GoogleMap mapjeepservice;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_jeep_service);

		mapjeepservice = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapjeepservice.addMarker(new MarkerOptions().position(LOCATION_JEEP_SERVICE).title("Argyroupoleos 90A , Argyroupoli - 16451"));

}

       public void onClick_JeepService(View v) {
    	
    	   mapjeepservice.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_JEEP_SERVICE , 16);
	       mapjeepservice.animateCamera(update);
	}

}

  

		  
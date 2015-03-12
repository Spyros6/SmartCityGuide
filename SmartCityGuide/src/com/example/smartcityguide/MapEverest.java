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

public class MapEverest extends Activity {

private final LatLng LOCATION_EVEREST = new LatLng(37.9058105 ,23.7511049);
	
	private GoogleMap mapeverest;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_everest);
	

		mapeverest = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapeverest.addMarker(new MarkerOptions().position(LOCATION_EVEREST ).title("Alexioupoleos 46, Argyroupoli  - 16452"));

}

       public void onClick_Everest(View v) {
	  mapeverest.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	   CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_EVEREST , 16);
	   mapeverest.animateCamera(update);
	}

}



package com.example.smartcityguide;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MapICafeBar extends Activity {

private final LatLng LOCATION_I_CAFE = new LatLng(37.9059715, 23.7491639);
	
	private GoogleMap mapicafe;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_icafe_bar);
	
		mapicafe  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapicafe.addMarker(new MarkerOptions().position(LOCATION_I_CAFE).title("Aleksioupoleos 29, Argyroupoli - 16452"));
	
	}

	public void onClick_ICafe(View v) {
		mapicafe.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_I_CAFE , 16);
		mapicafe.animateCamera(update);
		
	}
}

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

public class MapOKanytimemarketEll extends Activity {


private final LatLng LOCATION_OK_ANYTIMEMARKET_ELL = new LatLng(37.8951567, 23.7601204);
	
	private GoogleMap mapokanytimemarket;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_okanytimemarket_ell);
	
		mapokanytimemarket  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapokanytimemarket.addMarker(new MarkerOptions().position(LOCATION_OK_ANYTIMEMARKET_ELL).title("Afroditis 106, Elliniko - 16777"));
	
	}

	public void onClick_OKanytimemarketEll(View v) {
		mapokanytimemarket.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_OK_ANYTIMEMARKET_ELL , 16);
		mapokanytimemarket.animateCamera(update);
		
	}
	
	
}

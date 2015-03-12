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

public class MapPeiraiwsArg extends Activity {

private final LatLng LOCATION_TRAPEZA_PEIRAIWS_ARG = new LatLng(37.905952 ,23.751459);
	
	private GoogleMap mappeiraiwsarg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_peiraiws_arg);
		
		mappeiraiwsarg = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mappeiraiwsarg.addMarker(new MarkerOptions().position(LOCATION_TRAPEZA_PEIRAIWS_ARG).title("Alexioupoleos 48 , Argyroupoli - 16452"));

	}
	
	public void onClick_PeiraiwsArg(View v) {
		mappeiraiwsarg.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TRAPEZA_PEIRAIWS_ARG, 16);
		mappeiraiwsarg.animateCamera(update);
		
	}
	
}
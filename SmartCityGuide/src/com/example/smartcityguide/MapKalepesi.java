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

public class MapKalepesi extends Activity {

private final LatLng LOCATION_KALEPESI = new LatLng(37.9074314,23.7492827);
	
	private GoogleMap mapkalepesi;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_kalepesi);
		
		mapkalepesi  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapkalepesi.addMarker(new MarkerOptions().position(LOCATION_KALEPESI).title("Marinou Geroulanou 57, Argyroupoli - 16452"));

	}
	
	public void onClick_Kalepesi(View v) {
		mapkalepesi.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_KALEPESI, 16);
		mapkalepesi.animateCamera(update);
		
	}
}

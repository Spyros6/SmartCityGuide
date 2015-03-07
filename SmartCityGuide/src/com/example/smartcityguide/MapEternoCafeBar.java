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

public class MapEternoCafeBar extends Activity {

private final LatLng LOCATION_ETERNO = new LatLng(37.9059637, 23.7497599);
	
	private GoogleMap mapeterno;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_eterno_cafe_bar);
	
		mapeterno  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapeterno.addMarker(new MarkerOptions().position(LOCATION_ETERNO).title("Aleksioupoleos 35, Argyroupoli - 16452"));
	}

	public void onClick_Eterno(View v) {
		mapeterno.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ETERNO , 16);
		mapeterno.animateCamera(update);
		
	}
	
}

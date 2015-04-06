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

public class MapBeautysHeaven extends Activity {

private final LatLng LOCATION_BEAUTYS_HEAVEN = new LatLng(37.9145239,23.7461754);
	
	private GoogleMap mapbeautysheaven;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_beautys_heaven);
	
		mapbeautysheaven  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapbeautysheaven.addMarker(new MarkerOptions().position(LOCATION_BEAUTYS_HEAVEN).title("Leoforos Kyprou 15, Argyroupoli - 16451"));
	}

	public void onClick_BeautysHeaven(View v) {
		mapbeautysheaven.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BEAUTYS_HEAVEN , 16);
		mapbeautysheaven.animateCamera(update);
		
	}
	
}

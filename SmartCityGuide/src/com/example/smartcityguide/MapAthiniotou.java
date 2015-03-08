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

public class MapAthiniotou extends  Activity {

private final LatLng LOCATION_ATHINIOTOU = new LatLng(37.909504, 23.74701);
	
	private GoogleMap mapathiniotou;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_athiniotou);
	
	
		mapathiniotou  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapathiniotou.addMarker(new MarkerOptions().position(LOCATION_ATHINIOTOU).title("Marinou Geroulanou 26, Argyroupoli - 16452"));
	}
	public void onClick_Athiniotou(View v) {
		mapathiniotou.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_ATHINIOTOU, 16);
		mapathiniotou.animateCamera(update);
		
	}

}

	


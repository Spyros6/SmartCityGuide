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

public class MapGiaSouvlaki extends Activity {

private final LatLng LOCATION_GIA_SOUVLAKI = new LatLng(37.9128761 ,23.7481975);
	
	private GoogleMap mapgiasouvlaki;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_gia_souvlaki);
		
		 mapgiasouvlaki = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		 mapgiasouvlaki.addMarker(new MarkerOptions().position(LOCATION_GIA_SOUVLAKI ).title("Leoforos Kyprou 26, Argyroupoli  - 16452"));

	}
	
	public void onClick_Giasouvlaki(View v) {
		 mapgiasouvlaki.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_GIA_SOUVLAKI , 16);
		 mapgiasouvlaki.animateCamera(update);
		
	}
	
}
	
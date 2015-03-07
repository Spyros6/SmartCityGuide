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

public class MapVintazCafe extends Activity {

private final LatLng LOCATION_VINTAZ_CAFE_BAR = new LatLng(37.906545, 23.749824);
	
	private GoogleMap mapvintazcafebar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_vintaz_cafe);

		mapvintazcafebar  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapvintazcafebar.addMarker(new MarkerOptions().position(LOCATION_VINTAZ_CAFE_BAR).title("Marinou Geroulanou 75-77, Argyroupoli - 16452"));
	}

	public void onClick_VintazCafeBar(View v) {
		mapvintazcafebar.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_VINTAZ_CAFE_BAR , 16);
		mapvintazcafebar.animateCamera(update);
		
	}
	
}

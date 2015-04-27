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

public class MapCAHairDesign extends Activity {

private final LatLng LOCATION_CA_HAIR_DESIGN = new LatLng(37.8926929,23.7545864);
	
	private GoogleMap mapcahairdesign;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_cahair_design);

		mapcahairdesign = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapcahairdesign.addMarker(new MarkerOptions().position(LOCATION_CA_HAIR_DESIGN).title("Plateia Ethnikis Antistasews  2, Elliniko - 16777"));
	}

	public void onClick_CAHairDesign(View v) {
		mapcahairdesign.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CA_HAIR_DESIGN , 16);
		mapcahairdesign.animateCamera(update);
		
	}
	
}

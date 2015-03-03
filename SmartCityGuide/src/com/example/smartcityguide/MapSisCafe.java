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

public class MapSisCafe extends Activity {

private final LatLng LOCATION_SIS = new LatLng(37.8942151, 23.7531061);
	
	private GoogleMap mapsis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_sis_cafe);
	
		mapsis  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsis.addMarker(new MarkerOptions().position(LOCATION_SIS).title("Tripoleos 54, Elliniko - 16777"));
	
	}

	public void onClick_Sis(View v) {
		mapsis.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SIS , 16);
		mapsis.animateCamera(update);
		
	}
	
}
	
	


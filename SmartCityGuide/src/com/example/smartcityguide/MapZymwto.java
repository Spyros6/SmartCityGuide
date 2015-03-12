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

public class MapZymwto extends Activity {

private final LatLng LOCATION_TO_ZYMOTO= new LatLng(37.913917 ,23.751969);
	
	private GoogleMap mapzymoto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_zymwto);
	
		mapzymoto = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapzymoto.addMarker(new MarkerOptions().position(LOCATION_TO_ZYMOTO ).title("Kyprion Agwnistwn  57, Argyroupoli  - 16451"));

}

       public void onClick_Zymoto(View v) {
    	   mapzymoto.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	         CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TO_ZYMOTO , 16);
	         mapzymoto.animateCamera(update);
	}

}

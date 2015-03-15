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

public class MapSousami extends Activity {

private final LatLng LOCATION_SOUSAMI= new LatLng(37.9033193 ,23.7502685);
	
	private GoogleMap mapsousami;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_sousami);

		mapsousami = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapsousami.addMarker(new MarkerOptions().position(LOCATION_SOUSAMI ).title("Marinou Geroulanou 92, Argyroupoli - 16452"));

}

       public void onClick_Sousami(View v) {
    	   mapsousami.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SOUSAMI , 16);
	       mapsousami.animateCamera(update);
	}

}
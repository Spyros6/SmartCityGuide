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

public class MapToGeumataki extends  Activity {

private final LatLng LOCATION_TO_GEUMATAKI = new LatLng(37.892138 ,23.749399);
	
	private GoogleMap maptogeumataki;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_to_geumataki);

		maptogeumataki = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maptogeumataki.addMarker(new MarkerOptions().position(LOCATION_TO_GEUMATAKI ).title("Leoforos Iasonidou 7, Elliniko  - 16777"));

}

       public void onClick_ToGeumataki(View v) {
            maptogeumataki.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	         CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_TO_GEUMATAKI , 16);
	   maptogeumataki.animateCamera(update);
	}

}

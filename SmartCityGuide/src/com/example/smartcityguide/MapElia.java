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

public class MapElia extends Activity {

private final LatLng LOCATION_H_ELIA= new LatLng(37.905122 ,23.7505528);
	
	private GoogleMap mapelia;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_elia);

		mapelia = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapelia.addMarker(new MarkerOptions().position(LOCATION_H_ELIA ).title("Marinou Geroulanou 85, Argyroupoli - 16452"));

}

       public void onClick_Elia(View v) {
    	   mapelia.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_H_ELIA , 16);
	       mapelia.animateCamera(update);
	}

}

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

public class MapRenieris extends Activity {

private final LatLng LOCATION_RENIERIS= new LatLng(37.90031 ,23.75238);
	
	private GoogleMap maprenieris;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_renieris);

		maprenieris = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maprenieris.addMarker(new MarkerOptions().position(LOCATION_RENIERIS ).title("Komnhnon 37, Argyroupoli  - 16452"));

}

       public void onClick_Renierhs(View v) {
    	   maprenieris.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	         CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_RENIERIS , 16);
	         maprenieris.animateCamera(update);
	}

}


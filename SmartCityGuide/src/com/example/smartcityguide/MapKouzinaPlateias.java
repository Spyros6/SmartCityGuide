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

public class MapKouzinaPlateias extends Activity {

private final LatLng LOCATION_H_KOUZINA_THS_PLATEIAS = new LatLng(37.9056111 ,23.7503555);
	
	private GoogleMap mapkouzinaplateias;
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_kouzina_plateias);

		mapkouzinaplateias = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapkouzinaplateias.addMarker(new MarkerOptions().position(LOCATION_H_KOUZINA_THS_PLATEIAS).title("Marinou Geroulanou 77, Argyroupoli - 16452"));

}

       public void onClick_KouzinaPlateias(View v) {
    	   mapkouzinaplateias.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_H_KOUZINA_THS_PLATEIAS , 16);
	       mapkouzinaplateias.animateCamera(update);
	}

}

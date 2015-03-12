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

public class MapGiouras extends Activity {

private final LatLng LOCATION_GIOURAS= new LatLng(37.892326 ,23.756834);
	
	private GoogleMap mapgiouras;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_giouras);


		mapgiouras = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapgiouras.addMarker(new MarkerOptions().position(LOCATION_GIOURAS ).title("Leoforos Iasonidou 54, Elliniko  - 16777"));

}

       public void onClick_Giouras(View v) {
    	   mapgiouras.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_GIOURAS , 16);
	       mapgiouras.animateCamera(update);
	}

}

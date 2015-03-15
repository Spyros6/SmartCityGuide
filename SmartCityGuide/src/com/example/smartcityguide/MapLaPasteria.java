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

public class MapLaPasteria extends Activity {

private final LatLng LOCATION_LA_PASTERIA= new LatLng(37.9078883 ,23.7485357);
	
	private GoogleMap maplapasteria;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_la_pasteria);

		maplapasteria = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		maplapasteria.addMarker(new MarkerOptions().position(LOCATION_LA_PASTERIA ).title("Marinou Geroulanou 58, Argyroupoli - 16452"));

}

       public void onClick_LaPasteria(View v) {
    	   maplapasteria.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_LA_PASTERIA , 16);
	       maplapasteria.animateCamera(update);
	}

}

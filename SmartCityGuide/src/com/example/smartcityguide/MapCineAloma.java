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

public class MapCineAloma extends Activity {

private final LatLng LOCATION_CINE_ALOMA= new LatLng(37.9033179 ,23.7505938);
	
	private GoogleMap mapcinealoma;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_cine_aloma);
		
		mapcinealoma = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapcinealoma.addMarker(new MarkerOptions().position(LOCATION_CINE_ALOMA ).title("Marinou Geroulanou 103 kai Pontou, Argyroupoli  - 16452"));

}

       public void onClick_CineAloma(View v) {
    	   mapcinealoma.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_CINE_ALOMA , 16);
	       mapcinealoma.animateCamera(update);
	}

}

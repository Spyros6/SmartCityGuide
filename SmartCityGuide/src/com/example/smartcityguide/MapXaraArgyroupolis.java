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

public class MapXaraArgyroupolis extends Activity {

private final LatLng LOCATION_H_XARA_THS_ARGYROUPOLHS= new LatLng(37.91115 ,23.750207);
	
	private GoogleMap mapxaraargyroupolhs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_xara_argyroupolis);
	
	
		mapxaraargyroupolhs = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapxaraargyroupolhs.addMarker(new MarkerOptions().position(LOCATION_H_XARA_THS_ARGYROUPOLHS ).title("Leoforos Kyprou 61, Argyroupoli  - 16452"));

}

       public void onClick_XaraArgyroupolis(View v) {
    	      mapxaraargyroupolhs.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	         CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_H_XARA_THS_ARGYROUPOLHS , 16);
	         mapxaraargyroupolhs.animateCamera(update);
	}

}

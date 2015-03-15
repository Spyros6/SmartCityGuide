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

public class MapVideoBlue extends Activity {

private final LatLng LOCATION_VIDEO_BLUE= new LatLng(37.892184 ,23.750916);
	
	private GoogleMap mapvideoblue;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map_video_blue);

		mapvideoblue = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapvideoblue.addMarker(new MarkerOptions().position(LOCATION_VIDEO_BLUE ).title("Leoforos Iasonidou 16-18, Elliniko- 16777"));

}

       public void onClick_VideoBlue(View v) {
    	   mapvideoblue.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	       CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_VIDEO_BLUE , 16);
	       mapvideoblue.animateCamera(update);
	}

}
package com.example.leaflet;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Leaflet extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_leaflet);
		WebView leaflet = (WebView)findViewById(R.id.leaflet);
		leaflet.clearCache(true);
		leaflet.getSettings().setJavaScriptEnabled(true);
		leaflet.setInitialScale(200);
		leaflet.loadUrl("file:///android_asset/leaflet.html");
	}

}

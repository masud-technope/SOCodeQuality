Bitmap source = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher);

Bitmap target = RotateMyBitmap(source, 120.0f);

final ArrayList<OverlayItem> items = new ArrayList<OverlayItem>();
OverlayItem marker = new OverlayItem("markerTitle", "markerDescription", new GeoPoint(52.033954,1.210179));
marker.setMarkerHotspot(OverlayItem.HotspotPlace.TOP_CENTER);
items.add(marker);

Drawable newMarker = new BitmapDrawable(getResources(), target);

//Drawable newMarker = this.getResources().getDrawable(R.drawable.maincar);
DefaultResourceProxyImpl resProxyImp = new DefaultResourceProxyImpl(getApplicationContext());
ItemizedIconOverlay markersOverlay = new ItemizedIconOverlay<OverlayItem>(items, newMarker, null, resProxyImp);
mapView.getOverlays().add(markersOverlay);
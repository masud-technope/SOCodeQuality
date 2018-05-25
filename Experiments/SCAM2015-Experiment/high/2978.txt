private boolean isInFocus = false;

@Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    Log.d(TAG, "FOCUS = " + hasFocus);
    isInFocus = hasFocus;
}

@Override
public void onStop() {
    super.onStop();
    if (!isInFocus) finish();
}
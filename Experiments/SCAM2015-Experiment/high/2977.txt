@Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    Log.d(TAG, "FOCUS = " + hasFocus);
    if (!hasFocus) finish();
}
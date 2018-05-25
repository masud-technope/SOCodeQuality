super.onCreate();
if (getIntent().hasExtra("foo")) {
    // We should now launch CommunicationActivity and finish ourselves
    Intent intent = new Intent(this, CommunicationActivity.class);
    startActivity(intent);
    finish();
    return; // Don't continue the rest of onCreate()
}
// The rest of your onCreate() goes here
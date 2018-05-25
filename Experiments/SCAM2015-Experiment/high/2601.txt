public class MyActivity extends Activity {

    private TextView mTextView;
    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getStringExtra("actionType");
            if(action.equals("updateTextView")){
                mTextView.setText("whatever you want to set");
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Start listening, you can put it on onResume too
        LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new IntentFilter(MyActivity.class.getSimpleName()));
        mTextView = (TextView) findViewById(R.id.something);
    }
}
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyEditTextFragment fragment1 = (MyEditTextFragment)
            getFragmentManager().findFragmentById(R.id.detailfragment_placeholder);

        final MyEditTextFragment fragment2 = (MyEditTextFragment)
            getFragmentManager().findFragmentById(R.id.detailfragment_placeholder2);

        Button submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v){

                String firstResult = fragment1.getText().toString();
                String secondResult = fragment2.getText().toString();

                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                intent.putExtra("result1", firstResult);
                intent.putExtra("result2", secondResult);
                startActivity(intent);
            }
        });
    }
}
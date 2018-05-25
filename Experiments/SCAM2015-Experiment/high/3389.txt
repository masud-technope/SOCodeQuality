public class MainActivity extends Activity  implements OnClickListener{
private Button button;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    button=(Button)findViewById(R.id.button1);
    button.setOnClickListener(this);
}

@Override
public void onClick(View v) {
    // TODO Auto-generated method stub
    switch (v.getId()) {
    case R.id.button1:
        Intent i=new Intent(MainActivity.this,Second.class);
        startActivity(i);
        break;

    default:
        break;
    }
}
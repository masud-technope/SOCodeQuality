private TextView mTextView;
private TextView text;

public void onCreate(Bundle savedInstance) {
    super.onCreate(savedInstance);
    setContentView(R.layout.activity_my);
    final WatchViewStub stub = (WatchViewStub)findViewById(R.id.watch_view_stub);
    text = (TextView)findViewById(R.id.text);
    stub.setOnLayoutInflatedListener((stub -> {
        mTextView = (TextView)stub.findViewById(R.id.text);
    }};

    text.setText("test");
}
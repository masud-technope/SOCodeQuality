private TextView mTextView;

public void onCreate(Bundle savedInstance) {
    super.onCreate(savedInstance);
    setContentView(R.layout.activity_my);
    final WatchViewStub stub = (WatchViewStub)findViewById(R.id.watch_view_stub);
    stub.setOnLayoutInflatedListener((stub -> {
        mTextView = (TextView)stub.findViewById(R.id.text);
        mTextView.setText("test");
    }};
}
public class MyEditTextFragment extends Fragment {
    private EditText mEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.edit_text_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mEditText = (EditText) getView().findViewById(R.id.my_edit_text);
    }

    public Editable getText() {
        return mEditText.getText();
    }
}
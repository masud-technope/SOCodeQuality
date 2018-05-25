// MainActivity.java

public class MainActivity 
    extends Activity
    implements SearchView.OnQueryTextListener,
                SearchView.OnSuggestionListener
{

    private SuggestionsDatabase database;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        database = new SuggestionsDatabase(this);
        searchView = (SearchView) findViewById(R.id.searchView1);
        searchView.setOnQueryTextListener(this); 
        searchView.setOnSuggestionListener(this);
    }

    @Override
    public boolean onSuggestionSelect(int position) {

        return false;
    }

    @Override
    public boolean onSuggestionClick(int position) {

        SQLiteCursor cursor = (SQLiteCursor) searchView.getSuggestionsAdapter().getItem(position);
        int indexColumnSuggestion = cursor.getColumnIndex( SuggestionsDatabase.FIELD_SUGGESTION);

        searchView.setQuery(cursor.getString(indexColumnSuggestion), false);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        long result = database.insertSuggestion(query);
        return result != -1;
    }

    @Override
    public boolean onQueryTextChange(String newText) {

        Cursor cursor = database.getSuggestions(newText);
        if(cursor.getCount() != 0)
        {
            String[] columns = new String[] {SuggestionsDatabase.FIELD_SUGGESTION };
            int[] columnTextId = new int[] { android.R.id.text1};

            SuggestionSimpleCursorAdapter simple = new SuggestionSimpleCursorAdapter(getBaseContext(),
                    android.R.layout.simple_list_item_1, cursor,
                    columns , columnTextId
                    , 0);

            searchView.setSuggestionsAdapter(simple);
            return true;
        }
        else
        {
            return false;
        }
    }

}
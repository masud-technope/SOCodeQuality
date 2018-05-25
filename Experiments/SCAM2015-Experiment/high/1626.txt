int score;
    ...

    Bundle extras = getIntent().getExtras();

    // Read the extras data if it's available.
    if (extras != null)
    {
        score = extras.getInt("score_key");
    }
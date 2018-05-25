int score;

    ...
    Intent Intent = new Intent(...);
    intent.putExtra("score_key", score);
    startActivity(intent);
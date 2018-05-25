private final Vector questions;

    public Questionnaire(String[] words)
    {
        questions = new Vector();
        for (String word : words)
        {
            questions.add(new Question(word));
        }
    }
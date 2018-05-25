private final Question[] questions;

    public Questionnaire(String[] words)
    {
        questions = new Question[words.length];
        for (int i = 0; i < words.length; i++)
        {
            questions[i] = new Question(word);
        }
    }
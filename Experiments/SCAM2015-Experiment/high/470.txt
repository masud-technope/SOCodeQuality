private final List questions;

    public Questionnaire(String[] words)
    {
        questions = new ArrayList();
        for (String word : words)
        {
            questions.add(new Question(word));
        }
    }
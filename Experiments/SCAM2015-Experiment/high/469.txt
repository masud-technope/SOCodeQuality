public class Questionnaire
{
    private final List<Question> questions;

    public Questionnaire(String[] words)
    {
        questions = new ArrayList<Question>();
        for (String word : words)
        {
            questions.add(new Question(word));
        }
    }

    // Use questions here
}
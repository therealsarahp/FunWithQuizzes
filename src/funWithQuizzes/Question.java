package funWithQuizzes;

public abstract class Question {
    //This is the base class, our other types are extended, or based, on this one
    private String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public abstract double gradeAnswer(String answer);
}

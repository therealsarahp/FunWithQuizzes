package funWithQuizzes;

public class TrueFalse extends Question{

    private String choices = "Enter A.True or B.False";
    private boolean correctAnswer;

    public TrueFalse(String question, boolean correctAnswer) {
        super(question);
        this.choices = "Enter True or False";
        this.correctAnswer = correctAnswer;
    }

    public String getChoices() {
        return choices;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public String toString(){
        String output = this.getQuestion() + this.getChoices();
        return output;
    }

    @Override
    public double gradeAnswer(String answerString){
        if(correctAnswer && answerString.equals("a") || !correctAnswer && answerString.equals("b")) {
        return 1;
    } else {
        return 0;
    }
    }


}

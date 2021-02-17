package funWithQuizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleChoice extends Question {

    private ArrayList<String> choiceArray;
    private String correctAnswer;

    public MultipleChoice(String question, ArrayList<String> choiceArray, String correctAnswer) {
        super(question);
        this.choiceArray = choiceArray;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString(){
        String output = this.getQuestion() + "\n";
        for (int i = 0; i < choiceArray.size(); i++){
            char letter = (char)(97+i);
            output = output + "\t" + letter + ") " + choiceArray.get(i) + "\n";

        }
        return output;
    }

    @Override
    public double gradeAnswer(String answer){
        if(answer == correctAnswer){
            return 1;
        } else {
            return 0;
        }

    }
}

package funWithQuizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Checkbox extends Question{

    private ArrayList<String> choices;
    private ArrayList<String> answers;
    private ArrayList<String> options;

    public Checkbox(String question, ArrayList<String> choices, ArrayList<String> answers) {
        super(question);
        this.choices = choices;
        this.answers = answers;
        this.options = new ArrayList<>(this.choices);
        for(int i = 0; i < answers.size(); i++){
            this.options.add(answers.get(i));
        }
        Collections.shuffle(this.options);

    }

    @Override
    public String toString(){

        String output = this.getQuestion() + '\n';
        for(int i = 0; i < options.size(); i++){
            char letter = (char)(97 + i);
            output = output + "\t" + letter + ") " + options.get(i) + "\n";
        }
        return output + "Choose One or More Answers: ";
    }

    @Override
    public double gradeAnswer(String answer){
        int grade = 0;
        for (int i = 0; i <options.size(); i++){
            for(int j = 0; j < answers.size(); j++){
                if(options.get(i).toLowerCase() == answers.get(j).toLowerCase()){
                    grade += 1;
                } else {
                    grade += 0;
                }
            }
        } return grade;
    }
}

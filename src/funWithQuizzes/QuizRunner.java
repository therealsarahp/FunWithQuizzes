package funWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {

    public static void main (String[] args){

        TrueFalse grapes = new TrueFalse("Are there grapes?\n", false);
        System.out.println(grapes);

        ArrayList<String> mcchoicel = new ArrayList<>();

        mcchoicel.add("A.Not this one");
        mcchoicel.add("B.Or this one" );
        mcchoicel.add("C, or this one");
        mcchoicel.add("D. Yes, this one.");

        MultipleChoice example = new MultipleChoice("Which ones is the right answer?\n", mcchoicel, "D" );
        System.out.println(example);
        System.out.println(example.gradeAnswer("D"));
    }

}

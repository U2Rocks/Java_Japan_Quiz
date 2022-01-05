package com.mycitrus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // define three prompts
        String prompt1 = "What is the population of Japan?: \n (A) 200_000_000 \n (B) 100_000_000 \n (C) 125_000_000 \n (D) 150_000_000 " ;
        String prompt2 = "What is the second largest city in Japan?: \n (A) Tokyo \n (B) Yokohama \n (C) Osaka \n (D) Kyoto ";
        String prompt3 = "How many islands does Japan have? \n (A) About 2_500 \n (B) About 3_600 \n (C) About 5_500 \n (D) About 6_500 ";

        // define a line break for neater console spacing
        String linebreak = "------------------------";

        // define three answers for the prompts
        String answer1 = "C";
        String answer2 = "B";
        String answer3 = "D";

        // test if prompts are working properly
        // System.out.println(prompt3);

        // create an array list of questions
        ArrayList<Question> questionList = new ArrayList<Question>();

        // create the three question objects
        Question question1 = new Question(prompt1, answer1);
        Question question2 = new Question(prompt2, answer2);
        Question question3 = new Question(prompt3, answer3);

        // add the question objects to the list
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);

        // call a function that takes the list of questions
        quizTime(questionList);

    }

    // this function runs the quiz based on the passed in list
    public static void quizTime(ArrayList<Question> quizList){
        int score = 0;
        Scanner quizScan = new Scanner(System.in);
        for (Question q: quizList){
            System.out.println("----------------");
            System.out.println(q.getPrompt());
            System.out.println("----------------");
            System.out.print("Answer: ");
            String userInput = quizScan.nextLine();
            if (userInput.equals(q.getAnwser())) {
                score++;
            }
        }
        // print line break for visual separation
        System.out.println("----------------");

        // convert final score to nicer human-readable percentage
        double correctPercentRaw = ((double)score / quizList.size()) * 100;
        int correctPercent = (int) correctPercentRaw;

        // print out final score with a nice message
        System.out.println("You got " + correctPercent + "% correct!");

    }
}

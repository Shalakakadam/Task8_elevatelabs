package com.Shalaka.Internship;

import java.util.*;

class question{
	String text;
	String[] options;
	int correct;
	
	
	question(String text,String[]options,int correct){
		this.text=text;
		this.options=options;
		this.correct=correct;
	}
}

public class Task8_Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		List<question> quiz = Arrays.asList(
	            new question("What is the capital of France?",
	                         new String[]{"1. Berlin", "2. Paris", "3. Rome", "4. Madrid"}, 2),
	            new question("Who developed Java?",
	                         new String[]{"1. Microsoft", "2. James Gosling", "3. Guido van Rossum", "4. Dennis Ritchie"}, 2),
	            new question("Which keyword is used to inherit a class in Java?",
	                         new String[]{"1. this", "2. super", "3. extends", "4. implements"}, 3)
	        );
		
		System.out.println("===== Welcome to the Quiz App =====");
        for (int i = 0; i < quiz.size(); i++) {
            question q = quiz.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.text);
            for (String opt : q.options) {
                System.out.println(opt);
            }
            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt();

            if (ans == q.correct) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong!");
            }
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + quiz.size());
    sc.close();
	}
	
}


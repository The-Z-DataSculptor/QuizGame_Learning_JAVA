import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctAnswers = 0;
        final int TOTAL_QUESTIONS = 5;
        String[] questions = {
                "1. What is the default data type for a decimal number in Java?\n" +
                        " A. float\n B. double\n C. int\n D. char",

                "2. Which operator is used to find the remainder of a division?\n" +
                        " A. /\n B. \\\n C. %\n D. mod",

                "3. Which control structure is best for a multi-way branch based on a single integer value?\n" +
                        " A. if-else\n B. while loop\n C. switch statement\n D. do-while",

                "4. What does the ++ operator do?\n" +
                        " A. Adds 2\n B. Multiplies by 2\n C. Subtracts 1\n D. Adds 1",

                "5. What is the correct way to compare two Strings in Java?\n" +
                        " A. ==\n B. .equals()\n C. =\n D. compareTo()"
        };

        char[] answerKey = { 'B', 'C', 'C', 'D', 'B' };

        System.out.println("Welcome to the Java Concepts Quiz!");
        System.out.println("Please enter A, B, C, or D for each question.\n");

        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            System.out.println(questions[i]);
            char userAnswer = ' ';
            boolean validInput = false;

            // Input validation loop
            while (!validInput) {
                System.out.print("Your answer: ");
                String userInput = input.nextLine().trim().toUpperCase();

                if (userInput.length() == 1 && (userInput.charAt(0) >= 'A' && userInput.charAt(0) <= 'D')) {
                    userAnswer = userInput.charAt(0);
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter A, B, C, or D.");
                }
            }

            // Directly check the answer since input is guaranteed to be valid
            if (userAnswer == answerKey[i]) {
                System.out.println("Correct!\n");
                correctAnswers = correctAnswers + 1;
            } else {
                System.out.println("Incorrect. The correct answer was " + answerKey[i] + ".\n");
            }
        }

        int wrongAnswers = TOTAL_QUESTIONS - correctAnswers;
        double percentage = ((double) correctAnswers / TOTAL_QUESTIONS) * 100;

        System.out.println("--- Quiz Finished ---");
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + wrongAnswers);
        System.out.println("Final Score: " + percentage + "%");

        input.close();
    }
}
package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSumGrades = 0;
        int countPresentations = 0;

        while (!input.equals("Finish")){

            double sumGrades = 0;
            for (int i = 1; i <= countPeople ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;
            }

            double averageGradePerPresentation = sumGrades / countPeople;
            totalSumGrades += averageGradePerPresentation;
            countPresentations ++;

            System.out.printf("%s - %.2f.%n", input, averageGradePerPresentation);


            input = scanner.nextLine();
        }


        double averageStudentsGrade = totalSumGrades / countPresentations;

        System.out.printf("Student's final assessment is %.2f.", averageStudentsGrade);


    }
}

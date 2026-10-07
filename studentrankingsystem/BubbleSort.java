/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */





public class BubbleSort {

    public static void sort(Student[] students) {

        for (int i = 0; i < students.length - 1; i++) {

            for (int j = 0; j < students.length - 1 - i; j++) {

                // Compare Student objects using their finalGrade
                if (students[j].getFinalGrade()
                        < students[j + 1].getFinalGrade()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

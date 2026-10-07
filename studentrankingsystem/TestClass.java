
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */
public class TestClass {
  



    public static void main(String[] args) {

        Student[] students = {
            new Student("2026001", "Kian magsayo", "BSIT", 98.50),
            new Student("2026002", "Benny Mark Delacerna", "BSCS", 99.25),
            new Student("2026003", "Jerald Carias", "BSIT", 89.75),
            new Student("2026004", "Roger Lacuaren", "BSIS", 94.00),
            new Student("2026005", "Edgar Lacuaren", "BSCS", 91.50),
            new Student("2026006", "Clariz Ignacio", "BSIT", 98.45),
            new Student("2026007", "Raffael Aragon", "BSIS", 88.25),
            new Student("2026008", "Janese Delos santos", "BSCS", 93.50)
        };

        
        System.out.println("===============  (STUDENTS BEFORE SORTING)  ===============");
        displayStudents(students);

      
        BubbleSort.sort(students);

        
        System.out.println("\n=============== (STUDENTS AFTER SORTING) ===============");
        displayStudents(students);

        
        System.out.println("\n===============     (TOP 5 STUDENTS)     ===============");

        for (int i = 0; i < 5; i++) {
            System.out.println(
                (i + 1) + ". "
                + students[i].getName()
                + " - "
                + students[i].getFinalGrade()
            );
        }
    }

    public static void displayStudents(Student[] students) {

        System.out.printf("%-12s %-20s %-10s %-10s%n",
                "Student ID", "Name", "Program", "Grade");

        System.out.println("--------------------------------------------------------");

        for (Student student : students) {
            System.out.printf("%-12s %-20s %-10s %.2f%n",
                    student.getStudentId(),
                    student.getName(),
                    student.getProgram(),
                    student.getFinalGrade());
        }
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author Ellica, John Mark
 */
public class Student {
     


    private final String studentId;
    private final String name;
    private final String program;
    private final double finalGrade;

    public Student(String studentId, String name, String program, double finalGrade) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.finalGrade = finalGrade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public double getFinalGrade() {
        return finalGrade;
    }
}

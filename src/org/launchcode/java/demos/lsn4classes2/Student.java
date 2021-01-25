package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    public static void main (String[] args) {
        Student testCase = new Student("Curtis", 1, 30, 2.0);
        System.out.println(testCase.toString());
        Student testCase2 = new Student ("Curtis");
        Teacher teacher = new Teacher("George", "Max", "Geo", 2);

        System.out.println(testCase.equals(teacher));
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        String gradeLevel;
        if (this.numberOfCredits <= 29) {
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits <= 59) {
            gradeLevel = "Sophomore";
        } else if (this.numberOfCredits <= 89) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits >= 90) {
            gradeLevel = "Senior";
        } else {
            gradeLevel = null;
        }
        return gradeLevel;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Find CURRENT quality score
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        // Find new quality score of parameters
        double newQualityScore = courseCredits * grade;

        // Update current total quality score
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        // Update total number of credits
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        // Compute new GPA
        double newGPA = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGPA;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return "Student: " +
                 name +
                ", studentId= " + studentId +
                ", numberOfCredits= " + numberOfCredits +
                ", gpa= " + gpa +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

//    Auto-generated:
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return studentId == student.studentId;
//    }

    @Override
    public boolean equals(Object obj) {
        //Check of the object is an instance of Student - return false if it is NOT
        if ((obj instanceof Student) == false) return false;
        //Create a new student object with the Object parameter
        Student myStudentObj = (Student) obj;
        //See if the new object name string equals the class (this.name) name
        if (myStudentObj.name.equals(this.name)) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

}

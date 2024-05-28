/**
 * this class was used by GradeCalculator.java
 */
package java8.PracticalUse.functionUsage;

public class Student {
    private String name;
    private Integer marks;
    private Character grade;
    private String status;

    public Student(String name, Integer marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    public Character setAndReturnGrade(Character grade) {
        this.grade = grade;
        return grade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", status=" + status +
                ", grade=" + grade +
                '}';
    }

}

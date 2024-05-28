/**
 * this class was used by GradeCalculator.java
 */
package java8.PracticalUse.consumerUsage;

public class StudentClass {
    private String name;
    private Integer marks;
    private Character grade;
    private String status;

    public StudentClass(String name, Integer marks){
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

    public Character getGrade() {
        return grade;
    }

    public String getStatus() {
        return status;
    }
}

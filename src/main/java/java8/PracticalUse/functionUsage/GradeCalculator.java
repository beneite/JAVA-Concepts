package java8.PracticalUse.functionUsage;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeCalculator {

    public static void main(String[] args){

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Ashok",83));
        studentArrayList.add(new Student("Bachan",93));
        studentArrayList.add(new Student("Chintu",73));
        studentArrayList.add(new Student("Doba",43));
        studentArrayList.add(new Student("Edwin",100));
        studentArrayList.add(new Student("Fanjy",10));
        studentArrayList.add(new Student("Sanju",15));

        Function<Student,Character> gradeCalculator = student -> {
            if(student.getMarks()<50){
                return student.setAndReturnGrade('D');
            } else if (student.getMarks()<80) {
                return student.setAndReturnGrade('C');
            } else if (student.getMarks()<90) {
                return student.setAndReturnGrade('B');
            } else if (student.getMarks()<99) {
                return student.setAndReturnGrade('A');
            } else if (student.getMarks() == 100) {
                return student.setAndReturnGrade('O');
            }
            return student.setAndReturnGrade('F');
        };

        Predicate <Student> setStatus = student -> student.getMarks() < 20 ;

        for(Student singleStudent: studentArrayList){
            if(setStatus.test(singleStudent))
                singleStudent.setStatus("Fail ❌");
            else
                singleStudent.setStatus("Pass ✅");
            Character grade = gradeCalculator.apply(singleStudent);
            System.out.println("Name:"+singleStudent.getName()+"; Grade:"+grade);
        }

        System.out.println("Printing overall result");
        for(Student singleStudent: studentArrayList) {
            System.out.println(singleStudent);
        }

    }
}


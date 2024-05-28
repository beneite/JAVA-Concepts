package java8.PracticalUse.consumerUsage;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeCalculator {
    public static void main(String[] args){

        ArrayList<StudentClass> studentArrayList = new ArrayList<>();
        studentArrayList.add(new StudentClass("Ashok",83));
        studentArrayList.add(new StudentClass("Bachan",93));
        studentArrayList.add(new StudentClass("Chintu",73));
        studentArrayList.add(new StudentClass("Doba",43));
        studentArrayList.add(new StudentClass("Edwin",100));
        studentArrayList.add(new StudentClass("Fanjy",10));
        studentArrayList.add(new StudentClass("Sanju",15));

        // a function to set the grade
        Function<StudentClass,Character> gradeCalculator = student -> {
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

        // a predicate to set the status
        Predicate<StudentClass> setStatus = student -> student.getMarks() < 20 ;

        // Consumer to print the data
        Consumer<StudentClass> printIt = student -> System.out.println("Student{" +
                "name='" + student.getName() + '\'' +
                ", marks=" + student.getMarks() +
                ", status=" +  student.getStatus()+
                ", grade=" + student.getGrade() +
                '}');

        for(StudentClass singleStudent: studentArrayList){
            if(setStatus.test(singleStudent))
                singleStudent.setStatus("Fail ❌");
            else
                singleStudent.setStatus("Pass ✅");
            Character grade = gradeCalculator.apply(singleStudent);
            System.out.println("Name:"+singleStudent.getName()+"; Grade:"+grade);
        }

        System.out.println("Printing overall result using consumer");
        for(StudentClass singleStudent: studentArrayList) {
            printIt.accept(singleStudent);
        }

    }
}

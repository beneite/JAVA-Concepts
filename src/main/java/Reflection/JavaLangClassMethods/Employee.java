package Reflection.JavaLangClassMethods;

import java.rmi.Remote;

public class Employee implements Cloneable, Remote {

    int eId;
    String eName;
    float eSalary;
    String eAddress;


    public Employee() {
        // Constructor
    }

    public Employee(int eId) {
        // Constructor
    }

    public Employee(int eId, String eName) {
        // Constructor
    }

    public Employee(int eId, String eName, float eSalary) {
        // Constructor
    }

    public Employee(int eId, String eName, float eSalary, String eAddress) {
        // Constructor
    }

    public void addEmployee(int eId, String eName, float eSalary, String eAddress){

    }

    public String searchEmployee(int eId){
        return "";
    }

    public void updateEmployee(int eId, String eName, float eSalary, String eAddress){

    }

    public void deleteEmployeeData(int eId){

    }
}

package collectionsFramework.interfaces.queues.Queue.priorityQueueExample;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * in this program we will find the employee with the lowest/Highest salary
 */
class Employee
{
    String empId;
    int empSalary;

    public Employee (String empId, int empSalary){
        this.empId = empId;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empSalary=" + empSalary +
                '}';
    }
}

// implementing this to set a comparator for Employee class
class EmpComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.empSalary - o2.empSalary;
    }
}

/**
 * Explanation:
 * Comparator Logic: return o1.empSalary - o2.empSalary;
 * If o1.empSalary < o2.empSalary, the result is negative, meaning o1 has a higher priority (comes first).
 * If o1.empSalary == o2.empSalary, the result is zero, meaning their order relative to each other doesn't change.
 * If o1.empSalary > o2.empSalary, the result is positive, meaning o2 has a higher priority (comes first).
 */

public class PriorityQueueExample {

    public static void main(String[] args){
        EmpComparator empComparator = new EmpComparator();
        PriorityQueue<Employee> pq = new PriorityQueue<>(empComparator);
        pq.add(new Employee("A", 100));
        pq.add(new Employee("B", 20));
        pq.add(new Employee("C", 50));
        pq.add(new Employee("D", 80));
        pq.add(new Employee("E", 90));

        System.out.println("Lowest salary:"+pq.peek());
        System.out.println("Removing the Lowest value:"+pq.poll());

    }
}

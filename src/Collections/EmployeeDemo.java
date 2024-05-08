package Collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("vasu", "vasu.rane@gmail.com", 39, "India"));
        emp.add(new Employee("bob", "bob@yahoo.com", 26, "Canada"));
        emp.add(new Employee("tom", "tom.liang@gmail.com", 34, "USA"));
        emp.add(new Employee("Yassir", "yassir@gmail.com", 44, "Pakistan"));
        emp.add(new Employee("chin ho", "chin.ho@gmail.com", 4, "China"));

        for (Employee element : emp) {
            if (element.getAge() > 35) {
                System.out.println("Employee email id when there age is greater than 35 :- " + element.getEmail());
            }
        }
    }
}

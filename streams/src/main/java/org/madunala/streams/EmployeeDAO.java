package org.madunala.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nareshmadunala
 */
public class EmployeeDAO {

    public List<Employee> getAllEmployees(){

        List<Employee> employeeList = new ArrayList<>();
        LocalDate nareshJoinDate = LocalDate.of(2011, 03, 04);
        LocalDate raviJoinDate = LocalDate.of(2011, 03, 04);
        LocalDate kumariJoinDate = LocalDate.of(2011, 03, 04);
        LocalDate mounikaJoinDate = LocalDate.of(2011, 03, 04);
        LocalDate johnJoinDate = LocalDate.of(2011, 03, 04);
        LocalDate rajuJoinDate = LocalDate.of(2011, 03, 04);
        LocalDate babuJoinDate = LocalDate.of(2011, 03, 04);
        employeeList.add(new Employee("Naresh", 39, nareshJoinDate, "Engineering", 'm'));
        employeeList.add(new Employee("Ravi", 55, raviJoinDate, "Management", 'm'));
        employeeList.add(new Employee("Kumari", 34, kumariJoinDate, "HR", 'f'));
        employeeList.add(new Employee("Mounika", 32, mounikaJoinDate, "Engineering", 'f'));
        employeeList.add(new Employee("John", 45, johnJoinDate, "Engineering", 'm'));
        employeeList.add(new Employee("Raju", 65, rajuJoinDate, "Management", 'm'));
        employeeList.add(new Employee("Babu", 30, babuJoinDate, "Admin", 'm'));

        return employeeList;
    }
}

package org.madunala.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author nareshmadunala
 */
public class StreamsWithEmployee {

    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();
        List<Employee> employeeList = employeeDAO.getAllEmployees();
        Map<Character, Long> empGenderMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(empGenderMap);
    }
}

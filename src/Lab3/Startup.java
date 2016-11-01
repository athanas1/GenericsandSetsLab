/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import Lab2.*;
import java.util.*;

/**
 *
 * @author athanas1
 */
public class Startup {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", "Thanas", "112412311"));
        employees.add(new Employee("JImbo", "Jambo", "4124125111"));
        employees.add(new Employee("Herald", "Ancient", "112511124"));
        employees.add(new Employee("Alex", "Thanas", "112412311"));
       
        System.out.println(employees.get(2));

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        };

        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println(employees.size());
        employees.remove(2);
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println(employees.size());
        employees.add(2, new Employee("Holy", "Moly", "15616167782"));

       for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println(employees.size());
        employees.set(2, new Employee("Keith", "Futherland", "16168884524"));

       for (Employee e : employees) {
            System.out.println(e);
        }

    }
}

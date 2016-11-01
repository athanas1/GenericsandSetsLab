/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import Lab3.*;
import Lab2.*;
import java.util.*;

/**
 *
 * @author athanas1
 */
public class Startup {

    public static void main(String[] args) {
        
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(new Employee("Alex", "Thanas", "112412311"));
        employees.add(new Employee("JImbo", "Jambo", "4124125111"));
        employees.add(new Employee("Herald", "Ancient", "112511124"));
        employees.add(new Employee("Alex", "Thanas", "112412311"));
       
        List<Employee> employe = new ArrayList<>(employees);
        System.out.println(employe.get(2));

       for (Employee e : employees) {
            System.out.println(e);
        }

        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println(employees.size());
        employees.remove(2);
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println(employees.size());
        employees.add(new Employee("Holy", "Moly", "15616167782"));

       for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println(employees.size());
        employe.set(2, new Employee("Keith", "Futherland", "16168884524"));

       for (Employee e : employees) {
            System.out.println(e);
        }

    }
}

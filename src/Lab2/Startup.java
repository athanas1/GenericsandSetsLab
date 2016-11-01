/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.*;

/**
 *
 * @author athanas1
 */
public class Startup {

    public static void main(String[] args) {

        List employees = new ArrayList();
        employees.add(new Employee("Alex", "Thanas", "112412311"));
        employees.add(new Employee("JImbo", "Jambo", "4124125111"));
        employees.add(new Employee("Herald", "Ancient", "112511124"));
        employees.add(new Employee("Alex", "Thanas", "112412311"));
      Employee emp =(Employee)employees.get(2);
        System.out.println(emp.getLastName());
        
        for(int i=0; i < employees.size();i++){
            Employee emp9 = (Employee) employees.get(i);
            System.out.println(emp);
        };
        
        for(Object s: employees) {
            Employee msg = (Employee)s;
            System.out.println(msg);
        }
        System.out.println(employees.size());
        employees.remove(2);
         for(Object s: employees) {
            Employee msg = (Employee)s;
            System.out.println(msg);
        }
         System.out.println(employees.size());
         employees.add(2,new Employee("Holy","Moly","15616167782"));
         
         for(Object s: employees) {
            Employee msg = (Employee)s;
            System.out.println(msg);
        }
         
         System.out.println(employees.size());
         employees.set(2, new Employee("Keith","Futherland","16168884524"));
         
         for(Object s: employees) {
            Employee msg = (Employee)s;
            System.out.println(msg);
        }
         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bryan.payroll;

import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author joyabryan
 */
public class PayrollSystemTest {
    
    
public static void main(String[] args) {
    
    
     Date currentDate = new Date(); // current date
    int currentMonth = currentDate.getMonth() + 1; // current month (January = 1)
    int currentYear = currentDate.getYear() + 1900; // current year (add 1900 to get actual year)
    
    
        Date birthDate0 = new Date(95, 2, 6);
         Date birthDate1 = new Date(99, 5, 19);
         Date birthDate2 = new Date(92, 3, 1);
        Date birthDate3 = new Date(91, 5, 6);
                
                
    
      // create subclass objects                                          
     SalariedEmployee salariedEmployee =
               new SalariedEmployee("John", "Smith", "111-11-1111", birthDate0 ,800.00);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, birthDate1);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06, birthDate2);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300,birthDate3);
        BasePlusCommissionEmployee basePlusCommissionEmployee1 =
                new BasePlusCommissionEmployee(
                        "Bryan", "Joya", "423-25-9873", 6000, .04, 400,birthDate2);
      
 /*     
      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());
*/


     
     

      // create four-element Employee array
      Employee[] employees = new Employee[5]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;
      employees[4] = basePlusCommissionEmployee1;

      System.out.printf("Employees processed polymorphically:%n%n");

    
         /*
         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 


         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } 


      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         if(employees[j].earnings() <= 600) {
            System.out.println("Employee with earnings $600:"); 
            System.out.println(employees[j]);
         //System.out.printf("Employee %d is a %s%n", j,  
         //   employees[j].getClass().getName());     
          }
      }  
   */   
      
       for (Employee currentEmployee : employees) {
        System.out.println(currentEmployee); // invokes toString

      double payroll = currentEmployee.earnings();
            Date birthDate = currentEmployee.getBirthDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(birthDate);
            int birthMonth = calendar.get(Calendar.MONTH);
           

        // add bonus if it is the month of the employee's birthday
        if (currentMonth == birthMonth) {
            payroll += 100.00;
            System.out.printf("Birthday bonus added: $%.2f%n", 100.00);
            System.out.printf(currentEmployee.getFirstName() + " ");
        }

        System.out.printf("Earned $%.2f%n%n", payroll);
    }
      
      
      
   } 
}

        

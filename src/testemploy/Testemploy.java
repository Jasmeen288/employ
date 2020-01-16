/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemploy;

/**
 *
 * @author mydev
 */
public class Testemploy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        empoyee e1=new empoyee ("java",1234,7,14.3);
        System.out.println("emp name"+e1.getName());
         System.out.println("emp id"+e1.getId));
          System.out.println("emp nweek"+e1.getNweek());
           System.out.println("emp hrate"+e1.getHrate());
      
            System.out.println("emp salary"+e1.getSalary());
            
       e1.setName("hello");
       e1.setId("1234");
       e1.setNweek(455);
       e1.setHrate(13.6);
       System.out.println("emp name"+e1.getName());
         System.out.println("emp id"+e1.getId));
          System.out.println("emp nweek"+e1.getNweek());
           System.out.println("emp hrate"+e1.getHrate());
      
      
      
      
        // TODO code application logic here
    }
    
}

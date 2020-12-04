/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasicsinterview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

public class JavaBasicsInterview {
   public static Date StringToDate(String dob) throws ParseException{
      //Instantiating the SimpleDateFormat class
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      //Parsing the given String to Date object
      Date date = formatter.parse(dob);
      System.out.println("Date object value: "+date);
      return date;
   }
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        System.out.println("Doctor: Hello. My name is Doctor Rohini");
        System.out.println("Patient: Hello");
        
        System.out.println("Doctor: What are your full names");
        System.out.println("Patient:");
        String name = input.nextLine();
        
        System.out.println("Doctor: Okay. When is your date of birth,date-month-year");
        System.out.println("Patient:");
        String dob = input.nextLine();
      //Converting String to Date
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      Date date = formatter.parse(dob);
      //Converting obtained Date object to LocalDate object
      Instant instant = date.toInstant();
      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
      LocalDate givenDate = zone.toLocalDate();
      //Calculating the difference between given date to current date.
      Period period = Period.between(givenDate, LocalDate.now());
      
      System.out.println("Doctor:What symptoms are you experiencing?");
        System.out.println("Patient:");
        String symptoms = input.nextLine();
        
         
          
        System.out.println("Doctor: Let us check your vital signs. I'll take your temperature readings, weight and height");
        float temperature, height, BMI;
        int weight;
        
        System.out.println("Temperature in degress celsius:");
        temperature = input.nextFloat();
        System.out.println("Height in metres:");
        height = input.nextFloat();
        System.out.println("Weight in Kilograms:");
        weight = input.nextInt();
        
        BMI = weight / (height*height) ;
              
        System.out.println();
        System.out.println("Name of patient:"+ name );
        System.out.println("Date of Birth:"+ dob );
        System.out.print("Age:"+ period.getYears()+" years "+period.getMonths()+" and "+period.getDays()+" days\n");
        System.out.println("Temperature in degrees celsius:"+ temperature );
        System.out.println("Height in metres:"+ height );
        System.out.println("Weight in Kilograms:"+ weight );
        System.out.println("BMI:"+ BMI );       
        System.out.println("Symptom experiencing:"+ symptoms );
        String diagnosis;
        if ("chills,headache,body aches".equals(symptoms)){
           System.out.println(diagnosis = "Diagnosed with Malaria"); 
        }
        else if ("diarrhoea,vomiting".equals(symptoms)) {
            System.out.println(diagnosis = "Diagnosed with Cholera");
        }     
        
           
            
           
        
    }
    
}

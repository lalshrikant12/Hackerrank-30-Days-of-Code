import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    	
     
      Student(String firstName, String lastName, int id,int [] score)
      {
        super(firstName, lastName, id);
        testScores=score;

      }
    
    /* 
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
       char calculate()
       {
           double average=0;
            for (int score : testScores) {
            average += score;
        }
        average /= testScores.length;
        

           if(average>=90 && average<=100)
           {
               return 'O';
           }
           else if(average>=80 && average<90)
           {
               return 'E';
           }
           else if(average>=70 && average<80)
           {
               return 'A';
           }
           else if(average>=55 && average<70)
           {
               return 'P';
           }
           else if(average>=40 && average<55)
           {
               return 'D';
           }
           else
           {
               return 'T';
           }
       }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}

class Solution {

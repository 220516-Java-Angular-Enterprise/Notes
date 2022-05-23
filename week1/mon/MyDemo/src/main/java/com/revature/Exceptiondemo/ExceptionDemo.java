package com.revature.Exceptiondemo;
//import com.revature.inheritance.Cat;

public class ExceptionDemo{
    public static void main(String[] args){

        /*An exception is an unwanted event that can disrupt the flow of our program.*/
        /*This will throw an exception because you cannot convert a string animal into an integer. */
        int num=0;
        int[] arr ={1,2,3,4,5};
        String willThrowException = "animal"; //converting this into an integer will throw an exception.
        String willNotThrowException = "123"; //This is a valid conversion. (number string)
        /*Use a try-catch block to handle exceptions*/
        try{
            num = Integer.parseInt(willThrowException); //parseInt is an object of Integer wrapper class that converts string into integer
        }
        catch(NumberFormatException e){
            System.out.println("Exception was thrown.");
        }

        /* We can catch multiple exceptions using multi try-catch blocks */
        try{
            num=Integer.parseInt("123");//NumberFormatException
            System.out.println(arr[5]);//ArrayIndexOutOfBoundException
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException was thrown");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AOOBE was thrown");
        }
    }

}
//you can also do

/*

 try{
            num = Integer.parseInt(willThrowException); //parseInt is an object of Integer wrapper class that converts string into integer
        }
        catch(exception e){  //this will catch all the exceptions not just this particular one
            e.printStackTrace(); will print the exception message
        }
 */
// package name
package com.test;

import com.exp.*;

// test class
public class Test1 {
    public static void main(String[] args){
        ExceptionsDemo.show();
    }
}


// class Test1{
//     public static void main(String[] args){
//             try{
//                     // Runtime-Uncheck Exception (Arithmetic Exp)
//                     /* Can't throw it explicitly */
//                     System.out.println(3/0);
//             }
            
//             //            catch-all()  - catches all error
//             catch (ArithmeticException e){
//                 // Handled Exception succesfully
//                 System.out.println("Division by zero error occured");
//             }
            
//             // will throw a expression which is unhandled by user and abort the program 
//             int x = 3/0;
//     }
// }

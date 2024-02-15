/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorprogram;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
         System.out.println("Enter operator (+, -, *, /):");
         char operator = scanner.next().charAt(0);
         
         double result;
         
         switch (operator){
             case '+':
                 result = num1 + num2;
                 break;
             case '-':
                 result = num1 - num2;
                 break;
             case '*':
                 result = num1 * num2;
                 break;   
             case '/':
                 if (num2!=0){
                 result = num1 / num2;
                
                 }else{
                     System.out.println("Error! Division by zero is not allowed.");
                     return;
                 }   
                 break;
             default:
                 System.out.println("Error! invalid operator.");
                 return;
                 
         }
         System.out.println("Result: " + result);
         
         scanner.close();
    }
}

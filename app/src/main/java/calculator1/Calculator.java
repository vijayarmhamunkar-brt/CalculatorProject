package main.java.calculator1;
public abstract class Calculator {
    
   private double num1;
   private double num2;
   protected double result;

   public Calculator(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
   }

   public abstract void add();
   public abstract void multiply();
   public void subtraction(){
      result = num1 - num2 ;
      System.out.println("Subtraction :" + result);
   }

   

   public double getNum1() {
    return num1;
   }

   public double getNum2() {
    return num2;
   }

   

   



   





}

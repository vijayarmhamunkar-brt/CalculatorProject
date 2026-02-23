package main.java.calculator1;

public class SceintificCal extends Calculator {
    
    private double num3;
    private double result;

    public SceintificCal(double num1, double num2,double num3) {
        super(num1, num2);
        this.num3 = num3;
    }
    
    public void add(){
        result = getNum1() + getNum2() + num3;
        System.out.println("Addition is "+ result);
    }

     public void multiply(){
         result =  getNum1() * getNum2() * num3;
        System.out.println("Multiplication is:" + result);
     }

     @Override
     public void subtraction() {
         result = (getNum1() - getNum2()) - num3;
         System.out.println("Subtraction is " + result);
     }
    
}

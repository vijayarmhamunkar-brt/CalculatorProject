package main.java.calculator1;


public class BasicCalculator extends Calculator {
    
    double result;
    public BasicCalculator(double num1,double num2) {
        super(num1,num2);
    }
    
    public void add(){
        result = getNum1() + getNum2();
        System.out.println("Addition :" + result);

    }
   
     public void multiply(){
         result =  getNum1() * getNum2();
         System.out.println("Multiplication :" + result);
     }

    
        @Override
        public void subtraction() {
            // TODO Auto-generated method stub
            super.subtraction();
        }

    }



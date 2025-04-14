import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        //Take input and operator from user
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=scanner.nextInt();
        System.out.println("Enter Second Number");
        int num2=scanner.nextInt();
        System.out.println("Enter Operator [ * / + -]");
        char operator=scanner.next().charAt(0);
        int result=0;
        String err="";
        switch (operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if(num2==0){
                    err="Cannot divide by zero";
                }
                else{
                    result=num1/num2;
                }
                break;
            default:
                System.out.println("Invalid operation");

        }
        if(!err.isEmpty()){
            System.out.println(err);
        }
        else{
            System.out.println(result);
        }
    }
}

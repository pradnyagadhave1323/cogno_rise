import java.io.*;

public class CalculatorApp{

        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the number to perfrom the calculation");
                int num1 = Integer.parseInt(br.readLine());
                int num2 = Integer.parseInt(br.readLine());
                int result;

                System.out.println("Enter the operator to perfrom the operation ");
                char operetor = br.readLine().charAt(0);

                switch(operetor){

                        case '+':
                                result = num1 + num2;
                                System.out.println("Addition of two number is "+result);
                                break;

                        case '-':
                                result = num1 - num2;
                                System.out.println("Substraction of two number is "+result);
                                break;

                        case '*':
                                result = num1 * num2;
                                System.out.println("Mutilpication of two number is "+result);
                                break;

                        case '/':
                                try{
                                        result = num1 / num2;
                                }
                                catch(ArithmeticException e){
					 System.out.println("Zero cannot divide any number");
                                }
                                break;

                        default:
                                System.out.println("Invalid Operetor");
                }



        }
}
                                                                 


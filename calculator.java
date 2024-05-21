import java.util.*;
class calculator
{
   public static void main()
    {
      int i = 0;
      for(i = 0; i>=0; i++)
        {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to the menu!!!");
        System.out.println("press the serial no. in side the barckets '()' to enter your choice");
        System.out.println("(1)simple calculator");
        System.out.println("(2)compound calculator");
        System.out.println("(3) exit!!");
        
        int choice = 0;
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                   //calculator(simple)
                   double num1 = 0.0d , num2 =0.0d, answer = 0.0d;
                   char op = ' ';
                   System.out.println("welcome to the simple calculator");
                   System.out.println("enter your first number");
                   num1 = sc.nextDouble();
                   System.out.println("enter the operator");
                   System.out.println("operators avalaible are: '+', '-' , '*' , '/', '%' ");
                   op = sc.next().charAt(0);
                   System.out.println("enter your second number");
                   num2 = sc.nextDouble();
                   
                   switch (op)
                   {
                       case '+':
                                //addition
                                answer = num1+num2;
                                break;
                                
                       case '-':
                                //subtraction
                                answer = num1 - num2;
                                break;
                       case '*':
                                //multiplication
                                answer= num1 * num2;
                                break;
                       case '/':
                                //division
                                answer = num1 / num2;
                                break;
                                
                       case '%':
                                //remainder
                                answer = num1 % num2;
                                break;
                                
                       default:
                               //else block
                               System.out.println("enter a valid operator");
                   }
                   
                   
                   System.out.println("the output generated in accordance to the provided input is :");
                   System.out.println(answer);
                   break;
                   
            case 2:
                  //calculator(compound)
                   System.out.println("welcome to the compound calculator");
                   System.out.println("functions avalaible are as follows :");
                   System.out.println("to execute any function enter the seial no. inside the respective fucntion's breacket '()' to enter your choice");
                   System.out.println("(1)maximum and minmum");
                   System.out.println("(2)number raied to a power of a number");
                   System.out.println("(3)square root of a number");
                   System.out.println("(4)cube root of a number");
                   System.out.println("(5)ceil value of a number (smallest integer i.e. greater or equal to the number)");
                   System.out.println("(6)floor value of a number (double value less than that of the number)");
                   System.out.println("(7)get a round up value of a decimal number");
                   System.out.println("(8)to get the absolute value of a number");
                   System.out.println("(9)to get a random positive integer between 0 to 1");
                   
                   
                   int input = 0;
                   input = sc.nextInt();
                   switch(input)
                   {
                       case 1:
                              //maximum and minimum
                              double num3 = 0.0d,  num4 = 0.0d;
                              System.out.println("enter first number");
                              num3= sc.nextDouble();
                              System.out.println("enter second number");
                              num4 = sc.nextDouble();
                    
                              System.out.println("the maximum of the two numbers is " + Math.max(num3,num4));
                              System.out.println("the minimum of the two numbers is " + Math.min(num3,num4));
                              break;
                              
                       case 2:
                              //power
                              double num5 = 0.0d, num6 = 0.0d;
                              System.out.println("enter the base number");
                              num5 = sc.nextDouble();
                              System.out.println("enter the nnumber raised to the power of the base number");
                              num6 = sc.nextDouble();
                              
                              System.out.println("the answer in accordance to your provided input is " + Math.pow(num5,num6));
                              break;
                              
                       case 3:
                              //square root
                              double num7 = 0.0d;
                              System.out.println("enter the number of which you want to find the square root of");
                              num7 = sc.nextDouble();
                              
                              System.out.println("the square root of the given number is " + Math.sqrt(num7));
                              break;
                              
                       case 4:
                              //cube root
                              double num8 = 0.0d;
                              System.out.println("enter the number of which you want to find the cube root of");
                              num8 = sc.nextDouble();
                              
                              System.out.println("the cube root of the given number is " + Math.cbrt(num8));
                              break;
                              
                       case 5:
                              //ceil value
                              double num9 = 0.0d;
                              System.out.println("enter the number of whihc you want to get the ceil value of ");
                              num9 = sc.nextDouble();
                              
                              System.out.println("the ceil value of the given number is " + Math.ceil(num9));
                              break;
                              
                       case 6:
                              //floor value
                              double num10 = 0.0d;
                              System.out.println("enter the number of which you want to get the floow value of");
                              num10 = sc.nextDouble();
                              
                              System.out.println("the floor value of the given number is " + Math.floor(num10));
                              break;
                              
                       case 7:
                              //round value
                              double num11 = 0.0d;
                              System.out.println("enter the number of which you want to gte the rounded up value of");
                              num11 = sc.nextDouble();
                              
                              System.out.println("the rounded up value of the given number is " + Math.round(num11));
                              break;
                              
                       case 8:
                              //absolute value
                              int num12 = 0;
                              System.out.println("enter the number of which you want to get the absolute value of");
                              num12 = sc.nextInt();
                              
                              System.out.println("the absolute value of the given number is " + Math.abs(num12));
                              break;
                              
                       case 9:
                              //random value
                              String response = " ";
                              System.out.println("do you want to get a random integer value between 0 to 1 enter (yes/no)");
                              response = sc.nextLine();
                              response = sc.nextLine();
                              if(response.equals("yes"))
                              System.out.println("the random integer between 0 to 1 is " + Math.random());
                              else
                              break;
                               
                       default:
                               //else block
                               System.out.println("enter a valid choice");
                   }
                   break;
                   
            case 3:
                   //exit
                   System.exit(0);
                   break;
                
            default:
                    //else block
                    System.out.println("please enter a valid choice");
        }
        }
    }
}


import java.util.*;
public class basics{
    public static void main(String args[]){

        System.out.println("Hello World");                   // every line of code will be terminated by ;  symbol which denotes that this line ends here.
        System.out.println("# # # # ");
        System.out.println("# # # ");
        System.out.println("# # ");
        System.out.println("# ");
        System.out.println("#");

        int a=5;                                            //integer value denoted by int
        int b=10;
        int c=a+b;
        String name="Kamaljeet Yadav";                     //string value denoted by String with capital S
        System.out.println("product of a and b is : " + c);
        System.out.println(name);

//data types (primitives)

        byte by = 8;
        char ch = 'a' ;                                     // can store only single character otherwise return error.
        boolean var = true;
        float price=10.5f;
        int num = 567;
        System.out.println(by);
        System.out.println(ch);
        System.out.println(var);
        System.out.println(num);
        System.out.println(price);

        
//sum of 2 numbers.
        int num1=50;
        int num2=89;
        int sum=num1+num2;
        System.out.println(sum);
           
//to give comments in a code we just simply use "//" for single line comment and " /*    ----multiline comments-----   star/ " for multiline comments.

// To take input from user we have to import " java.util.* " and define a class--> scanner 
        Scanner scn= new Scanner(System.in);
      //String input=sc.next();
        //System.out.println(input);
        //String name=sc.nextLine();
        //System.out.println(name);
        int num=sc.nextInt();
        System.out.println(num);


        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.print(sum);

        Scanner scn= new Scanner(System.in);
        float rad = scn.nextFloat();
        Float area = 3.14f * rad * rad ;
        System.out.println(area);

        float pen = scn.nextFloat();
        float pencil = scn.nextFloat();
        float book = scn.nextFloat();
        float total = pen + pencil + book 
        float gst = total + (total * 0.18f);
        System.out.println(total);
        System.out.println(gst);


        int age = 15;
        if (age>=18){
            System.out.println("Your are adult now as your age is "+ age);
        }
        else if (12<age && age<=18){
            System.out.println("You are teenager  as your age is "+ age);
        }
        else{
            System.out.println("You are not adult yet, age = "+ age);
        }
    
//  code for finding relation between 3 numbers  which one is greater,middle,same etc.


        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        if (num1>num2 && num1>num3){
            if(num2>num3){
                System.out.println("num1>num2>num3");
            }
            else if(num3>num2){
                System.out.println("num1>num3>num2");
            }else{
                System.out.println("num1>num2=num3");
            }
        }
        else if(num2> num1 && num2>num3){
            if (num1>num3){
                System.out.println("num2>num1>num3");
            }
            else if(num3>num1){
                System.out.println("num2>num3>num1");
            }else{
                System.out.println("num2>num1=num3");
            }
        }
        else if(num3>num1 && num3>num2){
            if(num1>num2){
                System.out.println("num3>num1>num2");
            }
            else if(num2>num1){
                System.out.println("num3>num2>num1");
            }else{
                System.out.println("num3>num2=num1");
            }
        }
        else if(num1==num2 || num2==num3 || num1==num3){
            System.out.println("You have enter same number.");
        }
// code for a simple calculator using switch Case .

        int num1 =scn.nextInt();
        int num2 =scn.nextInt();
        char operator = scn.next().charAt(0);
        switch (operator){
            case '*' : System.out.println(num1*num2);
                        break;
            case '/' : System.out.println(num1/num2);
                        break;
            case '+' : System.out.println(num1+num2);
                        break;
            case '-' : System.out.println(num1-num2);
                        break;
            case '%' : System.out.println(num1%num2);
                        break;
            default :  System.out.println("you have entered wrong operator.");
        }


// while loop concept .

        int count = 0;
        while (count<10){
            System.out.println("Hello World");
            count++;
        }
        System.out.println("printed hw 10 times ");

// reversing a number and saving in a variable.
        int num=scn.nextInt();
        int rev=0;
        while (num>0) {
            rev=((rev*10) + num%10);
            num=num/10;
        }
        System.out.println(rev);
    }
}

// This is how to create and call a function.

public class basics{
    public static void printhelloworld(){
        System.out.println("hello world");
    }
    public static void sum(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        return;
    }
    public static void main(String args[]){
        printhelloworld();           // function call.
        sum();
    }
}
// This is to create and call a function with some parameters.
import java.util.*;
public class basics{
    public static void sum(int num1,int num2){
        int sum = num1+num2;
        System.out.println("sum is : " + sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }
}

// agr yahi upr wala que. mein sum hamme return krke dosre variable mein store krke print krna ho to .

import java.util.*;
public class basics{
    public static int sum(int num1,int num2){                       // Here num1, num2 are known as parameters or formal parameters.
        int sum = num1+num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(); 
        int b = scn.nextInt();
        int sum1=sum(a,b);                                          // Here a,b are known as arguments or actual parameters.
        System.out.println("sum is : " + sum1);
        System.out.println("Done!");
    }
}


//acummalator :
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 2, 6, 9};
        int sum = Arrays.stream(arr).sum();
        System.out.println("The array sum is " + sum);
    }
}


//Simple Calculator :

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Enter an arithmetic expression (operand1 operator operand2) or 'q' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                exit = true;
                System.out.println("Exiting...");
                continue;
            }

            String[] tokens = input.split(" ");
            if (tokens.length != 3) {
                System.out.println("Invalid input! Please provide an expression in the form of operand1 operator operand2.");
                continue;
            }

            int operand1, operand2;
            char operator;
            try {
                operand1 = Integer.parseInt(tokens[0]);
                operator = tokens[1].charAt(0);
                operand2 = Integer.parseInt(tokens[2]);
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Invalid input! Please provide valid integers for operands.");
                continue;
            }

            int result;
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 == 0) {
                        System.out.println("Error: Division by zero.");
                        continue;
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Invalid operator! Please use one of the following: +, -, *, /");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}


public class Person {
    // Properties
    String name;
    int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

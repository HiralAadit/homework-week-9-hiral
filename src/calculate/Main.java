package calculate;
/*1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)
 */


import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
      /* Calculator cal = new Calculator();
        Main main = new Main();

        char symbol;
        int a, b;

        //to give input in console use scanner
        Scanner scanner = new Scanner(System.in);

        do {
            // ask user to enter numbers
            System.out.println("Enter first number : = ");
            a = scanner.nextInt();
            System.out.println("Enter second number := ");
            b = scanner.nextInt();
            System.out.println("Select one operator : +,-,*,/");
            char sign = scanner.next().charAt(0);
            symbol = scanner.next().charAt(0);
            cal.calculateResult(a,b,sign);

            //main.calculateResult(a, b, sign);
            System.out.println("Would you like to do more calculation please enter 'y' or 'N' : ");
           // System.out.println("Would you like to do more calculation Please enter “Y” or “N” : ");
           // System.out.println("\n Would you like to do more calculation Please enter (Y/N) :");
            scanner.close();

        }while (symbol=='Y');
    }
}

    */


        //Declaration of scanner to input number
        Scanner scanner = new Scanner(System.in);

        //create object for main class
        Main main = new Main();
        String answer;
        boolean t;

        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second  number:");
        int b = scanner.nextInt();
        System.out.println("Enter one of symbol +,-,*,/");
        char symbol = scanner.next().charAt(0);
        main.calculateResult(a, b, symbol);
        System.out.print("\ndo you want to continue (y/n)          : ");

        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("n")) {
                t = true;
                break;
            } else if (answer.equals("y")) {

                System.out.print("Please enter first number              : ");
                int x = scanner.nextInt();
                System.out.print("Please enter second number             : ");
                int y = scanner.nextInt();
                System.out.print("Please enter one of symbol +,-,*, /    : ");
                char z = scanner.next().charAt(0);
                main.calculateResult(x, y, z);
                System.out.print("\ndo you want to continue (y/n)          : ");
                //scanner closer
                scanner.close();
            }
}

        }



    }

















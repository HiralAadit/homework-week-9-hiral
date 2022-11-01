package homework_week_9hiral;
//3. Write a Java program to reverse an array of integer values.

import java.util.Scanner;

public class P3ReverseArrayInteger {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0;i <arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for(int i = arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


  /*  public static void main(String[] args) {

        System.out.println("Enter number of elements: ");

        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        Integer ar[] = new Integer[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc1.nextInt();
        }
        //display initial array
        System.out.println("The initial array: ");

        for (int j = 0; j < n; j++) {
            System.out.println(ar[j]);
        }


        System.out.println("The reversed array: ");

        for (int j = n - 1; j >= 0; j--) {
            System.out.println(ar[j]);
        }
    }
}

   */








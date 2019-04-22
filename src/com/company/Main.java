package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare an array of 10 integers and initialize them
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strArray = new String[]{"w", "t", "y", "h", "k"};
        int[] intArray1 = new int[]{1, 7, 6, 5, 9};
        int[] intArray2 = new int[]{2, 7, 6, 3, 4};
        String input;
        Scanner keyboard = new Scanner(System.in);

        //Call method to print array backwards
        printBackwards(intArray);
        System.out.println();

       //Call method to print matching arrays
        printMatching(intArray1, intArray2);
        System.out.println();

       //Call method to replaceString
        replaceString(strArray);
        System.out.print("\nEnter the string to reverse: ");
        input = keyboard.nextLine();
        System.out.printf("\n%s\n",reverseString(input));

        //Call method to find length of string
        System.out.printf("Length of input \"%s\" = %d\n", input, lengthOfString(input));

        //Call method oddEvenArray()
        oddEvenArray();
    }

    //Method to print matching elements of 2 int[] arrays
    public static void printMatching(int[] intArray1, int[] intArray2){
        // Given 2 arrays [1,7,6,5,9] and array 2: [2,7,6,3,4] print the matching pairs (7,7) (6,6)
        for (int i = 0; i < intArray1.length; i++) {
            if (intArray1[i] == intArray2[i]) {
                System.out.printf("(%d,%d) ", intArray1[i], intArray1[i]);
            }

        }
    }
    //Method to print array backwards
    public static void printBackwards(int[] intArray) {
        //Print the array backwards
        for (int i = 9; i >= 0; i--) {
            System.out.printf("%d ", intArray[i]);
        }
    }
    //Method to loop through string array and replace "t" with "hello"
    public static void replaceString(String []strArray) {
        //Loop through the strArray and look for "t" and replace with "hello"
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("t")) {
                strArray[i] = "hello";
            }
            System.out.printf("%s\n", strArray[i]);
        }
    }
    //Method to reverse string
    public static String reverseString(String input) {
        //Write a program to print a string in reverse
        //Reverse the string and store output in reverseInput
        String reverseInput = new String();
        for (int i = 0, j = input.length() - 1; i < input.length(); i++, j--) {
            reverseInput = reverseInput + input.charAt(j);
        }
        return reverseInput;
    }
    //Method to find length of string
    public static int lengthOfString(String input) {
        int i = 0;
        for(i = 0; i < input.length(); i++);
        return i;
    }
    //Method to input 10 numbers and print them into oddArray and evenArray
    public static void oddEvenArray() {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.print("Enter 10 numbers: ");

        int[] inArray = new int[10];
        int[] oddArray = new int[10];
        int[] evenArray = new int[10];
        int evenIndex = 0, oddIndex =0;

        for(int i = 0; i < 10; i++) {
            inArray[i] = scan.nextInt();
        }
        System.out.println("oddEvenArray()");
        for(int i = 0; i < 10; i++) {
            if(inArray[i] %2 == 0) {
                evenArray[evenIndex] = inArray[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = inArray[i];
                oddIndex++;
            }
        }
        for(int i = 0; i < oddIndex; i++)
            System.out.println("Odd array " + oddArray[i]);
    }

}

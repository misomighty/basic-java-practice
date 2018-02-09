package ArrayExercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sort arrays of user input
        Scanner sc = new Scanner(System.in);
        // how will I get the user input into an array

        // how will I sort that array of user input

        int[] myArr = sortArr(getArr(3,sc));
        for(int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

    }

public static int[] getArr(int number, Scanner sc) {
        int[] arr = new int[number];
        for(int i = 0; i < number; i++) {
            System.out.println("Enter an integer: ");
            arr[i] = sc.nextInt();
        }

        return arr;
}

public static int sortInt(int a, int b) {
        // if a - b < 0, then b > a
        // if b - a < 0, then a > b
    System.out.println("a is " + a);
    System.out.println("b is " + b);
        if(b == a) {
            return b;
        } else if(b - a < 0) {
            return a;
        } else {
            return b;
        }

}

public static int[] sortArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1; j++) {
                arr[i] = sortInt(arr[j], arr[j+1]);

            }
            System.out.println("i is now: " + i);
            System.out.println("arr[i] is now: " + arr[i]);

        }
        return arr;
}


}

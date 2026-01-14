package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Array arr = new Array();
        int []numbers={1,2,3,4,5,6};

        Array.shiftInsertAtFirst(numbers,4);
//        int[] numbers = new int[3];
//        arr.input(numbers);
//        arr.traversal(numbers);
//
//        arr.revers_traversal(numbers);
//
//
//        arr.update(numbers, 2, 4);
//        arr.delete(numbers, 2);
//        int result = arr.linearSearch(numbers, 7);
//        if(result!=-1)
//        System.out.println("your value is at index "+result);
//        else
//            System.out.println("index not found");


        System.out.println("enter number");
        int x = scanner.nextInt();
        int a = arr.binarySearch(numbers, 0, 5, x);
        System.out.println(a);

        // System.out.println(Arrays.toString(numbers));

        // for (int i=0; i<numbers.length;i++)
        // System.out.println(numbers[i]);

        // for(int num :numbers)
        // System.out.println(num);
        //

    }
}
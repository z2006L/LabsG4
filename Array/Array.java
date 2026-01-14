package Array;

import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);

    public void traversal(int[] numbers) {
        System.out.println("the traversal array elements are:");
        System.out.println("numbers[index] = element.");
        for (int i = 0; i < numbers.length; i++)
            System.out.println("numbers[" + i + "]" + "  =  " + numbers[i]);

    }

    public void revers_traversal(int[] numbers) {
        System.out.println("the reverse traversal array elements are:");

        System.out.println("numbers[index] = element.");
        for (int i = numbers.length - 1; i >= 0; i--)
            System.out.println("numbers[" + i + "]" + "  =  " + numbers[i]);

    }

    public void input(int[] numbers) {
        System.out.println("Please enter " + numbers.length + " numbers:");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();

    }

    public void update(int a[], int index, int element){
        if(index <0 || index>a.length)
            System.out.println("index"+index+"not found");
        else a[index]=element;
    }

    public void delete(int a[], int index){
        if(index <0 || index>a.length)
            System.out.println("index"+index+"not found");
        else a[index]=0;
    }

    public int linearSearch(int []a, int val){
        for(int i=0; i<a.length-1;i++){
            if(a[i]==val)
                return i;

        }

        return -1;
    }


    public int binarySearch(int []a, int findex,int lindex, int val){

        while (findex<=lindex){
            int mid = (findex+lindex)/2;
            if (val==a[mid])
                return mid;
            if (val<a[mid])
                lindex=mid-1;
            if (val>a[mid])
                findex=mid+1;

        }
        return -1;
    }

    public void shiftLeftDelete(int []a, int index){
        for (int i=index; i<a.length-1;i++)
            a[i]=a[i+1];
        a[a.length-1]=Integer.MIN_VALUE;

    }

    public static void shiftInsertAtFirst(int[] a, int value) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = value;
    }

    public static void deleteByValue(int[] g, int value) {
        if (g[0] == value) {
            int i = 0;
            for (; i < g.length - 1; i++) {
                g[i] = g[i + 1];
            }
            g[i] = 1000;
        } else {
            int j = 0;
            while (j < g.length - 1) {
                if (g[j + 1] == value) {
                    int i = j + 1;
                    for (; i < g.length - 1; i++) {
                        g[i] = g[i + 1];
                    }
                    g[i] = 1000;
                    break;
                }
                j++;
            }
            if (j == g.length - 1) {
                System.out.println("It is no found..!");
            }

        }
    }
        public void insertRight(int[] g, int value, int newValue) {

            if (g[g.length - 1] != 1000) {
                System.out.println("Array is full..!");
                return;
            }
            if (g[0] == value) {

                int i = g.length - 1;
                while (i > 1) {
                    g[i] = g[i - 1];
                    i--;
                }
                g[1] = newValue;
                return;
            }
            int j = 0;
            while (j < g.length - 1) {

                if (g[j] == value) {
                    int i = g.length - 1;
                    while (i > j + 1) {
                        g[i] = g[i - 1];
                        i--;
                    }
                    g[j + 1] = newValue;
                    return;
                }
                j++;
            }
            System.out.println("It is not found..!");
        }

    }
//the homework shiftinsert


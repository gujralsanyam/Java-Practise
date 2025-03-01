package ArrayDSAPractiseQuestion;

import java.util.Scanner;

public class Rotation {

        public static void LeftRotate(int [] arr, int n)
        {
            int len = arr.length;
            n = n%len;
            rotateArray(arr, 0, n-1);
            rotateArray(arr, n, len-1);
            rotateArray(arr, 0, len-1);
        }


        public static void RightRotate(int[] arr, int n)
        {
            int len = arr.length;
            n = n % len;
            rotateArray(arr,0, n-1);
            rotateArray(arr, n, len-1);
            rotateArray(arr, 0, len-1);
        }

        public static void rotateArray(int[] arr, int start, int end)
        {
            while(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of array");
            int size = scanner.nextInt();

            int[] arr = new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i] = scanner.nextInt();
            }

            int n = scanner.nextInt();
            char choice = scanner.next().charAt(0);

            if(choice == 'L' || choice == 'l')
            {
                LeftRotate(arr,n);
                System.out.println("Array after left rotation");
            }
            else if(choice == 'R' || choice == 'r')
            {
                RightRotate(arr,n);
                System.out.println("Array after right rotatation");
            }
            for(int num : arr){
                System.out.print(num + "");
            }
            scanner.close();
        }
    }


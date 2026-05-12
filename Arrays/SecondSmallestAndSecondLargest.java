import java.util.Scanner;

class SecondSmallestAndSecondLargest{
    public static void main(String[] args){
        int arr[] = new int[7];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 8;
        arr[5] = 8;
        arr[6] = 20;
        
        Solution.Result(arr);

    }
}

class Solution{
    static void Result(int arr[]){
        int largest = Integer.MIN_VALUE;
        int Secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int Secondsmallest = Integer.MAX_VALUE;
        for (int i = 0 ; i<=arr.length-1;i++){
            if(arr[i]>=largest){
                Secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > Secondlargest && arr[i] != largest) {
            Secondlargest = arr[i];
        }
            if(arr[i]<=smallest){
                Secondsmallest = smallest;
                smallest = arr[i];
            }
             else if (arr[i] < Secondsmallest && arr[i] != smallest) {
            Secondsmallest = arr[i];
        }
        }

        System.out.println("Second Smallest: " + Secondsmallest);
        System.out.println("Second Largest: " + Secondlargest);
        
    } 
}
import java.util.Scanner;

class deletion{
    public static void main(String[] args){
        char arr[] = new char[7];
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
        arr[5] = 'f';
        System.out.println("Enter the position you want to delete the element :");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        deleteElement.delete(arr , pos , sc);

         System.out.println("Array after deletion:");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

class deleteElement{
    static void delete(char arr[] , int pos , Scanner sc){
        for (int i = pos-1; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
    }
}
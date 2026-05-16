class CheckArrayIsSorted{
    public static void main(String args[]){
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 3;
        arr[4] = 5;
        arr[5] = 6;

        boolean s = Result.findResult(arr);

        if(s){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}

class Result{
    static boolean findResult(int arr[]){
        int j = 1;
        for(int i = 0;i<arr.length-1; i++){
            if(arr[j]<arr[i]){
                return false;
            }
            j++;
        }
        return true;
    }
}
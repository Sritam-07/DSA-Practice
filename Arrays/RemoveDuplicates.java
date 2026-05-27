class RemoveDuplicates{
    public static void main(String args[]){
        int arr[] = new int[7];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 3;
        arr[6] = 3;

        int newLength = Result.findResult(arr); 
        
        System.out.println("New length: " + newLength); 
        
       
        System.out.print("Unique array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");  
        }

    }
}

class Result{
    static int findResult(int arr[]){
        int i = 0;
        for(int j = 1 ; j<=arr.length-1;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;      
}
}
public class insertion {
    public static void main(String args[]){
        char arr[] = new char[7];
        arr[0] = 'a';
        arr[1] = 'b';
        arr[2] = 'c';
        arr[3] = 'd';
        arr[4] = 'e';
        arr[5] = 'f';
        char e = 'j';
        int pos = 3;

        test.insert(arr, pos, e);

    }
}

class test {
    static void insert(char arr[],int pos,char e){
        for (int i = arr.length-1; i>pos-1 ;i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = e;

        for(int i = 0 ; i<=arr.length-1; i++){
            System.out.print((arr[i])+",");
        }
    }
}
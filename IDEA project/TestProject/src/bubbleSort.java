public class bubbleSort {
    public static void main(String[] args) {
        // we would like to use bubble sort here.

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println("==========the generated array==========");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        myTools mt = new myTools();
        mt.bubbleSort(arr);

    }


}

class myTools {
    public void bubbleSort(int[] arr){

        //1,4,3,5,3,5,10

        // to sort array above with length of 7
        // we need find "biggest" int 6 times, so 6 iteration for outer loop
        for (int i = 0; i < arr.length-1; i++){// find big number n-1 times
            for (int j = 0; j < arr.length-1-i; j++){ // swap in inner loops, note the later iteration swap less
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("==========the new generated array=============");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
}

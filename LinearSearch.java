public class LinearSearch {



    public static void printIndex(int result){
            System.out.println(result + " ");
        
    }

    public static int findIndexOfElement(int[] arr, int target){
            for(int i = 0; i <arr.length; i++ ){
                if (arr[i] == target){
                    return i;
                }
            }

            return -1;
    }


    public static void main(String[] args){

        int[] arr = {2,5,3,7,5,9,10};

        printIndex(findIndexOfElement(arr, 7));
        printIndex(findIndexOfElement(arr, 1));
   
    }
}
public class BinarySearch {



    public static void printIndex(int result){
            System.out.println(result + " ");
        
    }

    public static int findIndexOfElement(int[] arr, int target){
            int left = 0;
            int right = arr.length -1;

            while (left < right){
                int mid = (left+right)/2;

                if (arr[mid] == target){
                    return mid;
                } else if (arr[mid] > target){
                    right = mid;
                } else {
                    left = mid +1;
                }
            }

            return -1;
    }


    public static void main(String[] args){

        int[] arr = {2,3,6,7,9,10};

        printIndex(findIndexOfElement(arr, 9));
        printIndex(findIndexOfElement(arr, 1));
   
    }
}
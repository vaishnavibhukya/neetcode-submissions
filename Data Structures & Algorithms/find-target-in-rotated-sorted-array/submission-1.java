class Solution {
    public int search(int[] arr, int k) {
        //Arrays.sort(arr);


        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;


    }
}
     
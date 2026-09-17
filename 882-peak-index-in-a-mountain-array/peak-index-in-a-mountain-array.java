class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return peakIndexInMountainArray(arr, 0, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr, int left, int right){
        if(left==right){
            return left;
        }


        int mid = left+(right - left)/2;

        if(arr[mid]<arr[mid+1]){
            return peakIndexInMountainArray(arr, mid+1, right);
        }else{
            return peakIndexInMountainArray(arr, left, mid);
        }




    }
}
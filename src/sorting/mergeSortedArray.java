//package sorting;
//import java.util.*;
//
//public  class mergeSortedArray{
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i=0,j=0,k=0;
//        int[] arr = new int[m+n];
//        while(i<m && j<n){
//            if(nums1[i] < nums2[j]){
//                arr[k++] = nums1[i++];
//            }
//            else{
//                arr[k++] = nums2[j++];
//            }
//        }
//        while(i<m){
//            arr[k++] = nums1[i++];
//        }
//        while(j<n){
//            arr[k++] = nums2[j++];
//        }
//        for(k=0;k<m+n;k++){
//            nums1[k] = arr[k];
//        }
//    }
//
//    public static void main(String[] args) {
//        Random rand = new Random();
//        int n = rand.nextInt(10);
//        int m = rand.nextInt(10);
//        int[] arr1 = new int[n+m];
//        for (int i = 0; i < n; i++) {
//            arr1[i] = rand.nextInt(100);
//        }
//
//        int[] arr2 = new int[m];
//        for (int i = 0; i < m; i++) {
//            arr2[i] = rand.nextInt(100);
//        }
//
//    int[] a = new mergeSortedArray(arr1,n,arr2,m);
//
//    }
//}

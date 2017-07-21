import java.util.*;
import java.io.*;
class BinarySearch{
  public int search(int[] arr,int x,int l,int n){

    int mid=l+(n-l)/2;

    if(arr[mid]==x){
      return mid;
    }
    if(x>arr[mid]){
      return search(arr,x,mid+1,n);
    }
    else if (x<arr[mid]) {
      return search(arr,x,l,mid-1);
    }
    return -1;
  }
  public static void main(String...args){
    int[] arr={1,2,4,23,44,45,62};
    int n=arr.length;
    BinarySearch bs= new BinarySearch();
    int j=bs.search(arr,23,0,n-1);
    System.out.println(j);
  }
}

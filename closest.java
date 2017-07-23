import java.util.*;
import java.io.*;
class Closest{
  public int search(int arr[],int arr2[],int x){
      int m=arr.length;
      int n=arr2.length;
      int diff=Integer.MAX_VALUE;
      int l=0;
      int res_l=0;
      int res_r=0;
      int r=n-1;
      while(l<m && r>0){
        if(Math.abs(arr[l]+arr2[r]-x)<diff){
          res_l=l;
          res_r=r;
          diff=Math.abs(arr[l]+arr2[r]-x);
        }
          if(arr[l]+arr2[r]<x){
            System.out.println(l+"  "+r+" "+diff);
            l++;

          }
          else{
            r--;
          }
      }
      System.out.print((arr[res_l]+" "+arr2[res_r])+" "+diff);
    return 1;
  }
  public static void main(String...args){
    int arr[]={1, 4, 5, 7};
    int arr2[]={10, 20, 30, 40};
    int x=38;
    Closest cls = new Closest();
    cls.search(arr,arr2,x);
  }
}

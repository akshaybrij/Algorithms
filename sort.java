import java.util.*;
import java.io.*;
class Sort{
  public void sort(int[] arr){
   int n=arr.length;
   for(int i=0;i<n;i++){
     int min=i;
     for(int j=i+1;j<n;j++){
       if(arr[j]<arr[min]){
         min=j;
       }
     }
     int temp=arr[i];
     arr[i]=arr[min];
     arr[min]=temp;
   }
  }
  protected void printOut(int[] arr){
    for(int y=0;y<arr.length;y++){
      System.out.print(arr[y]+" ");
    }
  }
  }
class BubbleSort{
    public void sort(int[] arr){
      int n=arr.length;
     for(int k=0;k<n;k++){
      for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
    }
    }
    public void printOut(int[] arr){
      for(int y=0;y<arr.length;y++){
        System.out.print(arr[y]+" ");
      }
    }
  }
class Sorting{
  public static void main(String...args){
    int[] arr={22,1,23,53,12,32,14};
    Sort s=new Sort();
    BubbleSort bs=new BubbleSort();
    s.sort(arr);
    s.printOut(arr);  
    bs.sort(arr);
    bs.printOut(arr);
  }
}

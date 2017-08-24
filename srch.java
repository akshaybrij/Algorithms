import java.util.*;
import java.io.*;
class Sort{
  int temp;
  public void bubble(int[] arr){
    int n=arr.length;
      for(int k=0;k<n-1;k++){
    for(int i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
        temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
    }}
    for(int j=0;j<arr.length;j++){
      System.out.println(arr[j]);
    }
  }
  public void insertion(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
    }
    for(int j=0;j<arr.length;j++){
      System.out.print(arr[j]+" ");
    }
  }
  public int jump(int[] arr,int x){
    int step=(int)Math.sqrt(arr.length);
    int prev=0;
    while(arr[step]<x){
      prev=step;
      step+=4;
    }
    if(arr[step]>x){
      for(int i=prev;i<step;i++){
        if(x==arr[i]){
          return i;
        }
      }
    }
    return -1;
  }
  public void QuickSort(int[] arr){
    int pivot=arr[arr.length-1];
    int i=0;
    int j=0;
    for(int k=0;k<arr.length;k++){
      if(arr[k]<pivot){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i+=1;
        j+=1;
      }
      else{
        j+=1;
      }
    }
    int tmp=arr[i];
    arr[i]=pivot;
    pivot=tmp;
    for(int l=0;l<arr.length;l++){
      System.out.println(arr[l]);
    }
  }
  public static void main(String...args){
    Sort s=new Sort();
    int arr[]={1,2,4,3,22,32,11,34};
    int sarr[] = {10, 7, 8, 9, 1, 5};
    s.bubble(arr);
    s.insertion(arr);
    int res=s.jump(arr,22);
    System.out.println("Res"+res);
    s.QuickSort(sarr);
  }
}

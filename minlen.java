import java.util.*;
import java.io.*;
class Min{
  int s;
  int e;
  int max,min;
  public void printArr(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
      if(arr[i]>arr[i+1]){
        s=i;
        break;
      }
    }
    for(int i=n-1;i>0;i--){
      if(arr[i]<arr[i-1]){
        e=i;
        break;
      }
    }
    min=arr[s];
    max=arr[s];
    for(int i=s;i<=e;i++){
      if(min>arr[i]){
        min=arr[i];
      }
      if(max<arr[i]){
        max=arr[i];
      }
    }
    for(int i=0;i<s;i++){
      if(arr[i]>min){
        s=i;
        break;
      }
    }
    for(int i=e+1;i<n;i++){
      if(max>arr[i]){
        e=i;
        break;
      }
    }
    System.out.print(s+" "+e);
  }
  public static void main(String...args){
    int arr[]={0, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
    Min mina=new Min();
    mina.printArr(arr);
  }
}

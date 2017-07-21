import java.io.*;
import java.util.*;
class JumpSearch{
  public int search(int[] arr,int x){
    int n=arr.length;
    int step=(int)Math.floor(Math.sqrt(n));
    int prev=0;
    while(arr[step]<x){
      prev=step;
      step+=Math.floor(Math.sqrt(n));
    }
    if(arr[step]>x){
      for(int i=prev;i<step;i++){
        if(arr[i]==x){
          return i;
        }
      }
    }
    return -1;
  }
  public static void main(String...args){
    int[] arr={1,2,3,4,12,23,34,45,56,78};
    int x=56;
    JumpSearch js=new JumpSearch();
    int j=js.search(arr,x);
    System.out.println(j);
  }
}

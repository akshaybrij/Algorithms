import java.util.*;
import java.io.*;
class LIS{
  public void lis(int[] arr){
    int n=arr.length;
    int[] index=new int[arr.length];
    int i=0;
    int j=1;
    for(int k=0;k<arr.length;k++){
      index[k]=1;
    }
    _lis(arr,index,j);
  }
  public void _lis(int[] arr,int[] index,int j) throws ArrayIndexOutOfBoundsException{
    for(int k=0;k<j;k++){
      if(arr[k]<arr[j]){
        if(index[j]<=index[k]+1){
          index[j]=index[k]+1;
        }
      }
    }
    if(j<index.length){
    j+=1;
    }
    for(int l=0;l<index.length;l++){
      System.out.print(index[l]+"---");
    }
    System.out.println("break");
    try{
    _lis(arr,index,j);
  }
  catch(ArrayIndexOutOfBoundsException e){
    System.out.println("That's all");
  }
  }
  public static void main(String...args){
    int[] arr={10, 22, 9, 33, 21, 50, 41, 60, 80};
    LIS lis= new LIS();
    lis.lis(arr);
  }
}

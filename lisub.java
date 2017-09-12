import java.util.*;
import java.io.*;
class Lisub{
  public int compute(int[] L){
    int n=L.length;
    int comp;
    int resultant=0;
    int lis[]=new int[n];
    for(int i=0;i<n;i++){
      lis[i]=1;
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        if(L[i]>L[j]){
           comp=lis[j]+1;
           lis[i]=Math.max(lis[i],comp);
            if(lis[i]>resultant){
              resultant=lis[i];
            }
        }
      }
    }
  return resultant;
  }
  public static void main(String...args){
    Lisub li=new Lisub();
    int L[]={ 10, 22, 9, 33, 21, 50, 41, 60 };
    System.out.print(li.compute(L));
  }
}

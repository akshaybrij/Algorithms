import java.io.*;
import java.util.*;
class Combinator{
  public int min(int n,int k){
    if(n>k){
      return k;
    }
    else if(n==k){
      return k;
    }
    else{
      return n;
    }
  }
  public int combine(int n,int k){
    int Max=100;
    int C[][] = new int[Max][Max];
    int i,j;
    for(i=0;i<=n;i++){
      for(j=0;j<=min(i,k);j++){
        if(j==0 || j==i ){
          C[i][j]=1;
        }
        else{
          C[i][j]=C[i-1][j-1]+C[i-1][j];
        }
      }
    }
    return C[n][k];
  }
  public static void main(String...args){
    Combinator c=new Combinator();
    System.out.println(c.combine(4,2));
  }
}

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
  public int LongestSub(char[] X,char[] Y){
    int m=X.length;
    int n=Y.length;
    int L[][]=new int[m+1][n+1];
    for(int i=0;i<=m;i++){
      for(int j=0;j<=n;j++){
        if(i==0 || j==0){
          L[i][j]=0;
        }
        else if(X[i-1]==Y[j-1]){
          L[i][j]=L[i-1][j-1]+1;
        }
        else{
          L[i][j]=max(L[i-1][j],L[i][j-1]);
        }
      }
    }
    return L[m][n];
  }
  public int max(int c,int b){
    if(c>b){
      return c;
    }
    else if(c==b){
      return c;
    }
    else{
      return b;
    }
  }
  public static void main(String...args){
    Combinator c=new Combinator();
    System.out.println(c.combine(4,2));
    String X="AGGTAB";
    String Y="GXTXAYB";
    char[] arr=X.toCharArray();
    char[] ary=Y.toCharArray();
    System.out.println(c.LongestSub(arr,ary));
  }
}

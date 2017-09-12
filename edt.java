import java.util.*;
import java.io.*;
class Edt{
  public int compute(String g,String f){
    int m=g.length();
    int n=f.length();
    int[][] L=new int[m+1][n+1];
    int k=0;
    for(int i=0;i<m+1;i++){
      L[0][i]=k;
      L[i][0]=k;
      k+=1;
    }
    char[] v=g.toCharArray();
    char[] p=f.toCharArray();
    for(int i=1;i<=m;i++){
          for(int j=1;j<=n;j++){
          if(v[i-1]==p[j-1]){
             L[i][j]=L[i-1][j-1];
        }
        else{
          L[i][j]=Math.min(L[i-1][j],Math.min(L[i][j-1],L[i-1][j-1]))+1;
        }
      }
    }
    return L[m][n];
  }
  public static void main(String...args){
    Edt edt=new Edt();
    String g="Sunday";
    String f="Saturday";
    System.out.println(edt.compute(g,f));
  }
}

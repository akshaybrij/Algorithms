import java.util.*;
import java.io.*;
class MaxsoFar{
  public int mxfar(int num[]){
     int l=num.length;
     int max_far=0;
     int max_end=0;
     for(int i=0;i<=l-1;i++){
       if(max_end+num[i]>0){
        max_end=max_end+num[i];
       }
       else{
         max_end=0;
       }
       if(max_end>max_far){
         max_far=max_end;
       }
     }
     return max_far;
  }
  public int func(int m[][]){
    int ml=m.length;
    int k=m[0].length;
    int S[][]=new int[ml][k];
    int hm=0;
    for(int i=0;i<ml;i++){
       S[i][0]=m[i][0];
    }
    for(int j=0;j<k;j++){
      S[0][j]=m[0][j];
    }
    for(int p=1;p<ml;p++){
      for(int h=1;h<k;h++){
        if(m[p][h]==1){
          S[p][h]=Math.min(S[p-1][h],Math.min(S[p][h-1],S[p-1][h-1]))+1;
          if(S[p][h] > hm){
            hm=S[p][h];
          }
        }
        else{
          S[p][h]=0;
        }
      }
    }
    return hm;
  }
  public static void main(String...args){
    MaxsoFar mf=new MaxsoFar();
    int num[]={-2, -3, 4, -1, -2, 1, 5, -3};
     System.out.println(mf.mxfar(num));
     int M[][]={{0, 1, 1, 0, 1},
                   {1, 1, 0, 1, 0},
                   {0, 1, 1, 1, 0},
                   {1, 1, 1, 1, 0},
                   {1, 1, 1, 1, 1},
                   {0, 0, 0, 0, 0}};
    System.out.println(mf.func(M));
  }
}

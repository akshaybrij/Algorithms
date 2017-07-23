import java.util.*;
import java.io.*;
class MinCost{
  public void cost(int cost[][],int[] target){
    int l=target[0];
    int m=target[1];
    int tc[][]=new int[l+1][m+1];
    tc[0][0]=cost[0][0];
    for(int i=1;i<=l;i++){
      tc[i][0]=tc[i-1][0]+cost[i][0];
    }
     for(int j=1;j<=m;j++){
       tc[0][j]=tc[0][j-1]+cost[0][j];
     }
     for(int i=1;i<=l;i++){
       for(int j=1;j<=m;j++){
         tc[i][j]=compute(tc[i-1][i-1],tc[i-1][j],tc[i][j-1]) + cost[i][j];
           System.out.println(tc[i][j]);
       }

     }

  }
  public int compute(int x,int y,int z){
   if(x<y && x<z){
     return x;
   }
   else if(y<x && y<z){
     return y;
   }
   else{
     return z;
   }
  }
  public static void main(String...args){
    int cost[][]={ {1, 2, 3},
                  {4, 8, 2},
                  {1, 5, 3} };
    int[] target={2,2};
    MinCost mc= new MinCost();
    mc.cost(cost,target);
  }
}

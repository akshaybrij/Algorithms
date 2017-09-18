import java.util.*;
import java.io.*;
class Knight{
  int n=8;
  public void move(int m[][]){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        m[i][j]=-1;
      }
    }
    m[0][0]=0;
    int X[] = {2, 1, -1, -2, -2, -1, 1, 2};
    int Y[] = {1, 2, 2, 1, -1, -2, -2, -1};
    if(solve(0,0,m,1,X,Y)){
        printSol(m);
    }
  }
  public void printSol(int[][] m){
    for(int i=0;i<8;i++){
      for(int j=0;j<8;j++){
        System.out.print(m[i][j]);
        System.out.println();
      }
    }
  }
  public boolean solve(int xt,int yt,int[][] m,int moves,int[] X,int[] Y){
    int mx,my;
    for(int k=0;k<8;k++){
      mx=xt+X[k];
      my=yt+Y[k];
      if(moves == 64){
        return true;
      }
      if(isSafe(m,mx,my)){
        m[mx][my]=moves;
        System.out.println(moves);
        if(solve(mx,my,m,moves + 1,X,Y)){
          System.out.println('s');
              return true;
        }
        else{
            m[mx][my]=-1;
        }
      }
    }
    return false;
  }
  public boolean isSafe(int m[][],int x,int y){
    if(x >= 0 && x < n && y >= 0 &&
                y < n && m[x][y] == -1){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String...args){
    Knight k=new Knight();
    int[][] m=new int[8][8];
    k.move(m);
  }
}

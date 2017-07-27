import java.util.*;
import java.io.*;
class Knapsack{
  public int weigh(int[] val,int[] wt, int w){
    int n=val.length;
    int total=wt[0]+wt[1];
    int i=0;
    int value=0;
    while(total<w && i<wt.length){
        total=wt[i]+wt[i+1];
        value=val[i]+val[i+1];
        i+=1;
    }
    return value;
  }
  public static void main(String...args){
    int val[] = new int[]{60, 100, 120};
    int wt[] = new int[]{10, 20, 30};
    int  w = 50;
    Knapsack ks=new Knapsack();
    int result=ks.weigh(val,wt,w);
    System.out.println(result);
  }
}

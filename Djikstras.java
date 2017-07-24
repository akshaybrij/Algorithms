import java.util.*;
import java.io.*;
class ShortestPath{
  public void djikstra(int[][] arr,int src){
    int n=arr.length;
    Boolean[] slot=new Boolean[n];
    int[] dist=new int[n];
    int u,v;
    for(int i=0;i<n;i++){
      dist[i]=Integer.MAX_VALUE;
      slot[i]=false;
    }
    dist[0]=0;
    for(int i=0;i<n;i++){
      u=mindistance(i,dist);
      slot[u]=true;
      for(int p=0;p<arr.length;p++){
      if(slot[p]==false && arr[u][p]!=0 && dist[u]+arr[u][p]<dist[p] && dist[u]!=Integer.MAX_VALUE){
        dist[p]=dist[u]+arr[u][p];
      }
    }
    }
    printOut(dist);
  }
  public void printOut(int[] dist){
   for(int i=0;i<dist.length;i++){
     System.out.println(dist[i]);
   }
  }
  public int mindistance(int i,int[] dist){
    int min=Integer.MAX_VALUE;
    int min_index=-1;
    if(dist[i]<min){
      min=dist[i];
      min_index=i;
    }
    return min_index;
  }
  public static void main(String...args){
    int arr[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
    ShortestPath shrt=new ShortestPath();
    shrt.djikstra(arr,0);
  }
}

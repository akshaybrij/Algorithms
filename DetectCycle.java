import java.util.*;
import java.io.*;
class Graph{
  Edge edge[];
  int v;
  int e;
  class Edge{
    int src,dest,weight;
  }
  Graph(int V,int E){
     v=V;
     e=E;
     edge=new Edge[v];
    for(int i=0;i<v;i++){
      edge[i]=new Edge();
    }
  }
  public void isCycle(){
   int[] parent=new int[v];
   for(int i=0;i<v;i++){
     parent[i]=-1;
   }
   for(int i=0;i<v;i++){
     int x=find(parent,edge[i].src);
     int y=find(parent,edge[i].dest);
     if(x==y){
       System.out.println("Cycled");
     }
     else{
      System.out.println("UnCycled");
     }
     Union(parent,x,y);
   }
  }
  public void Union(int[] parent,int x,int y){
    int xst=find(parent,x);
    int yst=find(parent,y);
    parent[xst]=yst;
  }
  public int find(int[] parent,int l){
    if(parent[l]==-1){
     return l;
  }
   return find(parent,parent[l]);
  }
  public static void main(String...args){
    int V=3;
    int E=3;
    Graph g=new Graph(V,E);
    g.edge[0].src=0;
    g.edge[0].dest=1;
    g.edge[1].src=1;
    g.edge[1].dest=2;
    g.edge[2].src=2;
    g.edge[2].dest=0;
    g.isCycle();
  }

}

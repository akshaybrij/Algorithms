import java.util.*;
import java.io.*;
class Cpair{
  public void closestpair(int[][] pt){
      int n=pt.length;
      int mid;
      int str[][]=new int[10][10];
      if(n%2==0){
        mid=n/2;
      }
      else{
        mid=n/2+1;
      }
      double dl=minim(pt,0,mid-1);
      double dr=minim(pt,mid,n-1);
      double mn=Math.min(dl,dr);
      int mL=midline(pt);
      nearby(mL,pt,mn,str);
      for(int i=0;i<str.length;i++){
        System.out.println(str[i][0]);
      }
   }
   public int midline(int[][] pt){
      int bn=pt.length;
      int v=0;
      for(int i=0;i<bn;i++){
         v+=pt[i][0];
      }
      return v/2;
   }
   public void nearby(int v,int[][] pt,double mn,int[][] str){
     int l=0;
     for(int i=0;i<pt.length;i++){
       if(Math.abs(v-pt[i][0])<=mn){
         str[l]=pt[i];
         l+=1;
       }
     }
   }
  public double minim(int[][] pt,int s,int l){
   int m=l-s;
   int X[] = new int[m];
   int Y[]=new int[m];
   for(int i=0;i<m;i++){
     X[i]=pt[i][0];
     Y[i]=pt[i][1];
   }
   double min=213456.00;
   double r;
   for(int j=0;j<m-1;j++){
    r=Math.sqrt((X[j+1]-X[j])*(X[j+1]-X[j])+(Y[j+1]-Y[j])*(Y[j+1]-Y[j]));
    if(r<min){
      min=r;
    }
    return min;
   }
   return -1;
  }
  public static void main(String...args){
    Cpair cp=new Cpair();
    int pt[][]={{2, 3}, {12, 30}, {40, 50}, {5, 1}, {12, 10}, {3, 4}};
    cp.closestpair(pt);
  }
}

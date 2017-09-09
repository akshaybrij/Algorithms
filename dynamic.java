import java.util.*;
import java.io.*;
class Dynamic{
  int max=100;
  int[] lup=new int[100];
  public void inita(){
    for(int i=0;i<max;i++){
      lup[i]=-1;
    }
  }
  public int fib(int n){
    if(lup[n]==-1){
    if(n<=1){
      return n;
    }
    else{
      lup[n]=fib(n-1)+fib(n-2);
    }
  }
  return lup[n];
}
public int tabulation(int n){
int f[]=new int[n+1];
f[0]=0;
f[1]=1;
for(int i=2;i<=n;i++){
  f[i]=f[i-2]+f[i-1];
}
return f[n];

}
  public static void main(String...args){
    Dynamic d=new Dynamic();
    d.inita();
    int resultant=d.fib(5);
    System.out.println(resultant);
    System.out.println(d.tabulation(5));
  }
}

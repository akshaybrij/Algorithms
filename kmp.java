import java.util.*;
import java.io.*;
class Kmp{
  public void searchString(int i,int j,char[] text,char[] pattr){
    int k=text.length;
     for(int l=0;l<k;l++){
       if(i==k){
         System.exit(1);
       }
       if(j==pattr.length){
         j=j-1;
         System.out.println("Pattern Index"+(i-pattr.length)+" "+(i-1));
         searchString(i,j,text,pattr);
       }

       if(text[i]==pattr[j] && i<k){
         j+=1;
         i+=1;
       }
       else{
         if(j!=0){
         searchString(i,j-1,text,pattr);
       }
       else{
         i+=1;
       }
       }
     }
  }
  public void compattern(String txt,String pat){
     int i=0;
     int j=0;
     char[] text=txt.toCharArray();
     char[] pattr=pat.toCharArray();
     searchString(i,j,text,pattr);
  }
  public static void main(String...args){
    Kmp kmp=new Kmp();
    String txt = "AAAAABAAABA";
    String pat = "AAAA";
    kmp.compattern(txt,pat);
  }
}

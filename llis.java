import java.util.*;
import java.io.*;
class Stack{
static int max=1000;
int top;
int[] a=new int[max];
Stack(){
top = -1;
}
public boolean push(int x){
  if(top>=max){
    System.out.println("Overflow");
  }
  else{
    a[++top]=x;
    return true;
  }
  return false;
}
public int pop(){
  if(top<0){
    System.out.println("Underflow");
  }
  else{
    return a[top--];
  }
  return -1;
}
}
class StringRev{
  public void reverse(String s){
    if(s.length()==0){
      System.out.println(s);
    }
    else{
      System.out.print(s.charAt(s.length()-1));
      reverse(s.substring(0,s.length()-1));
    }
  }
  public void charrev(String[] s){
     System.out.println(s[0]);
  }
  public static void main(String...args){
    StringRev rev=new StringRev();
    String s="My Name is Jarvis";
    String arr[]={"a#bc"};
    rev.reverse(s);
    rev.charrev(arr);
    Stack sta=new Stack();
    sta.push(10);
    sta.push(20);
    sta.push(30);
    System.out.println(sta.pop());
  }
}

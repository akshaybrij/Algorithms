function Even(){
}
function Stack(){
  this.count=0;
  this.storage={}
}
Stack.prototype.push=function(val){
  this.storage[this.count]=val;
  this.count++;
}
Stack.prototype.pop=function(){
  this.count--;
  delete this.storage[this.count-1];
  console.log(this.storage[this.count-1]);
}
Stack.prototype.peek=function(){
  console.log(this.storage[this.count-1]);
}
Even.prototype.getven=function(val){
    var cnt=0;
  for(var i=0;i<val.length;i++){
     for(var j=0;j<val.length;j++){
       if(val[i]!= val[j]){
         if((val[i]+val[j])%2==0){
            cnt++;
         }
     }
   }
  }
  return cnt;
}
Even.prototype.palindrome=function(val){
  var letter=[];
  var c=val;
  var rc="";
  for(var i=0;i<val.length;i++){
    letter.push(val[i]);
  }
  for(var i=0;i<val.length;i++){
    rc+=letter.pop();
  }
  if(c==rc){
    console.log("palindrome");
  }
  else{
    console.log("Not palindrome");
  }
}
var x=new Even();
var s=new Stack();
var arr=[2,4,6,8];
var cn=x.getven(arr);
console.log(cn);
x.palindrome("BoB");
s.push(12);
s.push(14);
s.push(17);
s.pop();
s.peek();

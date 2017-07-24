function Egypt(){
}
Egypt.prototype.fraction=function(m,n){
if(n%m==0){

}
if(m%n==0){

}
else{
  if(n>m){
  var l=Math.ceil(n/m);
  console.log("1/"+l);
  e.fraction((m*l)-n,n*l);
}
}
}
function Schedule(){
}
Schedule.prototype.sched=function(val){
    var temp;
for(var i=0;i<val.length-1;i++){
  for(var i=0;i<val.length-1;i++){
  if(val[i][2]<val[i+1][2]){
    temp=val[i];
    val[i]=val[i+1];
    val[i+1]=temp;
  }
}}
var arr=new Array(val.length);
var slot=new Array(val.length);
for(var i=0;i<slot.length;i++){
  slot[i]=false;
}
for(var i=0;i<arr.length-1;i++){
var o=val[i][1];
var k=val[i][2];
for(var g=o-1;g>=0;g--){
  if(slot[g]==false){
      arr[g]=k;
      slot[g]=true;
      console.log(k);
      break;
  }
}
console.log(arr);
}

}
var e=new Egypt();
var sch=new Schedule();
var sc=[['a', 2, 100], ['b', 1, 19], ['c', 2, 27],
                   ['d', 1, 25], ['e', 3, 26]];
sch.sched(sc)
e.fraction(6,14);

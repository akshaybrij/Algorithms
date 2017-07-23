function Job(){
  var id;
  var prof;
  var deadline;
}
function closest(){
  var res_l=0;
  var res_r=0;

}
closest.prototype.close=function(val,val1,x){
  var n=val.length;
  var m=val1.length;
  var diff=Number.POSITIVE_INFINITY;
  var l=0;
  var r=m;
  while(l<n-1 && r>0){
    if(Math.abs(val[l]+val1[r]-x)<diff){
        diff=Math.abs(val[l]+val1[r]-x);
        res_l=l;
        res_r=r;
    }
    if(Math.abs(val[l]+val1[r])<x){
      console.log(l+" "+r);
      l++;
    }
    else{
      r--;
    }
  }
  return val[l]+"---"+val1[r]+"---"+diff;
}
Job.prototype.schedule=function(val){


}
Job.prototype.sort=function(val){
min=arr[0][1];
for(var i=0;i<arr.length;i++){
  if(min>arr[i][1]){
    min=arr
  }
}
}
var arr=[[1,100,2],[2,19,2],[3,20,1],[4,17,3]];
var val=[1, 4, 5, 7];
var val1=[11, 20, 30, 40];
var x=37;
var job=new Job();
var close=new closest();
var p=close.close(val,val1,x);
console.log(p);
ar=job.sort(arr);

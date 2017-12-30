int r = 200;
void setup(){
size(200,200);
for(int i=0;i<=10;i++){
  if(i%2==0){
    fill(#FF0000);
  } else {
    fill(#FFFFFF);}
ellipse(100,100,r,r);
r-=20;
}
}
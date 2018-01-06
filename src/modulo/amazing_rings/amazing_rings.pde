int r = 200;
int x1 = 100;
int x2 = 500;

void setup(){
size(600,400);
strokeWeight(2);
}
void draw() {
  r=200;
  background(#FFFFFF);
  for(int i=0;i<=30;i++){
  noFill();
ellipse(x1,200,r,r);
ellipse(x2,200,r,r);
r-=10;
}
x1++;
x2--;

if(x1==500){
 x1=100;
 x2=500;
}
}
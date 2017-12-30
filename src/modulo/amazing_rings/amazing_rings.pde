int r = 200;
int x1 = 100;
int x2 = 500;
void setup(){
size(600,200);

for(int i=0;i<=12;i++){
  noFill();
ellipse(x1,100,r,r);
ellipse(x2,100,r,r);
r-=20;

}
}
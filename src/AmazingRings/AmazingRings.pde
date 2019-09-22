float R = 0.1;
boolean Plus, Minus = false;
void setup() {
  size(800,500);
  smooth(8);
}
void draw() {
  background(200);
  for (int I = 300; I > 0; I = I - 10) {
    pushMatrix();
    translate(width / 4, height / 4);
    noFill();
    strokeWeight(2);
    ellipse(R, 100, I, I);
    popMatrix();
  }
  for (int J = 300; J > 0; J = J - 10) {
    pushMatrix();
    translate(width / 4, height / 4);
    noFill();
    ellipse(350 - R, 100, J, J);
    popMatrix();
  }
  if (R < 5) {
    Plus = true;
    Minus = false;
  }
  if (R > 450) {
    Plus = false;
    Minus = true;
  }
  if (Plus) {
    R = R + 0.2;
  }
  if (Minus) {
    R = R - 0.1;
  }
}

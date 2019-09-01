int X = 0;
int S = 100;
void setup() {
  size(200, 200);
}
void draw() {
  ellipse(100, 100, S, S);
  if (X % 2 == 0) {
  fill(0, 0, 0);
  }
  else {
  fill(255, 0, 0);
  }
  S -= 5;
  X += 1;
}

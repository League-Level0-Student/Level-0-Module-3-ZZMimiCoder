int X = 0;
int S = 100;
int M = 0;
int Z = 0;
void setup() {
  size(1000, 500);
}
void MakeBullseye(int X, int Y) {
  int S = 100;
  while (S > 0) {
    noFill();
    ellipse(X, Y, S, S);
    S -= 10;
  }
}

while (Z < 800) {
  background(100, 100, 100);
  MakeBullseye(100 + Z, 250);
  MakeBullseye(900 - Z, 250);
  Z++;
}
while (Z > 0) {
  background(100, 100, 100);
  MakeBullseye(100 + Z, 250);
  MakeBullseye(900 - Z, 250);
  Z--;
}

int Size = 0;
int Velocity = 10;
int Position = 100;
void setup() {
  size(1000, 500);
}
void draw() {
  if (Position < 50 || Position > width - 50) {
    Velocity = -Velocity;
  }
  Position += Velocity;
  background(100, 100, 100);
  BullsEye(Position, 250);
  BullsEye(width - Position, 250);
}
void BullsEye(int XPos, int YPos) {
  Size = 100;
  while (Size > 0) {
    stroke(0, 0, 0);
    noFill();
    ellipse(XPos, YPos, Size, Size);
    Size -= 10;
  }
}

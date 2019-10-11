void draw() {
  while (N < 250) {
    N += 25;
    C = 3 - C;
    if (C % 2 > 0) {
      fill(0, 0, 0);
    }
    else {
      fill(255, 255, 0);
    }
    ellipse(10 + N, 10 + N, 35, 35);
  }
  drawBeeFace(N + 17, N + 17);
}
int N = 0;
int C = 1;
void drawFlower(int X, int Y) {
     noStroke();
     translate(X, Y);
     fill(#c6ff89);
     for (int I = 0; I < 5; I++) {
     ellipse(0, -40, 50, 50);
       rotate(radians(72));
     }
     fill(#fff9bb);
     ellipse(0, 0, 50, 50);
} 
void drawBeeFace(int BeeFaceX, int BeeFaceY) {
     noStroke();
     fill(0, 0, 0);
     stroke(1);
     strokeWeight(5);
     line(BeeFaceX - 10, BeeFaceY - 27, BeeFaceX - 17, BeeFaceY - 50);
     line(BeeFaceX + 10, BeeFaceY - 27, BeeFaceX + 17, BeeFaceY - 50);
     ellipse(BeeFaceX - 17, BeeFaceY - 50, 10, 10);
     ellipse(BeeFaceX + 17, BeeFaceY - 50, 10, 10);
     noStroke();
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY, 60, 60);
     fill(255, 237, 209);
     fill(0,0,0);
     ellipse(BeeFaceX - 10, BeeFaceY - 15, 10, 10);
     ellipse(BeeFaceX + 10, BeeFaceY - 15, 10, 10);
     ellipse(BeeFaceX, BeeFaceY - 5, 10, 10);
     ellipse(BeeFaceX, BeeFaceY + 10, 20, 10);
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY + 5, 20, 6);
}

void setup() {
     ellipseMode(CENTER);
     size(500, 500);
     background(160, 160, 160);
     drawFlower(350, 100);
}

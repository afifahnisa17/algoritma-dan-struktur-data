public class Dragon {
    int x = 5;
    int y = 7;
    int width = 5;
    int height = 10;

    void moveLeft() {
        x--;
        System.out.print("Move Left -- ");
        printPosition();
        if (x< 0 || x >width) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x++;
        System.out.print("Move Right -- ");
        printPosition();
        if (x< 0 || x >width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y++;
        System.out.print("Move Up  -- ");
        printPosition();
        if(y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y--;
        System.out.print("Move Down -- ");
        printPosition();
        if(y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Position Now: (" + x + ", " + y + ")" );
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over!");
    }
}
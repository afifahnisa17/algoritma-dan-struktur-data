public class DragonMain {
    public static void main(String[] args) {
        Dragon game = new Dragon();

        System.out.println("Start Position: (5,7)");
        game.moveLeft();
        game.moveRight();
        game.moveRight();
        game.moveLeft();
        game.moveRight();
        game.moveDown();
        game.moveUp();

    }
}
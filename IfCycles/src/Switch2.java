public class Switch2 {
    public static void main(String[] args) {
        Directs direct=Directs.RIGHT;
        switch (direct){
            case LEFT: System.out.println("left"); break;
            case RIGHT: System.out.println("right"); break;
            case UP: System.out.println("up"); break;
            case DOWN: System.out.println("Down"); break;

        }
    }
}
enum Directs{LEFT, RIGHT, UP ,DOWN};
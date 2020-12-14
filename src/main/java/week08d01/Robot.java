package week08d01;

public class Robot {
    private Position position;

    public Robot() {
        this.position = new Position();
    }

    public Position move(String directions){
        for ( int i=0; i<directions.length(); ++i){
            oneStep(directions.charAt(i));
        }
        return position;
    }

    private void oneStep(char direction) {
        switch (direction){
            case 'J':position.moveJ();return;
            case 'B':position.moveB();return;
            case 'F':position.moveF();return;
            case 'L':position.moveL();return;
            default: throw new IllegalArgumentException("Invalid direction!");
        }
    }
}
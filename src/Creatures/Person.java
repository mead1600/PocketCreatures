package Creatures;


/**
 * Person represents the player as they move through the game.
 */
public class Person {
    int xLoc, yLoc;
    String type;

    public int getType(String type){this.type = type;}

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public Person (int xLoc, int yLoc)
    {
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }


}

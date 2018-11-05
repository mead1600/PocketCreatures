package Creatures;

import Creatures.Person;

public class Position {
    Person occupant;
    int xLoc,yLoc;

    public Position(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    public void movePosition(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}

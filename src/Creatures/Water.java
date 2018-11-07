package Creatures;

import Rooms.Forest;
import Creatures.Person;

public class Water extends Position{
    public Water(int x, int y)
    {
        super(x, y);
    }

    public void earthCreatures(Person x, Forest[][] field)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        if(field[xLoc][yLoc].equals("[L]"))
        {
            System.out.println("A wild Groundy, the earth type creature, has appeared.");
        }
    }
}

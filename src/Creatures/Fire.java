package Creatures;

import Rooms.Road;
import Creatures.Person;

public class Fire extends Position{
    public Fire(int x, int y)
    {
        super(x, y);
    }

    public void earthCreatures(Person x, Road[][] field)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        if(field[xLoc][yLoc].equals("[R]"))
        {
            System.out.println("A wild Flameo, the fire type creature, has appeared.");
        }
    }
}

package Creatures;

import Rooms.Forest;
import Creatures.Person;

public class Air extends Position{
    public Air(int x, int y)
    {
        super(x, y);
    }

    public void earthCreatures(Person x, Forest[][] field)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        if(field[xLoc][yLoc].equals("[T]"))
        {
            System.out.println("A wild Windy, the air type creature, has appeared.");
        }
    }
}
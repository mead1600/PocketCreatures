package Creatures;

import Rooms.Road;
import Creatures.Person;

public class Earth extends Position{
    public Earth(int x, int y)
    {
        super(x, y);
    }


    public void earthCreatures(Person x, Road[][] field)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        if(field[xLoc][yLoc].equals("[D]"))
        {
            System.out.println("A wild Groundy, the earth type creature, has appeared.");
        }
    }
}

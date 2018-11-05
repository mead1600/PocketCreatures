package Rooms;

public class Road extends Board{

    public Road(String[][] field)
    {
        super(field);
    }
    public void buildRoad()
    {
        for(int i = 0; i < field.length;i++)
        {
            for(int a = 0; a < field[i].length;a++)
            {
                int posVal = (int)(Math.random()*3);
                if(posVal < 1) {
                    field[i][a] = "[R]";
                }
                else if(posVal < 2) {
                    field[i][a] = "[D]";
                }
                else if(posVal < 3) {
                    field[i][a] = "[ ]";
                }
            }
        }
    }
}

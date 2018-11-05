package Rooms;

public class Forest extends Board{

    public Forest(String[][] field)
    {
        super(field);
    }
    public void buildForest()
    {
        for(int i = 0; i < field.length;i++)
        {
            for(int a = 0; a < field[i].length;a++)
            {
                int posVal = (int)(Math.random()*3);
                if(posVal < 1) {
                    field[i][a] = "[L]";
                }
                else if(posVal < 2) {
                    field[i][a] = "[T]";
                }
                else if(posVal < 3) {
                    field[i][a] = "[ ]";
                }
            }
        }
    }
}

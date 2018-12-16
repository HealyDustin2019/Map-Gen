public class Main
{
  public static int mapWidth = 100;
  public static int mapHeight = 100;
  public static void main (String[]args)
  {
    buildMap ();
  }
  public static void buildMap ()
  {
    char [][] map = new char[mapHeight][mapWidth];
    for (int x = 0; x < mapHeight; x++){
        System.out.println();
        for(int y = 0; y < mapWidth; y++){
            map[x][y] = getCell();
        }
    }
    for (int x = 0; x < mapHeight; x++){
        System.out.println();
        for(int y = 0; y < mapWidth; y++){
            System.out.print(map[x][y]);
        }
    }
  }
  public static char getCell ()
  {
// Legend
// . = grass
// : = thick grass
// ^ = mountain
// T = tree
// ~ = water
// Code to randomly select a terrain type

    int x = (int)(Math.random()*10);
    if(x == 0 || x == 1)
        return '.';
    if(x == 2 || x == 3)
        return ':';
    if(x == 4 || x == 5)
        return '^';
    if(x == 6 || x == 7)
        return 'T';
    if(x == 8 || x == 9)
        return '~';
    return 'a';
  }
}

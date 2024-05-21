import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  //PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    Location a;
    if(row==grid.length-1){
      a=new Location(row,col+1);
      return a;
    }
    if(col==grid[0].length-1){
      a=new Location(row+1,col);
      return a;
    }
    if(grid[row][col+1]<grid[row+1][col]){
      a=new Location(row,col+1);
      return a;
    }
    a=new Location(row+1,col);
    return a;
  }

  // PART B
  public int sumPath(int row, int col) {
    int sum=0;
    while(row!=grid.length-1 && col!=grid[0].length-1){
      sum+=grid[row][col];
      Location a=getNextLoc(row,col);
      row=a.getRow();
      col=a.getCol();
    }
    sum+=grid[grid.length-1][grid[0].length-1];
    return sum;
  }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
}

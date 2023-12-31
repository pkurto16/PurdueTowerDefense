package src.GameLogic.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapGrid {
    private int[][] grid;
    @Builder.Default int gridSize = 20;
    
    public void setupGrid() {
        grid = new int[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++) {
            if(i==5){
                i++;
            }
            for (int j = 0; j < gridSize; j++) {
                grid[i][j] = 1;
            }
        }
    }

    public void setCellValue(int x, int y, int value) {
        if (isValidCell(x, y)) {
            grid[x][y] = value;
        }
    }

    public int getCellValue(int x, int y) {
        if (isValidCell(x, y)) {
            return grid[x][y];
        }
        return -1;
    }

    public boolean isValidCell(int x, int y) {
        return x >= 0 && x < gridSize && y >= 0 && y < gridSize;
    }
}

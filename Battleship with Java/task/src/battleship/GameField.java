package battleship;

public class GameField {
    private char[] firstVerticalColum;
    private FieldCell[][] gameField;

    public GameField(){
        firstVerticalColum = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        gameField = new FieldCell[10][10];
        generateGameField();
    }

    public void generateGameField(){
        for(int i = 0; i < gameField.length; i++){
            for(int j = 0; j < gameField[i].length; j++){
                gameField[i][j] = new FieldCell();
            }
        }
    }

    public void printGameField(){
        System.out.print("  ");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int a = 0; a < firstVerticalColum.length; a++){
            System.out.print(firstVerticalColum[a] + " ");
            for(int b = 0; b < gameField.length; b++){
                System.out.print(gameField[a][b].getFieldCell() + " ");
            }
            System.out.println();
        }
    }
}

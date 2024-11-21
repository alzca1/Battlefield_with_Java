package battleship;

public class FieldCell {
    private char fieldCell;

    public FieldCell(){
        fieldCell = '~';
    }

    public void changeCellValue(char value){
        fieldCell = value;
    }

    public char getFieldCell(){
        return fieldCell;
    }
}

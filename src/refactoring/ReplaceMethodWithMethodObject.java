package refactoring;

public class ReplaceMethodWithMethodObject {
    int game(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity);
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        //...omit
        return importantValue3 - 2 * importantValue1;
    }
}

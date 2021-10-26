package refactoring;

public class Gamma {
    private final ReplaceMethodWithMethodObject replaceMethod;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(ReplaceMethodWithMethodObject replaceMethod, int inputVal, int quantity, int yearToDate) {
        this.replaceMethod = replaceMethod;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute() {
        int importantValue1 = (inputVal * quantity);
        int importantValue2 = (inputVal * yearToDate) + 100 + replaceMethod.delta();
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;
        //...omit
        return importantValue3 - 2 * importantValue1;
    }
}

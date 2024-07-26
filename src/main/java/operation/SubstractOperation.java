package operation;


public class SubstractOperation implements AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber, char op) {
        return firstNumber - secondNumber;
    }
}

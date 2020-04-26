public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber () {
        return this.firstNumber;
    }

    public double getSecondNumber () {
        return this.secondNumber;
    }

    public void setFirstNumber (double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber (double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult () {
        double result;
        result = this.firstNumber + this.secondNumber;
        return result;
    }

    public double getSubtractionResult () {
        double result;
        result = this.firstNumber - this.secondNumber;
        return result;
    }

    public double getMultiplicationResult () {
        double result;
        result = this.firstNumber * this.secondNumber;
        return result;
    }

    public double getDivisionResult () {
        double result;
        if (this.secondNumber == 0) {
            return 0;
        } else {
            result = this.firstNumber / this.secondNumber;
            return result;
        }
    }
}
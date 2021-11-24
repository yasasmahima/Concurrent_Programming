package week5.EX52;

/**
 * SharedVariable Class which implements the Variable interface
 */
public class SharedVariable implements Variable {

    /**
     * Private variable integerVariable
     */
    private int integerVariable;

    /**
     * Parameterised constructor
     * @param integerVariable
     */
    public SharedVariable(int integerVariable) {
        this.integerVariable = integerVariable;
    }

    /*
    Default constructor
     */
    public SharedVariable() {
    }

    /**
     * Implementation of Assign method
     * @param value
     */
    @Override
    public void assign(int value) {
        this.integerVariable = value;
    }

    /**
     * Implementation of value method
     * @return
     */
    @Override
    public int value() {
        return this.integerVariable;
    }

    /**
     * Implementation of isZero method
     * @return
     */
    @Override
    public boolean isZero() {
        if (this.integerVariable == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Implementation of isDivisibleBy method
     * @param divisor
     * @return
     */
    @Override
    public boolean isDivisibleBy(int divisor) {
        if (this.integerVariable % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
}

package fraction;
import java.awt.*;
import java.math.*;


public class FractionImpl implements Fraction {
    /**
     * @param numerator
     * @param denominator
     */

    private int numerator;
    private int denominator;

    /**
     * constructor
     * Helper Method
     * @param a, an Integer
     * @param b, an Integer
     * @return a, an Integer representing the Greatest Common Denominator of "a" and "b"
     */
    private static int calculateGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGcd(b, a % b);
    }

    /**
     * constructor
     * Helper Method
     * Takes no params, Normalizes the Fraction
     */
    private void normalizeFraction() {
        if (this.denominator < 0) {
            this.numerator = this.numerator * -1;
            this.denominator = this.denominator * -1;
        }
        if (this.numerator == 0) {
            this.denominator = 1;
        } else {
            // find GCD for denominator
            int gcdenominator = calculateGcd(this.numerator, this.denominator);
            this.numerator /= gcdenominator;
            this.denominator /= gcdenominator;
        }
    }

    /**
     * constructor
     * Creates a Fraction object with a numerator and denominator
     * @param numerator
     * @param denominator
     */
    public FractionImpl(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        // Normalise fraction while constructing
        normalizeFraction();

        // Throw exception if denominator is 0
        if (this.denominator == 0) {
            throw new ArithmeticException("illegal value, denominator should not be zero");
        }
    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    /**
     * constructor
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {
        String[] nums = fraction.split("/");
        this.numerator = Integer.parseInt(nums[0].trim());
        this.denominator = Integer.parseInt(nums[1].trim());

        // Throw exception if denominator is 0
        if (this.denominator == 0) {
            throw new ArithmeticException("illegal value, denominator should not be zero");
        }
    }

    /**
     * @inheritDoc
     * Adds two fractions, "this" object and "f" which is passed as the parameter
     * @param f, The Fraction to add to this
     * @return A new Fraction representing the sum of this and f
     */
    @Override
    public Fraction add(Fraction f) {
        FractionImpl fracB = new FractionImpl(f.toString());
        int newNumerator = (this.numerator * fracB.denominator) + (fracB.numerator * this.denominator);
        int newDenominator = this.denominator * fracB.denominator;
        return new FractionImpl(newNumerator, newDenominator);
    }

    /**
     * @inheritDoc
     * Subtracts Fraction "f" from "this", where "f" is passed as the parameter
     * @param f, the Fraction to subtract from this
     * @return A new Fraction representing the difference between this minus f
     */
    @Override
    public Fraction subtract(Fraction f) {
        FractionImpl fracB = new FractionImpl(f.toString());
        int newNumerator = (this.numerator * fracB.denominator) - (fracB.numerator * this.denominator);
        int newDenominator = this.denominator * fracB.denominator;
        return new FractionImpl(newNumerator, newDenominator);
    }

    /**
     * @inheritDoc
     * Multiplies two fractions, "this" object and "f" which is passed as the parameter
     * @param f, the Fraction to multiply to this
     * @return A new Fraction representing the product of this and f
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl fracB = new FractionImpl(f.toString());
        int newNumerator = this.numerator * fracB.numerator;
        int newDenominator = this.denominator * fracB.denominator;
        return new FractionImpl(newNumerator, newDenominator);
    }

    /**
     * @inheritDoc
     * Divides fraction "this" by "f", where "f" is passed as the parameter
     * @param f, the Fraction to divide from this
     * @return A new Fraction representing the quotient of dividing this by f
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl fracB = new FractionImpl(f.toString());
        int newNumerator = this.numerator * fracB.denominator;
        int newDenominator = this.denominator * fracB.numerator;
        return new FractionImpl(newNumerator, newDenominator);
    }

    /**
     * @inheritDoc
     * Takes no params
     * @return a new Fraction that is the absolute value of "this" Fraction
     */
    @Override
    public Fraction abs() {
        return new FractionImpl(Math.abs(this.numerator), Math.abs(this.denominator));
    }

    /**
     * @inheritDoc
     * Takes no params
     * @return Returns a new Fraction that has the same numeric value of "this" Fraction,
     * but the opposite sign
     */
    @Override
    public Fraction negate() {
        int newNumerator = this.numerator * -1;
        int newDenominator = this.denominator;
        return new FractionImpl(newNumerator, newDenominator);
    }

    /**
     * @inheritDoc
     * Takes no params
     * @return A hash code value for the object
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     * Checks if two Fractions are equal
     * @param obj, the Fraction to compare with "this"
     * @return A boolean representing if "this" and "obj" are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            return super.equals(obj);
        } else {
            return false;
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     * Takes no params,
     * @return A new Fraction, representing the inverse of "this"
     */
    @Override
    public Fraction inverse() {
        return new FractionImpl(this.denominator, this.numerator);
    }

    /**
     * @inheritDoc
     * Compares two Fractions together
     * @param o, a Fraction to compare with "this"
     * @return An integer, A negative if this is less than o,
     *                     A zero if this is equal to o,
     *                     A positive if this is greater than o
     */
    @Override
    public int compareTo(Fraction o) {
        if (o instanceof Fraction) {
            FractionImpl fracB = (FractionImpl)o;
            int numeratorA = this.numerator * fracB.denominator;
            int numeratorB = fracB.numerator * this.denominator;
            int result = numeratorA - numeratorB;
            return result;
        } else {
            throw new ClassCastException("Argument is neither Fraction nor an int");
        }
    }

    /**
     * @inheritDoc
     * Takes no params
     * @return A String of the form n/d, where n is the numerator and d is the denominator
     * However, return n (as a String) if d is 1
     */
    @Override
    public String toString() {
        if (this.denominator < 0 || this.numerator < 0) {
            return String.format("-%S/%S", this.numerator, Math.abs(this.denominator)
            );
        }
        if (this.denominator == 1) {
            return String.format("%S", this.numerator);
        } else {
            return String.format("%S/%S", this.numerator, this.denominator);
        }
    }
}
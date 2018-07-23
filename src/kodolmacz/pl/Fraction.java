package kodolmacz.pl;

public class Fraction {

    private int fractionInteger;
    private int numerator;
    private int denominator;

    public Fraction(int fractionInteger, int numerator, int denominator){
        this.fractionInteger = fractionInteger;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getFractionAsDecimak(){
        return fractionInteger + (double) numerator/ denominator;
    }
}

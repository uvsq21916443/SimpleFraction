public class Fraction extends Number implements Comparable<Fraction> {
    private int num;
    private int den;

    public static Fraction ZERO = new Fraction(0,1);
    public static Fraction UN = new Fraction(1,1);

    public Fraction(int a, int b) {
        num = a;
        den = b;
    }

    public Fraction(int a) {
        num = a;
        den = 1;
    }

    public Fraction() {
        num = 0;
        den = 1;
    }

    public String toString() {
        return "Je suis une fraction : " + num + '/' + den;
    }

    public int getNum() {
        return this.num;
    }

    public int getDen() {
        return this.den;
    }

    @Override
    public double doubleValue() {
        return Double.valueOf(this.num) / Double.valueOf(this.den);
    }

    public double add(Fraction f) {
        return this.doubleValue() + f.doubleValue();
    }

    @Override
    public int compareTo(Fraction f) {
        if (f == null) {
            throw new NullPointerException("paramètre null");
        }

        if (f.getClass() != Fraction.class) {
            throw new ClassCastException("mauvais type d'objet");
        }
        
        return Double.valueOf(this.doubleValue()).compareTo(Double.valueOf(f.doubleValue()));
    }

    @Override
    public int intValue() {
        return Double.valueOf(this.doubleValue()).intValue();
    }

    @Override
    public long longValue() {
        return Double.valueOf(this.doubleValue()).longValue();
    }

    @Override
    public float floatValue() {
        return Double.valueOf(this.doubleValue()).floatValue();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\nJe compile");
        
        Fraction a = new Fraction(2,4);
        Fraction b = new Fraction(2);
        Fraction c = new Fraction();
        Fraction d = new Fraction(1);

        assert a.toString().equals("Je suis une fraction : 2/4");
        assert b.toString().equals("Je suis une fraction : 2/1");
        assert c.toString().equals("Je suis une fraction : 0/1");

        assert Fraction.ZERO.toString().equals(c.toString());
        assert Fraction.UN.toString().equals(d.toString());

        assert a.getNum() == 2;
        assert a.getDen() == 4;

        assert a.doubleValue() == 0.5d;

        assert a.add(b) == 2.5d;

        assert c.doubleValue() == Fraction.ZERO.doubleValue();

        assert a.compareTo(b) == -1;
        assert a.compareTo(c) == 1;
        assert a.compareTo(a) == 0;

        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    }
}

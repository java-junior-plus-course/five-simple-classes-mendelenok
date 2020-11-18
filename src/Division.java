public class Division {
    private double term1;
    private double term2;

    public double getTerm1() {
        return term1;
    }

    public double getTerm2() {
        return term2;
    }


    public void setTerm1(double term) {
        this.term1 = term;
    }

    public void setTerm2(double term) {
        this.term2 = term;
    }


    public double doDiv (double term1, double term2) {
        System.out.print("Result of division is: ");
        if (term2 != 0) {
            return (term1 / term2);
        } else {
            System.out.println("Деление на ноль");
            return (0);
        }

    }
}

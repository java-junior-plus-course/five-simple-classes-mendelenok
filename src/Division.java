public class Division {
    private double term;

    public double getTerm() {
        return term;
    }


    public void setTerm(double term) {
        this.term = term;
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

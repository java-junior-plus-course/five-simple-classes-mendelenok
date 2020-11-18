public class Substraction {
    private double term;

    public double getTerm() {
        return term;
    }


    public void setTerm(double term) {
        this.term = term;
    }

    //перегрузка метода
    public void setTerm(int term) {
        this.term = term;
    }


    public double doSubs (double term1, double term2) {
        System.out.print("Result of substraction is: ");
        return (term1 - term2);
    }
}

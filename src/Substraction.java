public class Substraction {
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

    //перегрузка метода
    public void setTerm2(int term) {
        this.term2 = term;
    }


    public double doSubs (double term1, double term2) {
        System.out.print("Result of substraction is: ");
        return (term1 - term2);
    }
}

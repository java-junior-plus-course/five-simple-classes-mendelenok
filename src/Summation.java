public class Summation {
    private double term;

    public double getTerm() {
        return term;
    }


    public void setTerm(double term) {
        this.term = term;
    }

    //перегрузка метода - новая сигнатура
    public void setTerm(int term) {
        this.term = term;
    }


    public double doSum (double term1, double term2) {
        System.out.print("Result of summation is: ");
        return (term1 + term2);
    }

}

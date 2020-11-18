public class Substraction {
    private int term;

    public int getTerm() {
        return term;
    }


    public void setTerm(int term) {
        this.term = term;
    }

    public void setTerm(byte term) {
        this.term = term;
    }


    public int doSubs (int term1, int term2) {
        System.out.print("Result of substraction is: ");
        return (term1 - term2);
    }
}

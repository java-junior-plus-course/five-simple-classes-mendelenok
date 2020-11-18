public class Main {

    private static double var1;
    private static double var2;

    public static void main(String[] args) {

        //not using in stream
        var1 = 4.7;
        var2 = 5.9;

        Summation sum = new Summation();
        sum.setTerm1(var1);
        sum.setTerm2(var2);
        System.out.println(sum.doSum(sum.getTerm1(), sum.getTerm2()));

        Substraction subs = new Substraction();
        subs.setTerm1(var1);
        subs.setTerm2(var2);
        System.out.println(subs.doSubs(subs.getTerm1(), subs.getTerm2()));

        Multiplication mult = new Multiplication();
        mult.setTerm1(var1);
        mult.setTerm2(var2);
        System.out.println(mult.doMult(mult.getTerm1(), mult.getTerm2()));

        Division div = new Division();
        div.setTerm1(var1);
        div.setTerm2(var2);
        System.out.println(div.doDiv(div.getTerm1(),div.getTerm2()));

    }

}

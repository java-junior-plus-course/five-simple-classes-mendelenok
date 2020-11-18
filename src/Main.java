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
        System.out.println(subs.doSubs(var1 = 4.7,var2 = 5.6));

        Multiplication mult = new Multiplication();
        System.out.println(mult.doMult(var1 = 4.7,var2 = 5.6));

        Division div = new Division();
        System.out.println(div.doDiv(var1 = 4.7,var2 = 5.6));

    }

}

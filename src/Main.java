public class Main {

    private static double var1;
    private static double var2;

    public static void main(String[] args) {

        Summation sum = new Summation();
        System.out.println(sum.doSum(var1 = 4.7,var2 = 5.6));

        Substraction subs = new Substraction();
        System.out.println(subs.doSubs(var1 = 4.7,var2 = 5.6));

        Multiplication mult = new Multiplication();
        System.out.println(mult.doMult(var1 = 4.7,var2 = 5.6));

        Division div = new Division();
        System.out.println(div.doDiv(var1 = 4.7,var2 = 5.6));

    }

}

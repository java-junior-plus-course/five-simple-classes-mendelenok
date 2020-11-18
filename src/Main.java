import java.util.Scanner;

public class Main {

    private static int var;
    private static Summation var1, var2;
    private static Substraction var3, var4;
    private static Multiplication var5, var6;
    private static Division var7, var8;


    public static void main(String[] args) {

        System.out.print("Calculator operates only with int numbers");
        System.out.println("Select operation to calculate:");
        System.out.println("1_Summation__2_Subtraction__3_Multiplication__4_Division");
        Scanner in = new Scanner(System.in);
        var = in.nextInt();
        switch (var) {
            case (1):
                Summation sum = new Summation();
                var1 = new Summation();
                var2 = new Summation();
                System.out.println("You selected Summation");
                var1.setTerm(in.nextInt());
                var2.setTerm(in.nextInt());
                System.out.print(sum.doSum(var1.getTerm(), var2.getTerm()));
                break;
            case(2):
                Substraction subs = new Substraction();
                var3 = new Substraction();
                var4 = new Substraction();
                System.out.println("You selected Subsctraction");
                var3.setTerm(in.nextInt());
                var4.setTerm(in.nextInt());
                System.out.print(subs.doSubs(var3.getTerm(), var4.getTerm()));
                break;
            case(3):
                Multiplication mult = new Multiplication();
                var5 = new Multiplication();
                var6 = new Multiplication();
                System.out.println("You selected Multiplication");
                var5.setTerm(in.nextInt());
                var6.setTerm(in.nextInt());
                System.out.print(mult.doMult(var5.getTerm(), var6.getTerm()));
                break;
            case(4):
                Division div = new Division();
                var7 = new Division();
                var8 = new Division();
                System.out.println("You selected Divison");
                var7.setTerm(in.nextInt());
                var8.setTerm(in.nextInt());
                System.out.print(div.doDiv(var7.getTerm(), var8.getTerm()));
                break;
        }
        in.close();

    }

}

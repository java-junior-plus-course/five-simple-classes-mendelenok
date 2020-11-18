import java.util.Scanner;

public class Main {

    private static int var;
    private static Division var1;
    private static Division var2;

    public static void main(String[] args) {

        System.out.println("Select operation to calculate:");
        System.out.println("1_Summation__2_Subtraction__3_Multiplication__4_Division");
        Scanner in = new Scanner(System.in);
        var = in.nextInt();
        switch (var) {
            case (1):
                Summation sum = new Summation();
                //select_sum.setTerm(in.nextInt());
                System.out.println("You selected Summation");
                var1.setTerm(in.nextInt());
                var2.setTerm(in.nextInt());
                System.out.print(sum.doSum(var1.getTerm(), var2.getTerm()));
                break;
            case(2):
                Substraction select_subs = new Substraction();
                select_subs.setTerm(in.nextInt());
                System.out.println("You selected Subsctraction");
                break;
            case(3):
                Multiplication select_mult = new Multiplication();
                select_mult.setTerm(in.nextInt());
                System.out.println("You selected Multiplication");
                break;
            case(4):
                Division select_div = new Division();
                select_div.setTerm(in.nextInt());
                System.out.println("You selected Divison");
                break;
        }
        in.close();

    }



    public void selectOperation (int var) {

    }

  //  public void makeOperation (int var) {
  //      Summation sum = new Sum();
  //      Scanner in = new Scanner(System.in);
   //     switch (var) {
   //         case (1):
   //             Sum var1 = new Sum();
   //             Sum var2 = new Sum();
   //             var1.setTerm(in.nextInt());
   //             var2.setTerm(in.nextInt());
   //             System.out.print(sum.doSum(var1.getTerm(), var2.getTerm()));
   //             in.close();
   //             break;
   //     }
}

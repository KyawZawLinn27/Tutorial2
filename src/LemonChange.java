import java.util.Scanner;
public class LemonChange {
    public static void main(String[] args) {
        System.out.println("Welcome From Lemonade Change App");
        int[] bill = {5,5,5,10,20};
        System.out.print("Bill: ");
        for(int i:bill) {
            System.out.print(i+" "+",");
        }
        System.out.println();
        System.out.println("Check: "+lemonadeChange(bill));
        int[] billrm = {5,5,10,10,20};
        System.out.print("Bill: ");
        for(int i:billrm) {
            System.out.print(i+" "+",");
        }
        System.out.println();
        System.out.println("Check: "+lemonadeChange(billrm));

        // User Input Lemonade Change
        String res;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bill: ");
            int[] bills3 = new int[5] ;
            for (int i = 0; i < bills3.length; i++){
                bills3[i] = sc.nextInt();
            }
            System.out.print("Bill: ");
            for(int i:bills3) {
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("Check: "+lemonadeChange(bills3));
            System.out.println();
            System.out.print("Do you want to again? (yes or no) : ");
            res = sc.next();

        }while (res.equals("y"));
    }
    public static boolean lemonadeChange(int[] bills) {
        int count=0;
        int count2=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                count++;

            }
            else if(bills[i]==10)
            {
                count--;
                count2++;
                if(count<0)
                    return false;
            }
            else
            {
                if(count2>0 && count>0)
                {
                    count2--;
                    count--;
                }else if(count2==0 && count-3>=0)
                {
                    count-=3;
                }else if(count2==0 && count-3<0)
                {
                    return false;
                }
                else
                {
                    return false;
                }
            }

        }
        return true;

    }
}

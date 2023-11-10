import java.util.Scanner;

public class jewlsFind {
    public static void main(String[] args) {
        System.out.println("Welcome From Finding the Jewels App");
        String jewels = "aA";
        String stones = "baAAbbbb";
        System.out.print("Jewel : \'"+jewels+"\' ");
        System.out.print("Stone: \'"+stones+"\' ");
        System.out.println();
        System.out.println("Numbers of jewels: "+numJewelsInStones(jewels,stones));

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.print("Input: Jewels = \'"+jewels2+"\' Stones = \'"+stones2+"\' ");
        System.out.println();
        System.out.println("Number of Jewels: "+numJewelsInStones(jewels2,stones2));

        String res;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Jewels(maximum 2 Characters): ");
            String jewels3 = sc.nextLine();
            System.out.print("Enter Stones(Maximum 50 Characters): ");
            String stones3 = sc.nextLine();

            if(jewels3.length() <= 2){
                if(stones3.length() <= 50){

                    System.out.println("Numbers of jewels : "+numJewelsInStones(jewels3, stones3));
                }else {
                    System.out.println("Stones must be maximum 50 characters!");
                }
            }else {
                System.out.println("Jewels must be maximum 2 characters!");
            }
            System.out.println();
            System.out.print("Do you want to again (yes or no) : ");
            res = sc.next();

        }while (res.equals("yes"));
    }
    public static int numJewelsInStones(String js, String ss) {

        int c=0;
        for(int i=0;i<js.length();i++){
            for(int j=0;j<ss.length();j++){
                if(js.charAt(i)==ss.charAt(j)){
                    c++;
                }
            }
        }
        return c;
    }
}

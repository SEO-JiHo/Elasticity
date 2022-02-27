import java.text.DecimalFormat;
import java.util.Scanner;
public class Elasticity {
    public static final String F_BLUE = "\u001B[34m";
    public static final String F_BLACK = "\u001B[30m";
    public static final String F_RED = "\u001B[31m";
    public static void main(String[] args) {
        System.out.println("\n\n가격과 수요량의 변화량을 이용하여 수요의 가격탄력성을 구하고, 탄력성의 정도를 나타내는 프로그램입니다.");
        System.out.println(F_RED+"가격과 수량 입력 시 숫자만 입력하시기 바랍니다."+F_BLACK);
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 시점의 가격을 입력하십시오. (단위:원)");
        double pa = scanner.nextInt();

        System.out.println("두 번째 시점의 가격을 입력하십시오. (단위:원)");
        double pb = scanner.nextInt();

        System.out.println("첫 번째 시점의 수요량을 입력하십시오. (단위:개)");
        double qa = scanner.nextInt();

        System.out.println("두 번째 시점의 수요량을 입력하십시오. (단위:개)");
        double qb = scanner.nextInt();

        double x = (pa-pb)/pa*100;
        double y = (qa-qb)/qa*100;
        double z = Math.abs(y/x);

        DecimalFormat df = new DecimalFormat("0.00");
        String e = df.format(z);

        System.out.println("\n\n가격의 변화율은 "+F_BLUE+(int)x+"%"+F_BLACK+" 이며 수요량의 변화율은 "+F_BLUE+(int)y+"%"+F_BLACK+" 입니다.");

        System.out.printf("\n수요의 가격탄력성은 "+F_BLUE+e+F_BLACK+" 이며, ");

        int i = (int)(z*10);

        if(i==0) {
            System.out.println("완전비탄력적입니다.") ;
        }   else if(0<i && i<10) {
            System.out.println("비탄력적입니다.");
        }   else if(i==10) {
            System.out.println("단위탄력적입니다.");
        }   else if(i>10) {
            System.out.println("탄력적입니다.");
//          (i == ∞ 생략)
        }
    }
}

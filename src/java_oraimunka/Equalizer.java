
package java_oraimunka;

import java.util.Random;
public class Equalizer {

    static Random rnd=new Random();
    public static void main(String[] args) {
        equalizer5();
    }

    private static void equalizer5() {
        eq();
        eq(8 ,true);
        eq(12);
        eq(true);
        eq();
    }
    public static void eq(){
        int db=rnd.nextInt(3,8);
        boolean igaz=true;
        eq(db,igaz);

    }

    private static void eq(int a) {
        boolean igaz=true;
        eq(a,igaz);
    }
    private static void eq(int a,boolean igaz) {
        String szín="*";
        for (int i=0;i<a;i++) {
        System.out.print(szín+"");
        
        }
        System.out.print("\n");
    }
    private static void eq(boolean igaz) {
        int a=rnd.nextInt(3,8);
        eq(a,igaz);
    }
}

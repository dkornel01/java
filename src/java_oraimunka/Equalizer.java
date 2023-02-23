
package java_oraimunka;

import java.util.Random;
public class Equalizer {

    static Random rnd=new Random();
    public static void main(String[] args) {
        equalizer5();
    }

    private static void equalizer5() {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }
    public static void eq(){
        int db=rnd.nextInt(3,8);
        eq(db);

    }

    private static void eq(int a) {
        String szín="*";
        for (int i=0;i<a;i++) {
        System.out.print(szín+"");
        
        }
        System.out.print("\n");
    }
    
}

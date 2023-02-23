
package java_oraimunka;

import java.util.Random;
public class Equalizer {

    static Random rnd=new Random();
    public static void main(String[] args) {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }
    public static void eq(){
        int db=rnd.nextInt(3,8);
        String Szín="\u001B[45m";
        for (int i=0;i<db;i++) {
        System.out.print(Szín+"");
        
        }
        System.out.print("\n");

    }

    private static void eq(int a) {
        String Szín="\u001B[45m";
        for (int i=0;i<a;i++) {
        System.out.print(Szín+"");
        
        }
        System.out.print("\n");
    }
    
}

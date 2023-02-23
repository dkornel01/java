
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
        System.out.print("*"+"");
        
        }
        System.out.print("\n");
        
        
        
    }
    
}

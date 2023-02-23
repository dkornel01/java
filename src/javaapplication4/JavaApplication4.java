
package javaapplication4;


public class JavaApplication4 {


    public static void main(String[] args) {
        fo();
        osszead(1,2);
        kiir();
    }
    
    private static int fo(){
        int osszeg=0;
        for (int i=0;i<10;i++ ){
            osszeg+=i;
        }
        return osszeg;
    }
    private static int osszead(int a, int b){
        return(a+b);
    }
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    }
    
}

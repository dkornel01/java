
package java_oraimunka;


public class java_oraimunka {


    public static void main(String[] args) {
        elso10Szamosszeg();
        osszead(1,2);
        kiir();
    }
    
    private static int elso10Szamosszeg(){
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

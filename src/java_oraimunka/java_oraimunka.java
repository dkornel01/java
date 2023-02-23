
package java_oraimunka;


public class java_oraimunka {


    public static void main(String[] args) {
        int osszeg=elso10Szamosszeg();
        String kimenet= "Az első 10 szám összege:" +osszeg+"\n"; 
        kiir(kimenet);
        int szam1=7 ,szam2=4;
        osszeg= osszead(szam1, szam2);
        kiir("%d + %d=%d\n" .formatted(szam1,szam2,osszeg));
        osszeg=osszead(1,2);
        osszeg=osszead(osszeg,3);
        osszeg=osszead(osszeg,4);
        osszeg=osszead(1,2);
        osszeg +=osszead(3,4);
        //osszeg=osszeadas(szam1,szam2,osszeg,elso10Szamosszeg());
        kiir("1+2+3+4="+osszeg+"\n");
        osszeg=osszead(1, osszead(2 osszead(3,4)));
        kiir("1+2+3+4="+osszeg+"\n");
        osszeg=gyok();
        
        
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
    private static int osszeadas(int szam1,int szam2,int osszeg,int elso10){
        szam1=szam1+szam2+osszeg+elso10;
        return szam1;
    }
    private static int gyok(int szam1, int szam2, int szam3){
        
    }

}

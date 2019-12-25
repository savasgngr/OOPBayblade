
package oopbayblade;

import java.util.Scanner;


public class OOPBayblade {
    public static void main(String[] args) {
      
        System.out.println("Beyblade programına hoşgeldiniz..");
        System.out.println("çıkıi için q ya basınız.");
        
        Scanner scanner =new Scanner(System.in);
        
        while (true) {            
            System.out.println("Hangi beyblade in sahibi olmak istersiniz ?");
            String islem=scanner.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("programdan cıkılıyor");
                break;
                
            }else  {
                
                Beybladefabrikası fabrika=new Beybladefabrikası();
                
                Beyblade beyblade= fabrika.beybladeuret(islem);
                
                if (beyblade==null) {
                    
                    System.out.println("lütfen geçerli bir beyblade giriniz");
                    
                }else{
                    beyblade.Bilgilerigöster();
                    beyblade.Saldır();
                    beyblade.Kutsalcanacarortayacıkar();
                    
                    
                }
                
            }
           
            
            
        }
    }
    
}

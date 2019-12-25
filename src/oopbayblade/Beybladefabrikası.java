
package oopbayblade;

public class Beybladefabrikası {
    
    public Beyblade beybladeuret(String beyblade_turu){
        
        if (beyblade_turu.equals("Dragon")) {
            
            return new Dragon("Takao", 1000, 6000, "erderha", "ateş nefesi");
            
        }else if (beyblade_turu.endsWith("Dranza")) {
            
            return  new Dranza("kai", 800, 400, "kırmızı Anka kuşu");
            
        }else if (beyblade_turu.equals("Draciel")) {
            
            return  new Draciel("max", 400, 1000, "Kara kaplumbağa");
        }else if (beyblade_turu.equals("Drayga")) {
            
           return new Drayga("Rei", 800, 400, "Beyaz kaplan");
        }
        else {
            return  null;
        }
    }
}

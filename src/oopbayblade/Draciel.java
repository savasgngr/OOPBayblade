
package oopbayblade;

public class Draciel extends Beyblade{

    private  String Kutsalcanavar;
    public Draciel(String beyblade_adı, int donus_hızı, int saldırı_gucu,String kutsalcanavar) {
        super(beyblade_adı, donus_hızı, saldırı_gucu);
        this.Kutsalcanavar=kutsalcanavar;
    }

    @Override
    public void Bilgilerigöster() {
        super.Bilgilerigöster(); 
        System.out.println("Canavar adı:"+Kutsalcanavar);
    }

    @Override
    public void Kutsalcanacarortayacıkar() {
       System.out.println(getBeyblade_adı()+""+Kutsalcanavar+""+"ı ortaya çıkarıor...");
        System.out.println(getBeyblade_adı()+"in savunması:Kale savunması");
    }
    
    
}

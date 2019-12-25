
package oopbayblade;

public class Drayga extends  Beyblade{

    private String Kutsalcanavar;
    public Drayga(String beyblade_adı, int donus_hızı, int saldırı_gucu,String Kutsalcanavar) {
        super(beyblade_adı, donus_hızı, saldırı_gucu);
        this.Kutsalcanavar=Kutsalcanavar;
    }

    @Override
    public void Bilgilerigöster() {
        super.Bilgilerigöster(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Canavar adı:"+Kutsalcanavar);
    }

    @Override
    public void Kutsalcanacarortayacıkar() {
        System.out.println(getBeyblade_adı()+""+Kutsalcanavar+""+"ı ortaya çıkarıor...");
        System.out.println(getBeyblade_adı()+"in saldırısı:Kaplan pençesi");
    }
    
    
}

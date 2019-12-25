

package oopbayblade;

public class Dranza extends Beyblade{
    
    
    private  String Kutsalcanavar;

    public Dranza( String beyblade_adı, int donus_hızı, int saldırı_gucu,String Kutsalcanavar) {
        super(beyblade_adı, donus_hızı, saldırı_gucu);
        this.Kutsalcanavar = Kutsalcanavar;
    }

    @Override
    public void Bilgilerigöster() {
        super.Bilgilerigöster(); 
        System.out.println("Canavar adı:"+Kutsalcanavar);
    }

    @Override
    public void Kutsalcanacarortayacıkar() {
        System.out.println(getBeyblade_adı()+""+Kutsalcanavar+""+"ı ortaya çıkarıor...");
        System.out.println(getBeyblade_adı()+"in saldırısı:Alev kılıcı");
    }
    
    
}

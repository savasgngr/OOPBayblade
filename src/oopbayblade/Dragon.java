
package oopbayblade;

public class Dragon extends Beyblade{
    
    private String Kutsalcanavar;
    private  String Gizliyetenek;

    public Dragon(String beyblade_adı, int donus_hızı, int saldırı_gucu,String Kutsalcanavar, String Gizliyetenek) {
        super(beyblade_adı, donus_hızı, saldırı_gucu);
        this.Kutsalcanavar = Kutsalcanavar;
        this.Gizliyetenek = Gizliyetenek;
    }

    @Override
    public void Bilgilerigöster() {
        super.Bilgilerigöster(); 
        System.out.println("Kutsal canavar:"+Kutsalcanavar);
        System.out.println("Gizli yetenek:"+Gizliyetenek);
    }

    @Override
    public void Kutsalcanacarortayacıkar() {
        System.out.println(getBeyblade_adı()+""+Kutsalcanavar+""+"ı ortaya çıkarıor...");
        System.out.println(getBeyblade_adı()+"in saldırısı:Hayalet kasırga");
    }
    
    
}

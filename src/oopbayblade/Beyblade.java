
package oopbayblade;


public class Beyblade {
    
    
    private  String beyblade_adı;
    private int donus_hızı;
    private int saldırı_gucu;

    public Beyblade(String beyblade_adı, int donus_hızı, int saldırı_gucu) {
        this.beyblade_adı = beyblade_adı;
        this.donus_hızı = donus_hızı;
        this.saldırı_gucu = saldırı_gucu;
    }
    
    public void Saldır(){
        System.out.println(getBeyblade_adı()+""+saldırı_gucu+""+donus_hızı+"ile saldırıyor... ");
    }
    public void Kutsalcanacarortayacıkar(){
        
        System.out.println("Bu beyblade de kutsal canavar henüz yok...");
    }
    
    public void Bilgilerigöster(){
        
        System.out.println("Beyblade adı:"+beyblade_adı);
        System.out.println("Beyblade donus hızı:"+donus_hızı);
        System.out.println("Beyblade saldırı gücü:"+saldırı_gucu);
        
    }

    public String getBeyblade_adı() {
        return beyblade_adı;
    }

    public void setBeyblade_adı(String beyblade_adı) {
        this.beyblade_adı = beyblade_adı;
    }

    public int getDonus_hızı() {
        return donus_hızı;
    }

    public void setDonus_hızı(int donus_hızı) {
        this.donus_hızı = donus_hızı;
    }

    public int getSaldırı_gucu() {
        return saldırı_gucu;
    }

    public void setSaldırı_gucu(int saldırı_gucu) {
        this.saldırı_gucu = saldırı_gucu;
    }
    
    
}

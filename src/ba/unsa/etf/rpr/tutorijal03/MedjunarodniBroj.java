package ba.unsa.etf.rpr.tutorijal03;



public class MedjunarodniBroj extends TelefonskiBroj {
    @Override
    public String ispisi(){
        return drzava+broj;

    }
    @Override
    public int hashCode(){
        return 0;
    }
    String drzava;
    String broj;

    public MedjunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
}

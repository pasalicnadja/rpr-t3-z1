package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public FiksniBroj(Grad grad, String broj){
        this.grad= grad;
        fiksni=broj;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getFiksni() {
        return fiksni;
    }

    public void setFiksni(String fiksni) {
        this.fiksni = fiksni;
    }

    enum Grad{
        SARAJEVO,  MOSTAR, BRCKO, JAJCE, DOBOJ, KAKANJ
    }
    private Grad grad;
    private String fiksni;

    @Override
public String ispisi(){
    String tok="";
    if(grad==Grad.BRCKO) tok+="049/";
        if(grad==Grad.DOBOJ) tok+="032/";
        if(grad==Grad.JAJCE) tok+="030/";
        if(grad==Grad.KAKANJ) tok+="032/";
        if(grad==Grad.MOSTAR) tok+="036/";
        if(grad==Grad.SARAJEVO) tok+="033/";

    tok+=fiksni;
    return tok;
    }
    @Override
    public int hashCode(){
        return 0;
    }
}


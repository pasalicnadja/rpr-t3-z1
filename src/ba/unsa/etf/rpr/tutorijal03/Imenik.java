package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;

public class Imenik {
    public Imenik(){}

    public HashMap<String, TelefonskiBroj> getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(HashMap<String, TelefonskiBroj> userPhonenumber) {
        this.userPhonenumber = userPhonenumber;
    }

    private HashMap<String, TelefonskiBroj> userPhonenumber= new HashMap<>();

    public void dodaj(String ime,TelefonskiBroj broj){
        userPhonenumber.putIfAbsent(ime, broj);
        }
        public  String dajBroj(String ime){
        return userPhonenumber.get(ime).ispisi();
        }
        public String dajIme(TelefonskiBroj broj){
        for(var x: userPhonenumber.entrySet()){
            if(x.getValue().compareTo(broj)==0)
                return x.getKey();
        }
        return "";
        }
       public String naSlovo(char s){
        StringBuilder str=new StringBuilder();
        for(var x: userPhonenumber.entrySet()){
            int brojac=1;
            if(x.getKey().charAt(0)==s){
                str.append(String.format("%d %s -%s\n", brojac,x.getKey(),x.getValue().ispisi()));
                brojac++;
            }
        }
        return str.toString();
       }
      
    }


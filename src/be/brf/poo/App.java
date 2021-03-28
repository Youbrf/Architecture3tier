package be.brf.poo;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        //définition des données //Mocking
        Data d1 = new Data("Salutation",1,true);
        Data d2 = new Data("Bien le bonjour !",3,false);
        Data d3 = new Data("Ciao!",2,true);

        ArrayList<Data> list = new ArrayList<Data>();

        list.add(d1);
        list.add(d2);
        list.add(d3);

        //Transformation des données
        ArrayList<Data> listfinale = new ArrayList<Data>();
        Iterator<Data> it = list.iterator();

        while (it.hasNext()){
            Data d = it.next();
            if(d.getLevel()<3){
                listfinale.add(d);
            }
        }

        //Présentation

        System.out.println(listfinale);
    }
}

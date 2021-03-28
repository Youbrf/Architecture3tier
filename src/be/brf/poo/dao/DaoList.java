package be.brf.poo.dao;

import be.brf.poo.Data;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;

public class DaoList implements IDao{
    //Données membres
    ArrayList<Data> list = new ArrayList<Data>();

    @Override
    public ArrayList<Data> findAll() {
        return list;
    }

    @Override
    public Data find(int nro) {
        return list.get(nro);
    }

    @Override
    public ArrayList<Data> findByLevel(int level) {
        ArrayList<Data> result = new ArrayList<>();
        Iterator<Data> it = list.iterator();

        while(it.hasNext()){
            Data d = it.next();

            if (d.getLevel()==level){
                result.add(d);
            };
        }
        return result;
    }

    @Override
    public ArrayList<Data> findDataByInfo(Pattern regex) {
        return null;
    }

    @Override
    public void update(Data data, String info, int level, boolean free) {

    }

    @Override
    public void update(Data data, String info, int level) {

    }

    @Override
    public void updateInfo(Data data, String info) {

    }

    @Override
    public void updateLevel(Date data, int level) {

    }

    @Override
    public void delete(Data data) {

    }

    @Override
    public void delete(int nro) {

    }

    @Override
    public int deleteALL(boolean free) {
        return 0;
    }

    @Override
    public void insert(Data data) {

    }
}

package be.brf.poo.dao;

import be.brf.poo.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public interface IDao {
    // Annoncer CRUD Create Read Update Delete

    public ArrayList<Data> findAll();
    public Data find(int nro);
    public ArrayList<Data> findByLevel (int level);
    public ArrayList<Data> findDataByInfo (Pattern regex);
    public void update(Data data,String info,int level,boolean free);
    public void update(Data data,String info,int level);
    public void updateInfo (Data data,String info);
    public void updateLevel (Date data,int level);
    public void delete(Data data);
    public void delete(int nro);
    public int deleteALL(boolean free);
    public void insert(Data data);


}

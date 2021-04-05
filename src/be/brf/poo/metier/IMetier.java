package be.brf.poo.metier;

import java.util.ArrayList;

import be.brf.poo.Data;

public interface IMetier {
	
	public ArrayList<Data> findAll();
    public Data find(int nro);
    public ArrayList<Data> findByLevel (int level);
    public void update(Data data,String info,int level,boolean free);
}

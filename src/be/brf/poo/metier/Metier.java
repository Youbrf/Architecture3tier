package be.brf.poo.metier;

import java.util.ArrayList;

import be.brf.poo.Data;
import be.brf.poo.dao.DaoList;
import be.brf.poo.dao.IDao;

public class Metier implements IMetier {
	private IDao dao = new DaoList();

	@Override
	public ArrayList<Data> findAll() {
		return dao.findAll();
	}

	@Override
	public Data find(int nro) {
		return dao.find(nro);
	}

	@Override
	public ArrayList<Data> findByLevel(int level) {
		return dao.findByLevel(level);
	}

	@Override
	public void update(Data data, String info, int level, boolean free) {
		dao.update(data, info, level, free);
	}

}

package be.brf.poo.ui;

import java.util.ArrayList;

import be.brf.poo.Data;
import be.brf.poo.metier.IMetier;
import be.brf.poo.metier.Metier;

public class UiConsole implements IUi{
	IMetier metier = new Metier();
	@Override
	public void run() {
		System.out.println("Welcome");
		
		ArrayList<Data> list = metier.findAll();
		
		System.out.println("		Data avant update = "+list.get(3));
		
		System.out.println("------------------------------------------------");
		metier.update(list.get(3), "bingo", 1, false);
		
		System.out.println("		Data apres update = "+list.get(3));
	}
	
}

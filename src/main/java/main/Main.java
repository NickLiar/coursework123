package main;

import java.util.ArrayList;

import gui.*;
import classes.TableFriendly;

public class Main {
	public static int[] lastIds = {0, 0, 0, 0, 0};x
	
	public static final ArrayList<ArrayList<TableFriendly>> megaList = new ArrayList<ArrayList<TableFriendly>>();
	static {
		for(int i = 0; i < 5; ++i)
			megaList.add(new ArrayList<TableFriendly>());
	}
	
	public static void main(String[] args) {	
		var fr = new Hulk(700, 500);
		fr.setVisible(true);
	}
}

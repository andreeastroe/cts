package ro.ase.cts.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import ro.ase.cts.models.Coffee;
import ro.ase.cts.models.CoffeeType;

public class CoffeeDB {
	public static List<Coffee> coffeeNames;
	
	public static void connectDB(String user, String pw) throws IOException {
		coffeeNames = new ArrayList<Coffee>();
		BufferedReader reader = new BufferedReader(new FileReader("coffee.txt"));
		String line = "";
		
		while((line = reader.readLine()) != null) {
			String[] values = line.split(",");
			Coffee coffee = new Coffee(values[0], CoffeeType.valueOf(values[1]), Double.parseDouble(values[2]));
			coffeeNames.add(coffee);
		}
		
		reader.close();
		System.out.println("Successfully connected to DB..");
	}
	
//	public static String selectCoffeeByName(String name) {
//		return coffeeNames.get(coffeeNames.indexOf(name));
//	}
//	
//	public static String selectCoffeeByIndex(int index) {
//		return coffeeNames.get(index);
//	}
	
	public static void closeDB(String user, String pw) {
		coffeeNames.removeAll(coffeeNames);
	}
}

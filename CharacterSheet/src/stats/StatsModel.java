package stats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StatsModel {
	private int Endurance, Strength, Speed, Intelligence, Charisma, Wisdom, Dexterity, Constitution, Perception; //, Speed, Intelligence, MentalStrength, MentalEndurance;

	//start with something just for me then generalize it for more people


	public void upStats(int Endurance, int Strength, int Speed, int Intelligence, int Charisma, int Wisdom, int Dexterity, int Constitution, int Perception) {
		this.Endurance = Endurance + 1 ;
		this.Strength = Strength + 1;
		this.Speed = Speed + 1;
		this.Intelligence = Intelligence + 1;
		this.Charisma = Charisma+=1;
		this.Wisdom = Wisdom+=1;
		this.Dexterity = Dexterity+=1;
		this.Constitution = Constitution+=1;
		this.Perception = Perception+=1;
		
	}
	
	public void Save(String filename) {
		try(PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			writer.println(Endurance);
			writer.println(Strength);
			writer.println(Speed);
			writer.println(Intelligence);
			writer.println(Charisma);
			writer.println(Wisdom);
			writer.println(Dexterity);
			writer.println(Constitution);
			writer.println(Perception);
		}
		catch (IOException e) {
			System.err.println("Error saving fiel: " + e.getMessage());
		}
	}
	
	public void Load(String filename) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			//String name = reader.readLine();
			Endurance = Integer.parseInt(reader.readLine());
			Strength = Integer.parseInt(reader.readLine());
			Speed = Integer.parseInt(reader.readLine());
			Intelligence = Integer.parseInt(reader.readLine());
			Charisma = Integer.parseInt(reader.readLine());
			Wisdom = Integer.parseInt(reader.readLine());
			Dexterity = Integer.parseInt(reader.readLine());
			Constitution = Integer.parseInt(reader.readLine());
			Perception = Integer.parseInt(reader.readLine());
		}
		catch (IOException | NumberFormatException e) {
            System.err.println("Error loading file: " + e.getMessage());
        }
	}
	
	public int getEndurance() {return Endurance;}
	public int getStrength() {return Strength;}
	public int getAgility() {return Speed;}
	public int getIntelligence() {return Intelligence;}
	public int getCharisma() {return Charisma;}
	public int getWisdom() {return Wisdom;}
	public int getDexterity() {return Dexterity;}
	public int getConstitution() {return Constitution;}
	public int getPerception() {return Perception;}
}

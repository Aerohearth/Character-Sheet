package stats;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StatsModel {
	private int Endurance, Strength, Speed, Intelligence, Charisma, Wisdom, Dexterity, Constitution, Perception;
	private File fileDirectory = new File("/Users/aerohearth/git/Character-Sheet/CharacterSheet");
	private File TempFile;
	public int skillCount = 0;
	public String[] skillArray = new String[5];
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
		String SkillName;
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
			
			try (BufferedReader reader = new BufferedReader(new FileReader(TempFile))) {
				//String name = reader.readLine();
				for(int i = 0; i <= skillCount; i++) {
					SkillName = reader.readLine();
					writer.println(SkillName);
				}
			}
			catch (IOException | NumberFormatException e) {
	            System.err.println("Error loading file: " + e.getMessage());
	        }
			
			TempFile.delete();
		}
		catch (IOException e) {
			System.err.println("Error saving field: " + e.getMessage());
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
			for(int i = 0; i <= skillCount; i++) {
				String Skill = reader.readLine();
				NewSkillLoad(Skill);
				
			}
			
		}
		catch (IOException | NumberFormatException e) {
            System.err.println("Error loading file: " + e.getMessage());
        }
	}
	
	public JPanel NewSkill() {
		String inputSkill = JOptionPane.showInputDialog("Skill Name:");
		JLabel skillName = new JLabel(inputSkill);
		JPanel skill = new JPanel();
		skillArray[skillCount] = inputSkill;
		addSkillsToTempFile();
		skillCount+=1;
		
		/*try (PrintWriter writer = new PrintWriter(new FileWriter(TempFile))) {
			writer.println(inputSkill);
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}*/
		//add skill Label to TempSkill File for saving
		
		skill.add(skillName);
		skill.setBorder(BorderFactory.createLineBorder(Color.black));
		return skill;
	}
	
	/*public void createFile() {
		try (PrintWriter writer = new PrintWriter(new FileWriter(TempFile))) {
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}*/
	
	public JPanel NewSkillLoad(String loadSkill) {
		String inputSkill = loadSkill;
		JLabel skillName = new JLabel(inputSkill);
		JPanel skill = new JPanel();
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(TempFile))) {
			writer.println(inputSkill);
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		//add skill Label to TempSkill File for saving
		
		skill.add(skillName);
		skill.setBorder(BorderFactory.createLineBorder(Color.black));
		return skill;
	}
	
	public void createTempFile() {
		try {
			TempFile = File.createTempFile("TempSkills", ".txt", fileDirectory);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void addSkillsToTempFile() {
			try (PrintWriter writer = new PrintWriter(new FileWriter(TempFile))) {
				for (int i = 0; i <= skillCount; i++) {
					writer.println(skillArray[i]);
				}
			}
			catch (IOException e1) {
				e1.printStackTrace();
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

package stats;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StatsModel {
	private int Endurance, Strength, Agility, Intelligence, Charisma, Wisdom, Dexterity, Constitution, Perception;
	public int skillCount = 0;
	public JPanel[] skillArray = new JPanel[5];
	//start with something just for me then generalize it for more people


	public void upStats(int Endurance, int Strength, int Agility, int Intelligence, int Charisma, int Wisdom, int Dexterity, int Constitution, int Perception) {
		this.Endurance = Endurance+=1;
		this.Strength = Strength+=1;
		this.Agility = Agility+=1;
		this.Intelligence = Intelligence+=1;
		this.Charisma = Charisma+=1;
		this.Wisdom = Wisdom+=1;
		this.Dexterity = Dexterity+=1;
		this.Constitution = Constitution+=1;
		this.Perception = Perception+=1;
		
	}
	
	public void wipeStats(int Endurance, int Strength, int Agility, int Intelligence, int Charisma, int Wisdom, int Dexterity, int Constitution, int Perception) {
		this.Endurance = Endurance;
		this.Strength = Strength;
		this.Agility = Agility;
		this.Intelligence = Intelligence;
		this.Charisma = Charisma;
		this.Wisdom = Wisdom;
		this.Dexterity = Dexterity;
		this.Constitution = Constitution;
		this.Perception = Perception;
		/*for(int i = 0; i <= skillCount; i++) {
			skillArray[i] = null;
		}
		skillCount = 0;*/
		
	}
	
	public void upEndurance(int Endurance) {
		this.Endurance = Endurance+=1;
	}
	
	public void upStrength(int Strength) {
		this.Strength = Strength+=1;
	}
	
	public void upAgility(int Agility) {
		this.Agility = Agility+=1;
	}
	
	public void upIntelligence(int Intelligence) {
		this.Intelligence = Intelligence+=1;
	}
	
	public void upCharisma(int Charisma) {
		this.Charisma = Charisma+=1;
	}
	
	public void upWisdom(int Wisdom) {
		this.Wisdom = Wisdom+=1;
	}
	
	public void upDexterity(int Dexterity) {
		this.Dexterity = Dexterity+=1;
	}
	
	public void upConstitution(int Constitution) {
		this.Constitution = Constitution+=1;
	}
	
	public void upPerception(int Perception) {
		this.Perception = Perception+=1;
	}
	
	public void Save(String filename) {
		String SkillName;
		try(PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
			writer.println(Endurance);
			writer.println(Strength);
			writer.println(Agility);
			writer.println(Intelligence);
			writer.println(Charisma);
			writer.println(Wisdom);
			writer.println(Dexterity);
			writer.println(Constitution);
			writer.println(Perception);
			
			for(int i = 0; i <= skillCount; i++) {
				JLabel skillLabel = (JLabel)skillArray[i].getComponent(0);
				SkillName = skillLabel.getName();
						//skillArray[i].getName();
				writer.println(SkillName);
			}
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
			Agility = Integer.parseInt(reader.readLine());
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
		skill.add(skillName);
		skill.setBorder(BorderFactory.createLineBorder(Color.black));
		skillArray[skillCount] = skill;
		skillCount+=1;
		
		
		
		return skill;
	}
	
	
	public JPanel NewSkillLoad(String loadSkill) {
		String inputSkill = loadSkill;
		JLabel skillName = new JLabel(inputSkill);
		JPanel skill = new JPanel();
		
		
		//add skill Label to TempSkill File for saving
		
		skill.add(skillName);
		skill.setBorder(BorderFactory.createLineBorder(Color.black));
		return skill;
	}
	
	
	public int getEndurance() {return Endurance;}
	public int getStrength() {return Strength;}
	public int getAgility() {return Agility;}
	public int getIntelligence() {return Intelligence;}
	public int getCharisma() {return Charisma;}
	public int getWisdom() {return Wisdom;}
	public int getDexterity() {return Dexterity;}
	public int getConstitution() {return Constitution;}
	public int getPerception() {return Perception;}
}

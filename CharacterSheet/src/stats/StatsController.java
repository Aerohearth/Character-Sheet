package stats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StatsController {
	
	private StatsView TheView;
	private StatsModel TheModel;
	
	public StatsController(StatsView TheView, StatsModel TheModel) {
		
		this.TheView = TheView;
		this.TheModel = TheModel;
		
		this.TheView.addButtonListener(new ButtonListener());
		
	}

	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int Endurance, Strength, Agility, Intelligence, Charisma, Wisdom, Dexterity, Constitution, Perception;
			String ButtonName;
			ButtonName = e.getActionCommand();
			if(ButtonName.equals("Up your Stats!")) {
				try {
					Endurance = TheView.getEndurance();
					Strength = TheView.getStrength();
					Agility = TheView.getAgility();
					Intelligence = TheView.getIntelligence();
					Charisma = TheView.getCharisma();
					Wisdom = TheView.getWisdom();
					Dexterity = TheView.getDexterity();
					Constitution = TheView.getConstitution(); 
					Perception = TheView.getPerception();
					
					TheModel.upStats(Endurance, Strength, Agility, Intelligence, Charisma, Wisdom, Dexterity, Constitution, Perception);
					
					TheView.StatsNewEnduranceSolution(TheModel.getEndurance());
					TheView.StatsNewStrengthSolution(TheModel.getStrength());
					TheView.StatsNewAgilitySolution(TheModel.getAgility());
					TheView.StatsNewIntelligenceSolution(TheModel.getIntelligence());
					TheView.StatsNewCharismaSolution(TheModel.getCharisma());
					TheView.StatsNewWisdomSolution(TheModel.getWisdom());
					TheView.StatsNewDexteritySolution(TheModel.getDexterity());
					TheView.StatsNewConstitutionSolution(TheModel.getConstitution());
					TheView.StatsNewPerceptionSolution(TheModel.getPerception());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Save")) {
				try {
					String Character = JOptionPane.showInputDialog("Enter your character name");
					TheModel.Save(Character + ".txt");
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
				
			}
			
			else if(ButtonName.equals("Load")) {
				String Character = JOptionPane.showInputDialog("Enter your character name");
				TheModel.Load(Character + ".txt");
				
				TheView.StatsNewEnduranceSolution(TheModel.getEndurance());
				TheView.StatsNewStrengthSolution(TheModel.getStrength());
				TheView.StatsNewAgilitySolution(TheModel.getAgility());
				TheView.StatsNewIntelligenceSolution(TheModel.getIntelligence());
				TheView.StatsNewCharismaSolution(TheModel.getCharisma());
				TheView.StatsNewWisdomSolution(TheModel.getWisdom());
				TheView.StatsNewDexteritySolution(TheModel.getDexterity());
				TheView.StatsNewConstitutionSolution(TheModel.getConstitution());
				TheView.StatsNewPerceptionSolution(TheModel.getPerception());
				
			}
			
			else if(ButtonName.equals("Wipe")) {
				try {
					Endurance = 0;
					Strength = 0;
					Agility = 0;
					Intelligence = 0;
					Charisma = 0;
					Wisdom = 0;
					Dexterity = 0;
					Constitution = 0; 
					Perception = 0;
					
					TheModel.wipeStats(Endurance, Strength, Agility, Intelligence, Charisma, Wisdom, Dexterity, Constitution, Perception);
					
					TheView.StatsNewEnduranceSolution(TheModel.getEndurance());
					TheView.StatsNewStrengthSolution(TheModel.getStrength());
					TheView.StatsNewAgilitySolution(TheModel.getAgility());
					TheView.StatsNewIntelligenceSolution(TheModel.getIntelligence());
					TheView.StatsNewCharismaSolution(TheModel.getCharisma());
					TheView.StatsNewWisdomSolution(TheModel.getWisdom());
					TheView.StatsNewDexteritySolution(TheModel.getDexterity());
					TheView.StatsNewConstitutionSolution(TheModel.getConstitution());
					TheView.StatsNewPerceptionSolution(TheModel.getPerception());
					//Wiping Stats components
					
					for(int i = 0; i <= TheModel.skillCount; i++) {
						TheView.SkillsPanel.remove(TheModel.skillArray[i]);
						TheModel.skillArray[i] = null;
					}
					TheModel.skillCount = 0;
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("New Skill")) {
				JPanel NewSkill = TheModel.NewSkill();
				TheView.add(NewSkill);
				TheView.setVisible(true);
			}
			
			else if(ButtonName.equals("Endurance:")) {
				try {
					Endurance = TheView.getEndurance();
					
					TheModel.upEndurance(Endurance);
					
					TheView.StatsNewEnduranceSolution(TheModel.getEndurance());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Strength:")) {
				try {
					Strength = TheView.getStrength();
					
					TheModel.upStrength(Strength);
					
					TheView.StatsNewStrengthSolution(TheModel.getStrength());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Agility:")) {
				try {
					Agility = TheView.getAgility();
					
					TheModel.upAgility(Agility);
					
					TheView.StatsNewAgilitySolution(TheModel.getAgility());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Intelligence:")) {
				try {
					Intelligence = TheView.getIntelligence();
					
					TheModel.upIntelligence(Intelligence);
					
					TheView.StatsNewIntelligenceSolution(TheModel.getIntelligence());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Charisma:")) {
				try {
					Charisma = TheView.getCharisma();
					
					TheModel.upCharisma(Charisma);
					
					TheView.StatsNewCharismaSolution(TheModel.getCharisma());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Wisdom:")) {
				try {
					Wisdom = TheView.getWisdom();
					
					TheModel.upWisdom(Wisdom);
					
					TheView.StatsNewWisdomSolution(TheModel.getWisdom());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Dexterity:")) {
				try {
					Dexterity = TheView.getDexterity();
					
					TheModel.upDexterity(Dexterity);
					
					TheView.StatsNewDexteritySolution(TheModel.getDexterity());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Constitution:")) {
				try {
					Constitution = TheView.getConstitution();
					
					TheModel.upConstitution(Constitution);
					
					TheView.StatsNewConstitutionSolution(TheModel.getConstitution());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
			else if(ButtonName.equals("Perception:")) {
				try {
					Perception = TheView.getPerception();
					
					TheModel.upPerception(Perception);
					
					TheView.StatsNewPerceptionSolution(TheModel.getPerception());
				}
				
				catch(NumberFormatException ex) {
					TheView.displayErrorMessage("You need an integer");
				}
			}
			
		}
		
	}
}

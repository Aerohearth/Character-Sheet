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
		
		this.TheModel.createTempFile();
	}

	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int Endurance, Strength, Speed, Intelligence, Charisma, Wisdom, Dexterity, Constituition, Perception;
			String ButtonName;
			ButtonName = e.getActionCommand();
			if(ButtonName.equals("Up your Stats!")) {
				try {
					Endurance = TheView.getEndurance();
					Strength = TheView.getStrength();
					Speed = TheView.getAgility();
					Intelligence = TheView.getIntelligence();
					Charisma = TheView.getCharisma();
					Wisdom = TheView.getWisdom();
					Dexterity = TheView.getDexterity();
					Constituition = TheView.getConstitution(); 
					Perception = TheView.getPerception();
					
					TheModel.upStats(Endurance, Strength, Speed, Intelligence, Charisma, Wisdom, Dexterity, Constituition, Perception);
					
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
			
			else if(ButtonName.equals("New Skill")) {
				JPanel NewSkill = TheModel.NewSkill();
				TheView.add(NewSkill);
				TheView.setVisible(true);
			}
		}
		
	}
}

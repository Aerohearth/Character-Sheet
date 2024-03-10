package stats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatsController {
	
	private StatsView TheView;
	private StatsModel TheModel;
	
	public StatsController(StatsView TheView, StatsModel TheModel) {
		
		this.TheView = TheView;
		this.TheModel = TheModel;
		
		this.TheView.addButtonListener(new StatsListener());
	}

	
	class StatsListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int Endurance, Strength, Speed = 0, Intelligence = 0;
			
			try {
				Endurance = TheView.getEndurance();
				Strength = TheView.getStrength();
				Speed = TheView.getSpeed();
				Intelligence = TheView.getIntelligence();
				
				TheModel.upStats(Endurance, Strength, Speed, Intelligence);
				
				TheView.StatsNewEnduranceSolution(TheModel.getEndurance());
				TheView.StatsNewStrengthSolution(TheModel.getStrength());
				TheView.StatsNewSpeedSolution(TheModel.getSpeed());
				TheView.StatsNewIntelligenceSolution(TheModel.getIntelligence());
			}
			
			catch(NumberFormatException ex) {
				TheView.displayErrorMessage("You need an integer");
			}
		}
		
	}
}

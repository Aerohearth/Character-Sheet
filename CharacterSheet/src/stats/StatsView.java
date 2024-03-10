package stats;

import java.awt.event.ActionListener;
import javax.swing.*;

public class StatsView extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel EnduranceLabel = new JLabel("Endurance:");
	private JTextField Endurance = new JTextField(10);
	private JLabel StrengthLabel = new JLabel("Strength:");
	private JTextField Strength = new JTextField(10);
	private JLabel SpeedLabel = new JLabel("Speed:");
	private JTextField Speed = new JTextField(10);
	private JLabel IntelligenceLabel = new JLabel("Intelligence:");
	private JTextField Intelligence = new JTextField(10);
	private JButton UpStats = new JButton("Up your Stats!");
	private JTextField NewEndurance = new JTextField(10);
	private JTextField NewStrength = new JTextField(10);
	private JTextField NewSpeed = new JTextField(10);
	private JTextField NewIntelligence = new JTextField(10);
	
	StatsView(){
		JPanel StatsPanel = new JPanel(); 
		// make Panel
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		// set size and close on clicking x
		
		StatsPanel.add(EnduranceLabel);
		StatsPanel.add(Endurance);
		StatsPanel.add(StrengthLabel);
		StatsPanel.add(Strength);
		StatsPanel.add(SpeedLabel);
		StatsPanel.add(Speed);
		StatsPanel.add(IntelligenceLabel);
		StatsPanel.add(Intelligence);
		StatsPanel.add(UpStats);
		StatsPanel.add(NewEndurance);
		StatsPanel.add(NewStrength);
		StatsPanel.add(NewSpeed);
		StatsPanel.add(NewIntelligence);
		// add all our JComponents to the Panel
		
		this.add(StatsPanel);
		// add Panel to our JFrame
	}
	
	public int getEndurance() {
		return Integer.parseInt(Endurance.getText());
	}
	
	public int getStrength() {
		return Integer.parseInt(Strength.getText());
	}
	
	public int getSpeed() {
		return Integer.parseInt(Speed.getText());
	}
	
	public int getIntelligence() {
		return Integer.parseInt(Intelligence.getText());
	}
	
	public int getNewEndurance() {
		return Integer.parseInt(NewEndurance.getText());
	}
	
	public int getNewStrength() {
		return Integer.parseInt(NewStrength.getText());
	}
	
	public int getNewSpeed() {
		return Integer.parseInt(NewSpeed.getText());
	}
	
	public int getNewIntelligence() {
		return Integer.parseInt(NewIntelligence.getText());
	}
	
	public void StatsNewEnduranceSolution(int solution) {
		NewEndurance.setText(Integer.toString(solution));
	}
	
	public void StatsNewStrengthSolution(int solution) {
		NewStrength.setText(Integer.toString(solution));
	}
	
	public void StatsNewSpeedSolution(int solution) {
		NewSpeed.setText(Integer.toString(solution));
	}
	
	public void StatsNewIntelligenceSolution(int solution) {
		NewIntelligence.setText(Integer.toString(solution));
	}
	
	void addStatsListener(ActionListener ListenForUpStatsButton) {
		UpStats.addActionListener(ListenForUpStatsButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}

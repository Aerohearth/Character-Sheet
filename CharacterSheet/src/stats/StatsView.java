package stats;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StatsView extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel StatsPanel = new JPanel(); 
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
	//Stats Panel variables
	
	private JPanel GuidePanel = new JPanel();
	private JLabel AttributesGuideLabel = new JLabel("Attributes Guide:\n");
	private JLabel StrengthGuide = new JLabel("Strength:\n"
			+ "1: Unable to lift 5 lbs.\n"
			+ "10: Able to lift 200+ lbs.");
	
	StatsView(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		// Set JFrame size and close parameters
		
		setJMenuBar();
		// add Our Menu Bar to JFrame
		
		createStatsPanel();
		// set and create the Panel that shows our statistics
		
		createGuidePanel();
		// set and create the Panel that shows the Guide 
		
		setStatsPanel();
		// set the stats Panel as the first thing that pops up
	}
	
	public void setJMenuBar() {
		JMenuBar menuBar  = new JMenuBar();
			JMenu sheetMenu = new JMenu("Menu");
			MenuHandler mh = new MenuHandler();
		 
			JMenuItem item;
		   
			item = new JMenuItem("Stats");
			item.addActionListener(mh);
			sheetMenu.add(item);
			sheetMenu.addSeparator();
		   
			item = new JMenuItem("Guide");
			item.addActionListener(mh);
			sheetMenu.add(item);
		   
		   menuBar.add(sheetMenu);
		   this.setJMenuBar(menuBar);
	}
	
	public void createStatsPanel() {
		//JPanel StatsPanel = new JPanel(); 
		// make Panel
		
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
	}
	
	public void createGuidePanel() {
		//JPanel GuidePanel = new JPanel();
		// make Panel
		
		GuidePanel.add(AttributesGuideLabel);
		GuidePanel.add(StrengthGuide);
		// add all our JComponents to the Panel
	}
	
	class MenuHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String menuName;
			menuName = e.getActionCommand();
			if (menuName.equals("Stats")) {
				setStatsPanel();
			}
			else if (menuName.equals("Guide")) {
				setGuidePanel();
			}
		
		}
	}
	
	public void setStatsPanel() {
		this.setContentPane(StatsPanel);
		this.StatsPanel.setVisible(true);
		this.GuidePanel.setVisible(false);
	}
	
	public void setGuidePanel() {
		this.setContentPane(GuidePanel);
		this.GuidePanel.setVisible(true);
		this.StatsPanel.setVisible(false);
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
	
	void addButtonListener(ActionListener ListenForUpStatsButton) {
		UpStats.addActionListener(ListenForUpStatsButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}

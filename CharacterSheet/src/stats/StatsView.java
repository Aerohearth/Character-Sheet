package stats;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StatsView extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel StatsPanel = new JPanel(); 
	
	private JLabel AttributesLabel = new JLabel("Attributes:");
	private JLabel AttributeLevelLabel = new JLabel("Level:");
	private JLabel NewAttributeLevelLabel = new JLabel("New Level:");
	
	private JLabel EnduranceLabel = new JLabel("Endurance:");
	private JLabel Endurance = new JLabel("1");
	//private JTextField NewEndurance = new JTextField(10); Might use for "/10
	
	private JLabel StrengthLabel = new JLabel("Strength:");
	private JTextField Strength = new JTextField(10);
	//private JTextField NewStrength = new JTextField(10);
	
	private JLabel AgilityLabel = new JLabel("Agility:");
	private JTextField Agility = new JTextField(10);
	//private JTextField NewAgility = new JTextField(10);
	
	private JLabel IntelligenceLabel = new JLabel("Intelligence:");
	private JTextField Intelligence = new JTextField(10);
	//private JTextField NewIntelligence = new JTextField(10);
	
	private JLabel CharismaLabel = new JLabel("Charisma:");
	private JTextField Charisma = new JTextField(10);
	//private JTextField NewCharisma = new JTextField(10);
	
	private JLabel WisdomLabel = new JLabel("Wisdom:");
	private JTextField Wisdom = new JTextField(10);
	//private JTextField NewWisdom = new JTextField(10);
	
	private JLabel DexterityLabel = new JLabel("Dexterity:");
	private JTextField Dexterity = new JTextField(10);
	//private JTextField NewDexterity = new JTextField(10);
	
	private JLabel ConstitutionLabel = new JLabel("Constitution:");
	private JTextField Constitution = new JTextField(10);
	//private JTextField NewConstitution = new JTextField(10);
	
	private JLabel PerceptionLabel = new JLabel("Perception:");
	private JTextField Perception = new JTextField(10);
	//private JTextField NewPerception = new JTextField(10);
	
	private JButton UpStats = new JButton("Up your Stats!");
	//Stats Panel variables
	
	private JPanel GuidePanel = new JPanel();
	private JLabel AttributesGuideLabel = new JLabel("Attributes Guide:\n");
	private JLabel StrengthGuide = new JLabel("Strength:\n"
			+ "1: Unable to lift 5 lbs.\n"
			+ "10: Able to lift 200+ lbs.");
	//Guide Panel variables
	
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
		GridLayout statsLayout = new GridLayout(0,2);
		
		StatsPanel.setLayout(statsLayout);
		
		
		StatsPanel.add(AttributesLabel);
		StatsPanel.add(AttributeLevelLabel);
		StatsPanel.add(NewAttributeLevelLabel);
		StatsPanel.add(EnduranceLabel);
		StatsPanel.add(Endurance);
		//StatsPanel.add(NewEndurance);
		StatsPanel.add(StrengthLabel);
		StatsPanel.add(Strength);
		//StatsPanel.add(NewStrength);
		StatsPanel.add(AgilityLabel);
		StatsPanel.add(Agility);
		//StatsPanel.add(NewAgility);
		StatsPanel.add(IntelligenceLabel);
		StatsPanel.add(Intelligence);	
		//StatsPanel.add(NewIntelligence);
		StatsPanel.add(CharismaLabel);
		StatsPanel.add(Charisma);
		//StatsPanel.add(NewCharisma);
		StatsPanel.add(WisdomLabel);
		StatsPanel.add(Wisdom);
		//StatsPanel.add(NewWisdom);
		StatsPanel.add(DexterityLabel);
		StatsPanel.add(Dexterity);
		//StatsPanel.add(NewDexterity);
		StatsPanel.add(ConstitutionLabel);
		StatsPanel.add(Constitution);
		//StatsPanel.add(NewConstitution);
		StatsPanel.add(PerceptionLabel);
		StatsPanel.add(Perception);
		//StatsPanel.add(NewPerception);
		StatsPanel.add(UpStats);
		// add all our JComponents to the Panel
	}
	
	public void createGuidePanel() {
		//JPanel GuidePanel = new JPanel();
		// make Panel
		GridLayout guideLayout = new GridLayout(0,2);
		
		GuidePanel.setLayout(guideLayout);
		
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
	
	public void StatsNewEnduranceSolution(int solution) {
		Endurance.setText(Integer.toString(solution));
	}
	
	public int getStrength() {
		return Integer.parseInt(Strength.getText());
	}
	
	public void StatsNewStrengthSolution(int solution) {
		Strength.setText(Integer.toString(solution));
	}
	
	public int getAgility() {
		return Integer.parseInt(Agility.getText());
	}
	
	public void StatsNewAgilitySolution(int solution) {
		Agility.setText(Integer.toString(solution));
	}
	
	public int getIntelligence() {
		return Integer.parseInt(Intelligence.getText());
	}
	
	public void StatsNewIntelligenceSolution(int solution) {
		Intelligence.setText(Integer.toString(solution));
	}
	
	public int getCharisma() {
		return Integer.parseInt(Charisma.getText());
	}
	
	public void StatsNewCharismaSolution(int solution) {
		Charisma.setText(Integer.toString(solution));
	}
	
	public int getWisdom() {
		return Integer.parseInt(Wisdom.getText());
	}
	
	public void StatsNewWisdomSolution(int solution) {
		Wisdom.setText(Integer.toString(solution));
	}
	
	public int getDexterity() {
		return Integer.parseInt(Dexterity.getText());
	}
	
	public void StatsNewDexteritySolution(int solution) {
		Dexterity.setText(Integer.toString(solution));
	}
	
	public int getConstitution() {
		return Integer.parseInt(Constitution.getText());
	}
	
	public void StatsNewConstitutionSolution(int solution) {
		Constitution.setText(Integer.toString(solution));
	}
	
	public int getPerception() {
		return Integer.parseInt(Perception.getText());
	}
	
	public void StatsNewPerceptionSolution(int solution) {
		Perception.setText(Integer.toString(solution));
	}
	
	void addButtonListener(ActionListener ListenForUpStatsButton) {
		UpStats.addActionListener(ListenForUpStatsButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}

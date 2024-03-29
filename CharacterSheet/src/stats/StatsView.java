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
	//private JLabel NewAttributeLevelLabel = new JLabel("New Level:");
	
	private JButton EnduranceButton = new JButton("Endurance:");
	private JLabel Endurance = new JLabel("0");
	//private JTextField NewEndurance = new JTextField(10); Might use for "/10
	
	private JButton StrengthButton = new JButton("Strength:");
	private JLabel Strength = new JLabel("0");
	//private JTextField NewStrength = new JTextField(10);
	
	private JButton AgilityButton = new JButton("Agility:");
	private JLabel Agility = new JLabel("0");
	//private JTextField NewAgility = new JTextField(10);
	
	private JButton IntelligenceButton = new JButton("Intelligence:");
	private JLabel Intelligence = new JLabel("0");
	//private JTextField NewIntelligence = new JTextField(10);
	
	private JButton CharismaButton = new JButton("Charisma:");
	private JLabel Charisma = new JLabel("0");
	//private JTextField NewCharisma = new JTextField(10);
	
	private JButton WisdomButton = new JButton("Wisdom:");
	private JLabel Wisdom = new JLabel("0");
	//private JTextField NewWisdom = new JTextField(10);
	
	private JButton DexterityButton = new JButton("Dexterity:");
	private JLabel Dexterity = new JLabel("0");
	//private JTextField NewDexterity = new JTextField(10);
	
	private JButton ConstitutionButton = new JButton("Constitution:");
	private JLabel Constitution = new JLabel("0");
	//private JTextField NewConstitution = new JTextField(10);
	
	private JButton PerceptionButton = new JButton("Perception:");
	private JLabel Perception = new JLabel("0");
	//private JTextField NewPerception = new JTextField(10);
	
	private JButton UpStats = new JButton("Up your Stats!");
	private JButton SaveStats = new JButton("Save");
	private JButton LoadStats = new JButton("Load");
	private JButton WipeStats = new JButton("Wipe");
	//Stats Panel variables
	
	private JPanel GuidePanel = new JPanel();
	//Guide Panel variables
	
	public JPanel SkillsPanel = new JPanel();
	private JButton addSkill = new JButton("New Skill");
	
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
		
		createSkillPanel();
		// set and create the Panel that shows the characters skills
		
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
			sheetMenu.addSeparator();
			
			item = new JMenuItem("Skills");
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
		
		//setButtonLayout();
		
		StatsPanel.add(AttributesLabel);
		StatsPanel.add(AttributeLevelLabel);
		
		StatsPanel.add(EnduranceButton);
		StatsPanel.add(Endurance);
		
		StatsPanel.add(StrengthButton);
		StatsPanel.add(Strength);

		StatsPanel.add(AgilityButton);
		StatsPanel.add(Agility);

		StatsPanel.add(IntelligenceButton);
		StatsPanel.add(Intelligence);	

		StatsPanel.add(CharismaButton);
		StatsPanel.add(Charisma);

		StatsPanel.add(WisdomButton);
		StatsPanel.add(Wisdom);
		
		StatsPanel.add(DexterityButton);
		StatsPanel.add(Dexterity);

		StatsPanel.add(ConstitutionButton);
		StatsPanel.add(Constitution);

		StatsPanel.add(PerceptionButton);
		StatsPanel.add(Perception);

		StatsPanel.add(UpStats);
		StatsPanel.add(SaveStats);
		StatsPanel.add(LoadStats);
		StatsPanel.add(WipeStats);
		// add all our JComponents to the Panel
	}
	
	//store the JLabel then when we load it create Panels for it/ remove other panels if created before loading (reset Panel)
	
	public void createSkillPanel() {
		//GridLayout skillsLayout = new GridLayout(0,2);
		
		//SkillsPanel.setLayout(skillsLayout);
		
		SkillsPanel.add(addSkill);
	}
	
	public void createGuidePanel() {
		//JPanel GuidePanel = new JPanel();
		// make Panel
		GridLayout guideLayout = new GridLayout(0,3);
		
		GuidePanel.setLayout(guideLayout);
		
		JLabel AttributesGuideLabel = new JLabel("Attributes Guide:");
		JLabel Lvl1Attributes = new JLabel("LVL 1:");
		JLabel Lvl10Attributes = new JLabel("LVL 10:");
		
		JLabel EnduranceGuide = new JLabel("Endurance:");
		JLabel EnduranceLVL1 = new JLabel("Tires quickly after light physical activity.");
		JLabel EnduranceLVL10 = new JLabel("Can maintain physical activity for several hours without tiring.");
		
		JLabel StrengthGuide = new JLabel("Strength:");
		JLabel StrengthLVL1 = new JLabel("Unable to lift 5 lbs.");
		JLabel StrengthLVL10 = new JLabel("Able to lift 200+ lbs.");
		
		JLabel AgilityGuide = new JLabel("Agility:");
		JLabel AgilityLVL1 = new JLabel("Struggles to catch a slow-moving object.");
		JLabel AgilityLVL10 = new JLabel("Can easily catch a fast-moving object.");
		
		JLabel IntelligenceGuide = new JLabel("Intelligence:");
		JLabel IntelligenceLVL1 = new JLabel("Struggles with basic arithmetic.");
		JLabel IntelligenceLVL10 = new JLabel("Solves complex mathematical problems with ease.");
		
		JLabel CharismaGuide = new JLabel("Charisma:");
		JLabel CharismaLVL1 = new JLabel("Finds it difficult to make friends or connect with others.");
		JLabel CharismaLVL10 = new JLabel("Charms almost everyone they meet.");
		
		JLabel WisdomGuide = new JLabel("Wisdom:");
		JLabel WisdomLVL1 = new JLabel("Often makes poor decisions without considering the consequences.");
		JLabel WisdomLVL10 = new JLabel("Makes wise decisions consistently, considering long-term effects.");
		
		JLabel DexterityGuide = new JLabel("Dexterity:");
		JLabel DexterityLVL1 = new JLabel("Clumsy and frequently drops or spills things.");
		JLabel DexterityLVL10 = new JLabel("Extremely precise and coordinated in physical tasks.");
		
		JLabel ConstitutionGuide = new JLabel("Constitution:");
		JLabel ConstitutionLVL1 = new JLabel("Prone to illness and fatigue.");
		JLabel ConstitutionLVL10 = new JLabel("Rarely gets sick and can endure extreme physical conditions.");
		
		JLabel PerceptionGuide = new JLabel("Perception:");
		JLabel PerceptionLVL1 = new JLabel("Often misses important details in their surroundings.");
		JLabel PerceptionLVL10 = new JLabel("Notices even the slightest changes or anomalies.");
		
		GuidePanel.add(AttributesGuideLabel);
		GuidePanel.add(Lvl1Attributes);
		GuidePanel.add(Lvl10Attributes);
		
		GuidePanel.add(EnduranceGuide);
		GuidePanel.add(EnduranceLVL1);
		GuidePanel.add(EnduranceLVL10);
		
		GuidePanel.add(StrengthGuide);
		GuidePanel.add(StrengthLVL1);
		GuidePanel.add(StrengthLVL10);
		
		GuidePanel.add(AgilityGuide);
		GuidePanel.add(AgilityLVL1);
		GuidePanel.add(AgilityLVL10);
		
		GuidePanel.add(IntelligenceGuide);
		GuidePanel.add(IntelligenceLVL1);
		GuidePanel.add(IntelligenceLVL10);
		
		GuidePanel.add(CharismaGuide);
		GuidePanel.add(CharismaLVL1);
		GuidePanel.add(CharismaLVL10);
		
		GuidePanel.add(WisdomGuide);
		GuidePanel.add(WisdomLVL1);
		GuidePanel.add(WisdomLVL10);
		
		GuidePanel.add(DexterityGuide);
		GuidePanel.add(DexterityLVL1);
		GuidePanel.add(DexterityLVL10);
		
		GuidePanel.add(ConstitutionGuide);
		GuidePanel.add(ConstitutionLVL1);
		GuidePanel.add(ConstitutionLVL10);
		
		GuidePanel.add(PerceptionGuide);
		GuidePanel.add(PerceptionLVL1);
		GuidePanel.add(PerceptionLVL10);
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
			else if (menuName.equals("Skills")) {
				setSkillsPanel();
			}
		
		}
	}
	
	public void setStatsPanel() {
		this.setContentPane(StatsPanel);
		this.StatsPanel.setVisible(true);
		this.GuidePanel.setVisible(false);
		this.SkillsPanel.setVisible(false);
	}
	
	public void setSkillsPanel() {
		this.setContentPane(SkillsPanel);
		this.StatsPanel.setVisible(false);
		this.GuidePanel.setVisible(false);
		this.SkillsPanel.setVisible(true);
	}
	
	public void setGuidePanel() {
		this.setContentPane(GuidePanel);
		this.GuidePanel.setVisible(true);
		this.StatsPanel.setVisible(false);
		this.SkillsPanel.setVisible(false);
	}
	
	/*public void setButtonLayout() {
		EnduranceButton.setPreferredSize(new Dimension(4, 4));
		StrengthButton.setPreferredSize(new Dimension(40, 40));
		AgilityButton.setPreferredSize(new Dimension(40, 40));
		IntelligenceButton.setPreferredSize(new Dimension(40, 40));
		CharismaButton.setPreferredSize(new Dimension(40, 40));
		WisdomButton.setPreferredSize(new Dimension(40, 40));
		DexterityButton.setPreferredSize(new Dimension(40, 40));
		ConstitutionButton.setPreferredSize(new Dimension(40, 40));
		PerceptionButton.setPreferredSize(new Dimension(40, 40));
		UpStats.setPreferredSize(new Dimension(4,4));
	}*/
	
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
		SaveStats.addActionListener(ListenForUpStatsButton);
		LoadStats.addActionListener(ListenForUpStatsButton);
		addSkill.addActionListener(ListenForUpStatsButton);
		EnduranceButton.addActionListener(ListenForUpStatsButton);
		StrengthButton.addActionListener(ListenForUpStatsButton);
		AgilityButton.addActionListener(ListenForUpStatsButton);
		IntelligenceButton.addActionListener(ListenForUpStatsButton);
		CharismaButton.addActionListener(ListenForUpStatsButton);
		WisdomButton.addActionListener(ListenForUpStatsButton);
		DexterityButton.addActionListener(ListenForUpStatsButton);
		ConstitutionButton.addActionListener(ListenForUpStatsButton);
		PerceptionButton.addActionListener(ListenForUpStatsButton);
		WipeStats.addActionListener(ListenForUpStatsButton);
	}
	
	public void SkillsSolution(String skill) {
		
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}

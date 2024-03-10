package stats;

public class StatsModel {
	private int Endurance, Strength, Speed, Intelligence; //, Speed, Intelligence, MentalStrength, MentalEndurance;

	//start with something just for me then generalize it for more people


	public void upStats(int Endurance, int Strength, int Speed, int Intelligence) {
		this.Endurance = Endurance + 1 ;
		this.Strength = Strength + 1;
		this.Speed = Speed + 1;
		this.Intelligence = Intelligence + 1;
	}
	
	public int getEndurance() {return Endurance;}
	public int getStrength() {return Strength;}
	public int getSpeed() {return Speed;}
	public int getIntelligence() {return Intelligence;}
}

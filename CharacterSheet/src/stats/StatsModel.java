package stats;

public class StatsModel {
	private int Endurance, Strength, Speed, Intelligence, Charisma, Wisdom, Dexterity, Constitution, Perception; //, Speed, Intelligence, MentalStrength, MentalEndurance;

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

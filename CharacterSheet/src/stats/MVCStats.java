package stats;

public class MVCStats {
	static StatsView theView = new StatsView();
	
	public static void main(String[] args) {
		
		
		StatsModel theModel = new StatsModel();
		
		StatsController theController = new StatsController(theView, theModel);
		
		theView.setVisible(true);
	}

}
/* we can set it up so we ask general questions for each added skill to determine our proficiency in it, we can also set a benchmark 
 * feat/test we can use to determine our stats in strength,speed, intelligence, etc
 */
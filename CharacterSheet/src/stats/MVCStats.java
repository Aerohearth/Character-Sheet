package stats;

public class MVCStats {
	
	public static void main(String[] args) {
		
		StatsView theView = new StatsView();
		
		StatsModel theModel = new StatsModel();
		
		StatsController theController = new StatsController(theView, theModel);
		
		theView.setVisible(true);
	}

}
/* we can set it up so we ask general questions for each added skill to determine our proficiency in it, we can also set a benchmark 
 * feat/test we can use to determine our stats in strength,speed, intelligence, etc
 * 
 * research study,work study, job at school
 * internships
 * 
 * projects - Schoolwork - life skills - money - exercise - future steps - studying
 * 
 * 5 year plan
 */
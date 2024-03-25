package stats;

public class MVCStats {
	static StatsView theView = new StatsView();
	
	public static void main(String[] args) {
		
		
		StatsModel theModel = new StatsModel();
		
		StatsController theController = new StatsController(theView, theModel);
		
		theView.setVisible(true);
	}

} // create a temporary file every time we add a new skill
/* create a new temp file
 * read previous file into new file 
 * add new skill
 */

 
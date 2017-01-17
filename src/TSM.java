
public class TSM extends CSGOTeams {
	private String biggestWin;
	
	public TSM(String teamName, String teamColor, String region, String player1, String player2, String player3, String player4, String player5){
		super("Cloud9", "Blue&White", "North America", "Stewie2k", "Autimatic", "Skadoodle", "Shroud", "N0thing");
		this.biggestWin = biggestWin;	
	}
	
	public String c9biggestwin() {
		this.biggestWin = "ESL Pro League Season 4";
		return this.biggestWin;
	}
	
	public String getTeamInfo(){
		return super.getTeamInfo() + "\n" + "The Team's Biggest Win was " + biggestWin;
	}
}

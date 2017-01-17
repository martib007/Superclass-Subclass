public class CSGOTeams extends EsportTeams {
	//defining of variables
	private String biggestWin;
	private String gamePlayed;

	//constructor
	public CSGOTeams(String teamName, String teamColor, String region, String player1, String player2, String player3, String player4, String player5, String biggestWin){
		super(teamName, teamColor, region, player1, player2, player3, player4, player5);
		this.biggestWin = biggestWin;
		this.gamePlayed = "Counter Strike: Global Offensive";
	}
	
	//gets team's bigest win
	public String getBiggestWin() {;
		return this.biggestWin;
	}
	
	//displays team's info + biggest win
	public void getTeamInfo(){
		super.getTeamInfo();
		System.out.println("The game that the team plays competatively is " + gamePlayed + ".");
		System.out.println("The team's biggest win was " + biggestWin + ".");
	}
}

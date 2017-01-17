
public class CSGOTeams {
	private String teamName;
	private String teamColor;
	private String region;
	private String player1;
	private String player2;
	private String player3;
	private String player4;
	private String player5;
	
	
	public CSGOTeams(String teamName, String teamColor, String region, String player1, String player2, String player3, String player4, String player5) {
		this.teamName = teamName;
		this.teamColor = teamColor;
		this.region = region;
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		this.player5 = player5;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	
	public String getTeamColor(){
		return this.teamColor;
	}
	
	public String getTeamRegion(){
		return this.region;
	}
	
	public String getPlayer1(){
		return this.player1;
	}
	
	public String getPlayer2(){
		return this.player2;
	}
	
	public String getPlayer3(){
		return this.player3;
	}
	
	public String getPlayer4(){
		return this.player4;
	}
	
	public String getPlayer5(){
		return this.player5;
	}

	
	public String getTeamInfo(){
		return "This team is named " + teamName + " , their colors are " + teamColor + ", and they are from " 
			+ region + "\n" + "This team consists of the players " + ("1. ") + player1 + ("2. ") + player2 
			+ ("3. ") + player3 + ("4. ") + player4 + ("5. ") + player5 ;
	}
	
	public void lol() {
		System.out.println(teamName);
	}
	


}

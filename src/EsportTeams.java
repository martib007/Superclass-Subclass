public class EsportTeams {
	//defining of variables
	private String teamName;
	private String teamColor;
	private String region;
	private String player1;
	private String player2;
	private String player3;
	private String player4;
	private String player5;
	
	//constructor
	public EsportTeams(String teamName, String teamColor, String region, String player1, String player2, String player3, String player4, String player5) {
		this.teamName = teamName;
		this.teamColor = teamColor;
		this.region = region;
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		this.player5 = player5;
	}
	
	//gets team name
	public void getTeamName() {
		System.out.println(this.teamName);
	}
	
	//gets team color
	public void getTeamColor(){
		System.out.println(this.teamColor);
	}
	
	//gets the team's region
	public String getTeamRegion(){
		return this.region;
	}
	
	//gets player 1's name
	public void getPlayer1(){
		System.out.print(this.player1);
	}
	
	//gets player 2's name
	public void getPlayer2(){
		System.out.print(this.player2);
	}
	
	//gets player 3's name
	public void getPlayer3(){
		System.out.print(this.player3);
	}
	
	//gets player 4's name
	public void getPlayer4(){
		System.out.print(this.player4);
	}
	
	//gets player 5's name
	public void getPlayer5(){
		System.out.print(this.player5);
	}

	//displays all of the team's info
	public void getTeamInfo(){
		System.out.println("This team is named " + teamName + ", their colors are " + teamColor + ", and they are from " 
			+ region + ".\n" + "This team consists of the players " + ("1.") + player1 + (" 2.") + player2 
			+ (" 3.") + player3 + (" 4.") + player4 + (" 5.") + player5 + ".");
	}

}

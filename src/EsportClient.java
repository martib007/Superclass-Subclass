public class EsportClient {
	public static void main(String[] args) {
		
		
		CSGOTeams Cloud9 = new CSGOTeams("Cloud9", "Blue & White", "North America", "Stewie2k", "Autimatic", "Skadoodle", "Shroud", "N0thing", "ESL Pro League Season 4 Finals");
		Cloud9.getTeamInfo();
		System.out.println("");
		
		CSGOTeams Faze = new CSGOTeams("Faze", "Red, Blue, & White", "Europe", "karrigan", "allu", "kioShiMa", "aizy", "rain", "ELEAGUE Major Main Qualifier");
		Faze.getTeamInfo();
		System.out.println("");
		
		CSGOTeams Astralis = new CSGOTeams("Astralis", "Red & Black", "Europe", "Xyp9x", "dupreeh", "gla1ve", "device", "Kjaerbye", "ECS Season 2 Finals");
		Astralis.getTeamInfo();
		System.out.println("");
	}
}
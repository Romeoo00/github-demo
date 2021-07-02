package SoccerExple;

public abstract class Soccer {
	public void Play() {
		soccerTeam1();
		soccerTeam2();
		soccerTeam3();
	}
	
	
	abstract void soccerTeam1();
	abstract void soccerTeam2();
	abstract void soccerTeam3();
}

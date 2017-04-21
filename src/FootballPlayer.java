
public class FootballPlayer implements Comparable<FootballPlayer> {

	private String name;
	private int age;
	private int NumberOfMatchesPlayed;
	private int NumberOfGoals;
	private int rank;
	
	
	public FootballPlayer(String name, int age, int numberOfMatchesPlayed, int numberOfGoals, int rank) {
		super();
		this.name = name;
		this.age = age;
		NumberOfMatchesPlayed = numberOfMatchesPlayed;
		NumberOfGoals = numberOfGoals;
		this.rank = rank;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumberOfMatchesPlayed() {
		return NumberOfMatchesPlayed;
	}
	public void setNumberOfMatchesPlayed(int numberOfMatchesPlayed) {
		NumberOfMatchesPlayed = numberOfMatchesPlayed;
	}
	public int getNumberOfGoals() {
		return NumberOfGoals;
	}
	public void setNumberOfGoals(int numberOfGoals) {
		NumberOfGoals = numberOfGoals;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public int compareTo(FootballPlayer arg0) {
		// TODO Auto-generated method stub
		if(this.rank==arg0.rank)
			return 0;
		else if(this.rank>arg0.rank)
			return 1;
		else 
			return -1;
	}

	@Override
public String toString() {
		return "FootballPlayer [name=" + name + ", age=" + age + ", NumberOfMatchesPlayed=" + NumberOfMatchesPlayed
				+ ", NumberOfGoals=" + NumberOfGoals + ", rank=" + rank + "]";
	}
	
/*	public String toString() {
		return name +" rank="+rank ;
	}
	*/
	

}

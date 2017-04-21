import java.util.ArrayList;
import java.util.List;

public class TeamThree extends FootballTeams {

	@Override
	public List<FootballPlayer> getTeams() {
		// TODO Auto-generated method stub
		
		List<FootballPlayer> list=new ArrayList<FootballPlayer>();
		FootballPlayer fb=new FootballPlayer("Sanjay",33,10,15,2);
		FootballPlayer fb1=new FootballPlayer("Bhanu",23,1,15,1);
		FootballPlayer fb2=new FootballPlayer("Raghu",32,9,15,3);
		FootballPlayer fb3=new FootballPlayer("Sai",30,15,15,4);
		FootballPlayer fb4=new FootballPlayer("Shrilata",33,02,15,5);
		FootballPlayer fb5=new FootballPlayer("Naresh",6,10,15,6);
		FootballPlayer fb6=new FootballPlayer("Deepak",4,10,15,2);
		FootballPlayer fb7=new FootballPlayer("Nilesh",29,11,15,8);
		FootballPlayer fb8=new FootballPlayer("Ankur",33,10,15,9);
		FootballPlayer fb9=new FootballPlayer("Abhishek",34,16,15,1);
		FootballPlayer fb10=new FootballPlayer("vikram",18,10,15,2);
		FootballPlayer fb11=new FootballPlayer("vibhor",18,10,15,2);
		FootballPlayer fb12=new FootballPlayer("Jash",34,16,15,10);
		FootballPlayer fb13=new FootballPlayer("Saurabh",18,10,15,20);
		FootballPlayer fb14=new FootballPlayer("Rajat",18,10,15,28);
		
		list.add(fb);
		list.add(fb1);
		list.add(fb2);
		list.add(fb3);
		list.add(fb4);
		list.add(fb5);
		list.add(fb6);
		list.add(fb7);
		list.add(fb8);
		list.add(fb9);
		list.add(fb10);
		list.add(fb11);
		list.add(fb12);
		list.add(fb13);
		list.add(fb14);
		
		return list;
		
	}

}

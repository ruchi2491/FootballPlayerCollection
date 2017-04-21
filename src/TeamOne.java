import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TeamOne extends FootballTeams {

	@Override
	public List<FootballPlayer> getTeams() {
		List<FootballPlayer> list=new ArrayList<FootballPlayer>();
		FootballPlayer fb=new FootballPlayer("Alex",33,10,15,2);
		FootballPlayer fb1=new FootballPlayer("Messy",23,1,15,1);
		FootballPlayer fb2=new FootballPlayer("John",32,9,15,3);
		FootballPlayer fb3=new FootballPlayer("sheks",30,15,15,4);
		FootballPlayer fb4=new FootballPlayer("Ron",33,02,15,5);
		FootballPlayer fb5=new FootballPlayer("Robert",6,10,15,6);
		FootballPlayer fb6=new FootballPlayer("Jatin",4,10,15,2);
		FootballPlayer fb7=new FootballPlayer("shubham",6,10,15,1);
		FootballPlayer fb8=new FootballPlayer("Fazal",28,5,15,3);
		FootballPlayer fb9=new FootballPlayer("Unmil",26,8,15,3);
		FootballPlayer fb10=new FootballPlayer("Navin",30,6,15,8);
		FootballPlayer fb11=new FootballPlayer("Ashok",29,11,15,8);
		FootballPlayer fb12=new FootballPlayer("chinmay",34,16,15,10);
		FootballPlayer fb13=new FootballPlayer("Akshay",18,10,15,20);
		FootballPlayer fb14=new FootballPlayer("Rehman",18,10,15,28);
		
		
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
		
		/*Collections.sort(list);
		System.out.println(list);*/
		return list;
		
	}

	
	
}

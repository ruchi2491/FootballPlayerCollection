import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class client {
public static void main(String[] args) {
	FootballTeams ft=new TeamOne();
	FootballTeams ft1=new TeamTwo();
	FootballTeams ft2=new TeamThree();
	
	List<FootballPlayer> list=new ArrayList<FootballPlayer>();
	List<FootballPlayer> list1=new ArrayList<FootballPlayer>();
	List<FootballPlayer> list2=new ArrayList<FootballPlayer>();
	list=ft.getTeams();
	list1=ft1.getTeams();
	list2=ft2.getTeams();
	
	
	Collections.sort(list);
	Collections.sort(list1);
	Collections.sort(list2);
	System.out.println("................................sorted list according to rank is.............................");
	System.out.println(list);
	System.out.println(list1);	
	System.out.println(list2);
	
	
	//System.out.println(list);
	list.addAll(list1);
	//System.out.println(list);
	list.addAll(list2);
	//System.out.println(list);
	Collections.sort(list);
	System.out.println("................................sorted Master list according to rank is.............................");
	
	Iterator< FootballPlayer> iter=list.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	
	
	
	
	
	
}
}

import java.util.LinkedList;
import java.util.List;

public class linkedListTest {

	public static void main(String[] args) {
//		System.out.println("hello");
		
		List<Integer> list= new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(Integer o:list)
		{
			System.out.println(o+1);
		}	
		
	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mapq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Map<String,List<String>> m1=new HashMap<String,List<String>>();
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Student1");
		a1.add("Student2");
		m1.put("CSE",a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Student3");
		a2.add("Student4");
		m1.put("ECE",a2);
		ArrayList<String> a3=new ArrayList<String>();
		a3.add("Student5");
		a3.add("Student6");
		m1.put("Mech",a3);
		
		
		for(Map.Entry m:m1.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		
	}

	}}

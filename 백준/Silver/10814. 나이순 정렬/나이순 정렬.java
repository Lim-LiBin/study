import java.util.*;
import java.io.*;

class Member {
    int age;
    String name;
    int index;
    
    public Member (int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
    }
}

public class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    List<Member> members = new ArrayList<>();
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    for (int i = 0; i < n; i++) {
	        String[] person = br.readLine().split(" ");
	        int age = Integer.parseInt(person[0]);
	        String name = person[1];
	        
	        members.add(new Member(age, name, i));
	    }
	    
	    Collections.sort(members, (m1, m2) -> {
	        if (m1.age == m2.age) {
	            return Integer.compare(m1.index, m2.index);
	        }
	        return Integer.compare(m1.age, m2.age);
	    });
	    
	    for (Member member : members) {
	        sb.append(member.age).append(" ").append(member.name).append("\n");
	    }
	    
	    System.out.println(sb);
	}
}
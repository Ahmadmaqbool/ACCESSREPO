import java.util.HashSet;

public class RemoveDuplicateTest {
     public static void main(String[] args) {
		String s="hello";
		char[] c=s.toCharArray();
		HashSet<Character> set=new HashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
		     set.add(c[i]);
		}
		System.out.println(set);
	}
}

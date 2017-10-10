import java.util.LinkedList;
import java.util.ListIterator;
public class LinklistJW {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("Tulsa");
		a.add("Ada");
		a.add("BrokenArrow");
		a.add("Owasso");
		a.add(1,"OKC");
		
		
		ListIterator<String> ALter = a.listIterator();
		
		String theNext = ALter.next();
		String theNextnext = ALter.next();
		ALter.hasNext();
		
		LinkedList<String> b = new LinkedList<String>();
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");
		
		ListIterator<String> ALter1 = b.listIterator();
		String theNext1 = ALter1.next();
		String theNextnext1 = ALter1.next();
		while (ALter1.hasNext()) {
			
		}
		
		LinkedList<String> copyb = new LinkedList<String>();
		while(b!= null) {
			copyb.add(theNext1);
		}
		
		
				
	}

}

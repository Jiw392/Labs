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
		
	
		LinkedList<String> b = new LinkedList<String>();
		b.add("74104");
		b.add("74135");
		b.add("foo");
		b.add("hello world");
		b.add("777");
		
		ListIterator<String> ALter1 = b.listIterator();
		String head = b.peek();
		a.add(head);

		while (ALter1.hasNext()) {
			String tmp = ALter1.next();
			a.add(tmp);
					
			
		}
		ListIterator<String> ALter = a.listIterator();
		int aaaaaa = 0;
		while (ALter.hasNext()) {
			if(aaaaaa==1) {
				ALter.remove();
				aaaaaa = 0;
				continue;
				
			}
			ALter.next();
			aaaaaa++;
		}
		
		LinkedList<String> copyb = new LinkedList<String>();
		ListIterator<String> ALter2 = copyb.listIterator();
		String head2 =b.peek();
		copyb.add(head2);
		
		while(ALter2.hasNext()) {
			String tmp2 = ALter2.next();
			copyb.add(tmp2);
			
		}
		
		
				
	}

}

package RecusionPlus;
public class RecursionPlus {
	public void recurse(int count){
		if (count <= 0)
			System.out.println("Finish~");
		else {
			System.out.println(count+" ^_^");
			recurse(count-1);
		}
	}
	public static void main(String[] args) {
		RecursionPlus r = new RecursionPlus(); 
		r.recurse(5);
	}
}
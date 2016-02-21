package test;

public class Some {
	int y =7;
	public void step( int y){
		
	}
	
	public static void main(String[] args) {
		int score = 20;
		Some s = new Some();
		s.add(score);
		System.out.println("main "+score);
	}
	
	public void add( int score){
		System.out.println(" add "+(++score));
	}
}

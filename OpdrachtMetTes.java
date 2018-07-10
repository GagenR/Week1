package Week2;

public class OpdrachtMetTes {

	public static void main(String[] args) {
		Voetbal psv = new Voetbal();
		Vechtsport judo = new Vechtsport();
		Vechtsport karate = new Vechtsport();
		judo.bewegen();
		System.out.println("Judo is een team sport: " + judo.teamsport);
		psv.supporten();
		psv.teamsport = true;
		System.out.println("Het team van PSV bestaat uit "+ psv.spelers + " spelers");
		System.out.println("Voetbal is een teamsport: " + psv.teamsport);
		Atleet bruce = new Atleet();
		bruce.sporten(judo);
		bruce.sporten(karate);
		bruce.sporten(bruce);
		bruce.supporten();
		System.out.println(bruce.teamsport);
		

	}
}

class Stadion{
	void juichen(Supporters ju) {
		ju.supporten();
		}
	
	void kopen(Supporters spt) {
		spt.supporten();
		Voetbal vtb = (Voetbal)spt;
		if(spt instanceof Voetbal) {
			System.out.println("Bal kopen");
		}
	}
}

interface Supporters{
	void supporten(); 

}

abstract class Sport{
	boolean teamsport;
	abstract void bewegen();
	
}

class Balsport extends Sport{
	int balgroote = 20;
	double prijsVanBal = 12.50;
	void bewegen() {
		System.out.println("Met deze sport bewegen wij.");
	}
}
class Vechtsport extends Sport{
	void bewegen() {
		System.out.println("Met deze sport bewegen we agressief");
	}
	public void supporten() {
		System.out.println("Bij vechtsporten juichen we meer dan balsport");
	}
}

class Voetbal extends Balsport implements Supporters{
	int spelers = 11;
	public void supporten() {
		System.out.println("We juichen altijd bij een wedstrijd");
		
	}

class Basketbal extends Balsport{
	
}

class Volleyval extends Balsport{
	
}
	
	void voetballen(){
		System.out.println("We hebben gescoord!");
	}
}
class Atleet extends Vechtsport{
	void sporten (Vechtsport karate) {
		karate.bewegen();
		
	}
	
}


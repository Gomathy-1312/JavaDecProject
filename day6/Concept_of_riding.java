package day6;

public class Concept_of_riding extends Overridingex {

	void gomathy() {

		System.out.println("Red colour bag");
		super.gomathy();

	}

	void brinda() {

		System.out.println("White colour bottle");
		super.brinda();
	}

	void rachana() {

		System.out.println("Pink colour dress");
		super.rachana();
	}

	public static void main(String[] args) {

		Concept_of_riding cc = new Concept_of_riding();
		cc.gomathy();
		cc.rachana();
		cc.brinda();

	}

}

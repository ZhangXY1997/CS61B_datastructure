public class Dog {
	public int weightInPounds;

	public Dog(int w) {
		weightInPounds = w;
	}

	public void makeNoise() {
		if (weightInPounds <10){
			System.out.println("yipypyip!");
		} else if (weightInPounds <30){
			System.out.println("Bark! Bark!");
		} else {
			System.out.println("woof!");
		}
		
	}

	public static Dog maxDog(Dog d1, Dog d2) {
		if (weightInPounds > d2.weightInPounds) {
			return this;
		}
		return d2;

	}
}
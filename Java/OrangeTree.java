class OrangeTree{
	int age;
	double height;
	boolean oranges;

	public OrangeTree() {
		age = 0;
		height = 0.0;
		oranges = false;
	}

	public int checkAge(){
		System.out.println("The tree is " + age + " years old.");
		return age;
	}

	public double checkHeight(){
		System.out.println("The tree is " + height + " feet tall.");
		return height;
	}

	public boolean hasOranges(){
		if (oranges == true){
			System.out.println("This tree has oranges");
			return oranges;
		}
		else{
			System.out.println("This tree does not have oranges");
			return oranges;
		}
	}

	public boolean isMature(){
		if (age >= 6){
			System.out.println("This tree is mature");
			return true;
		}
		else {
			System.out.println("This tree is not yet mature");
			return false;
		}
	}

	public boolean isDead(){
		if (age > 100){
			System.out.println("This tree is dead");
			return true;
		}
		else {
			System.out.println("This tree is still alive");
			return false;
		}
	}

	public void passGrowingSeason(){
		age = age + 1;
		if (isDead() == false){
			if (height <= 22.5){
				height = height + 2.5;
			}
			else if (height > 22.5 && height < 25.0 ){
				height = 25.0;
			}
		}

		if (isMature() == true && isDead() == false){
			oranges = true;
		}
	}  

	public static void main (String[] args){

	}
}
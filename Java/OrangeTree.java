class OrangeTree{
	int age;
	int height;
	boolean oranges;

	public OrangeTree() {
		age = 0;
		height = 0;
		oranges = false;
	}

	public int checkAge(){
		System.out.println("The tree is " + age + " years old.");
		return age;
	}

	public int checkHeight(){
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
	public static void main (String[] args){

	}
}
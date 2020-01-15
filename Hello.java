class Hello
{
	public static void main(String [] args)
	{
		int age = 13; 
		double weight = 123.345678;

		System.out.printf("Hello, World!%n");
		System.out.printf("I am %d years old!%n", age);
		System.out.printf("I weigh %.2f %n%n", weight);

		System.out.println("Hello, World!");
		System.out.println("I am " + age + " years old!");
		System.out.println("I weigh " + weight);

		int x = 12;
		int y = 10;
		double u = 10.0;

		System.out.println(x / 0.001);
		System.out.println(y / u);
		System.out.println(12.0 % 10.5);
	}
}
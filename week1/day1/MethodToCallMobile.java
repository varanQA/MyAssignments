package week1.day1;

public class MethodToCallMobile {
	public static void main(String[] args) {

		int x = 15;
		int y = 6;


		Mobile mob = new Mobile();

		System.out.println(mob.brand());
		System.out.println(mob.model( x, y));
		System.out.println(mob.price());
		System.out.println(mob.original());


	}

}

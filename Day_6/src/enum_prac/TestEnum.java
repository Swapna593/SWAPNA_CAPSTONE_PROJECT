package enum_prac;
enum Day{Monday,Saturday}

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today=Day.Saturday;
		System.out.println("Today is : "+today);
		Day day_after_tmrw=Day.Monday;
		System.out.println("Day after tmrw is :"+day_after_tmrw);

	}

}

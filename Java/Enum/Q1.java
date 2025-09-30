public class Q1{

	public enum DaysOfWeek{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
	}

	public static void main(String[] argss){
		String s = "Wow";
		String s2 = s+"Opps";

		System.out.println(s2);
		
		DaysOfWeek today = DaysOfWeek.MONDAY;
		DaysOfWeek[] weekend = {DaysOfWeek.SATURDAY,DaysOfWeek.SUNDAY};
			
		System.out.println(today);
		for(DaysOfWeek day: weekend) {
			System.out.println(day);
		}
	}
}
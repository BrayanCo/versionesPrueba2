public class holaComoEstas {

 	public static final double PI = 3.14159;


 	private int a=300;

	public int buenas (){

		return a;
	}

	public double areaCirculo(int radio){
		return PI * Math.pow(radio, 2);
	}

	public int determineAge ( int bornDay, int bornMonth, int bornYear) {
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int currentMonth = currentDate.getMonthValue();
		int currentDay = currentDate.getDayOfMonth();
		int age = currentYear - bornYear;
		if( bornMonth > currentMonth) {
			--age;
		}else if( bornMonth == currentMonth && bornDay > currentDay ) {
			--age;
		}
		return age;
		}

 public static void main(String[] args) {
	System.out.println(new holaComoEstas().areaCirculo(10));
	System.out.println("ESTE SI POR FAVOR :'V");
	System.out.println(buenas);
	System.out.println(new holaComoEstas.determineAge(12,8,2001));
}

}

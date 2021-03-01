public class holaComoEstas {

 	public static final double PI = 3.14159;


 	private int a=300;

	public int buenas (){

		return a;
	}

	public double areaCirculo(int radio){
		return PI * Math.pow(radio, 2);
	}

 public static void main(String[] args) {
	System.out.println(new holaComoEstas().areaCirculo(10));
	System.out.println("ESTE SI POR FAVOR :'V");
	System.out.println(buenas);
	System.out.println();
}

}

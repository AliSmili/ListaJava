
public class Potencia {

	public static void main(String[] args) {
		System.out.println(potencia(5,3));

	}
	
	public static long potencia(int n, int m){		//n es la base, m el exponente
		if(m<=0){
			return 1;
		}else{
			return n*potencia(n,m-1);
		}
	}

}

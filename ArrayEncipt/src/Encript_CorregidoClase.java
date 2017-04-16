
public class Encript_CorregidoClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char texto[]={'H','o','l','a'};
				for (int i=0;i<texto.length;i++) {
					if(texto[i]=='z'){								//La excepción esta en la 'z' y 'Z'
						texto[i]='a';
					}
					else{
						if(texto[i]=='Z'){
						texto[i]='A';
						}
						else{
							int numCaracter=(int)texto[i];		//(int)'A'==65        ASCI
							numCaracter++;
							texto[i]=(char)numCaracter;
						}
				}
				}	
				for (char c : texto) {
					System.out.println(c+" ");
				}
		}

	}



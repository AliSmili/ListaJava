
public class EncriptConSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub					// no corregido.....lo va a subir el profe se supone
		byte aux=0;
		char texto[]={'H','o','l','a'};
		for (int i=0;i<texto.length;i++) {
			if(texto[i]=='z'){								//La excepción esta en la 'z' y 'Z'
				aux=1;
			}else{
			if(texto[i]=='Z'){
					
			aux=2;
			}
			else{
					aux=3;
				}
			}
			switch(aux){
			
			case 1:
				texto[i]='a';break;
			case 2:
				texto[i]='A';break;
			case 3:
				int numCaracter=(int)texto[i];		//(int)'A'==65        ASCSI
				numCaracter++;
				texto[i]=(char)numCaracter;
		}
		}	
		for (char c : texto) {
			System.out.println(c+" ");
		}

	}

}


public class contadorXXXX {

	public static void main(String[] args) {
		// i =3?"E"....en vez de 3 te pone E
		// p1-p2-p3-p4-p5         Mostrar esto en pantalla y hacer q en vez de un 3 salga un "E"

       
    for(int p1=0;p1<9;p1++) 
     { 
       for(int p2=0;p2<9;p2++){
    	   
    	   for(int p3=0;p3<9;p3++){
    		   for(int p4=0; p4<9;p4++){		   
    			   for(int p5=0;p5<9;p5++){
    				   System.out.println((p1==3?"E":p1)+"-"+(p2==3?"E":p2)+"-"+(p3==3?"E":p3)+"-"+(p4==3?"E":p4)+"-"+(p5==3?"E":p5));
    				   
    			   }
    		   }
    	   }
       }
        
          }
		}
		

	}


/*for (int i = 0; i <= 9; i++)
{
    for (int j = 0; j <= 9; j++)
     {
       for (int k = 0; k <= 9; k++)
        {
        for (int l = 0; l <= 9; l++)
        {
         string yournumber = i.ToString() + j.ToString() + k.ToString() + l.ToString();
          ListBox1.Items.Add(yournumber);

        }
     }
 }
}*/
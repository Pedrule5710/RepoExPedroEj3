import java.util.ArrayList;

public class PrinciplaApp {
	public static void main(String args[]) {
		ArrayList<Integer> edades = new ArrayList<Integer>();
		edades.add(15);
		edades.add(44);
		edades.add(58);
		edades.add(68);
		edades.add(32);
		edades.add(74);
		edades.add(14);
		edades.add(147);
		edades.add(78);
		
		AnlisisEdad prueba = new AnlisisEdad(edades);
		prueba.comprobar(edades);
		//System.out.println("esto es contenido añadido a las clases");

	}

}

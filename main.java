import java.util.*;
import java.io.*;
import java.lang.*;

public class main {
	binarytree diccionario = new binarytree();
	Association<String, String> aso;
	int i =0;
	
	String FILENAME = "diccionario.txt";
	
	BufferedReader buff = null;
	FileReader file = null;
	String stringOutput ="";

	try {

		file = new FileReader(FILENAME);
		buff = new BufferedReader(fr);
		
	
		while ((stringOutput = buff.readLine()) != null) {
	
            
            int startParenIndex = 1 + stringOutput.indexOf("(");
            int endParenIndex = stringOutput.indexOf(")");
        	int commaIndex = stringOutput.indexOf(",");
        	
        	String key = stringOutput.substring(startParenIndex, commaIndex);
        	String valor = stringOutput.substring(2+commaIndex, endParenIndex);
        	
        	aso = new Association<>(key.toLowerCase(), valor.toLowerCase());
        	
        	if (i == 0) { // la primera vez se crea el ROOT, luego ya son solo los hijos
        		diccionario.setDato(aso);
        		i++;
        		
        	} else {
        		diccionario.insert(aso);
        	}
		}
	

	} catch (IOException p) {

		p.printStackTrace();

	} finally {

		try {

			if (buff != null)
				buff.close();

			if (file != null)
				file.close();

		} catch (IOException x) {

			x.printStackTrace();

		}
	}
	


	FILENAME = "texto.txt";
	buff = null;
	file = null;
	stringOutput ="";
	String traduction = "";

	try {

		file = new FileReader(FILENAME);
		buff = new BufferedReader(fr);

	
		while ((stringOutput = buff.readLine()) != null) {
            
            stringOutput = stringOutput.replace(".","");
            
            String[] palabras = stringOutput.split(" ",0);
            
            for (String palabra : palabras) {
            	
            	if (diccionario.contains(palabra.toLowerCase())) {
            		
            		traduction += " " + diccionario.get(palabra.toLowerCase());
            		
            	} else {
            		
            		traduction += " *" + palabra + "*";
            	}
            }
            
            traduction += ".\n";
			
		}
	

	} catch (IOException e) {

		e.printStackTrace();

	} finally {

		try {

			if (buff != null)
				buff.close();

			if (file != null)
				file.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}
	}
	

	Scanner scan = new Scanner(System.in);
	
	int op = 0;
    String menu = "\n MENU: \n 1. Imprimir el diccionario en in-order \n 2. Traducir a espanol: " + FILENAME + " \n 3. Salir";
    
    while (op != 3) {
        
        System.out.println(menu);
        
        System.out.println("\n>>> Ingrese el numero de opcion que desea realizar: ");
        
        try {
            op = scan.nextInt();
            scan.nextLine();
            
        } catch (InputMismatchException e) {
            
            scan.nextLine();
            System.out.println("<!> No ingreso un numero...");
        }

        
        if (op == 1) {
        	
        	System.out.println("\n>>> Imprimiendo diccionario en forma In Order...");
        	diccionario.imprimir();
        	
        } else {
        	
        	System.out.println("\n>>> Traduccion: ");
			System.out.println(traduction);
        	
        }
    }
	
	System.out.println("\n Saliendo...\n");
}

}

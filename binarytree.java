
public class binarytree {
	
    Association <string, string>dato;
    binarytree izq;
    binarytree der;

 
    public binarytree() {
        dato = null; 
        izq = null;
        der = null;
    }
    
    public binarytree(Association<string,string>data) {
    	this.dato = dato;
    	izq = null; 
    	der = null;
    			
    }
    
    public void setdato (Association<string,string>data) {
    	this.dato = dato;
    }
    
    public Association<string,string> getValor(){
    	return dato;
    }
    
    
    public void insertar (Association<string,string>valor) {
    	int x = stringCompare(valor.getKey(), data.getKey());
    	if (x <= 0 ) {
    		if (izq == null) {
    			izq = new binarytree(valor);
    			
    		}else {
    			izq.insertar(valor);
    		}
    	}else {
    		if(der == null ) {
    			der = new binarytree(valor);
    		}else {
    			der.insertar(valor);
    		}
    	}
    }
    
    public booleam contiene(string valor) {
    	int y = stringCompare(valor, dato.getKey());
    	
    	if (y==0) {
    		return true;
    		
    	}else if (res < 0) {
    		if(izq == null) {
    			return false;
    			
    		}else {
    			return izq.contiene(valor);
    		}
    	}else {
    		if (der==null) {
    			return false;
    		}else {
    			return der.contiene(valor);
    		}
    	}
    }
    
    public string obt(string Key) {
    	int z = stringCompare(key,data.getKey());
    	if (z == 0) {
    		return dato.getValor();
    	}else {
    		if (z <0) {
    			return izq.obt(key);
    		}else {
    			return der.obt(key);
    		}
    	}
    }
    
    public void imprimir() {
    	if (izq != null) {
    		izq.imprimir();
    	}
    	System.out.println(this.dato.toString);
    	
    	if(der != null) {
    		der.imp
    	}
    }
    



}

package TresEnRaya.TresEnRaya;

public class Tablero {

	private String[][] casillas;
	
	public Tablero() {
		casillas = new String[3][3];
		reiniciarTablero();
	}
	
	
	public String[][] getCasillas() {
		return casillas;
	}
	

	public void insertarMovimiento(int x, int y, String ficha) {
			casillas[x][y] = ficha;
	}
	
	public boolean comprobarCasilla(int x, int y) {
		
		if(casillas[x][y].equals("")){
			return true;
		}else {
			return false;
		}
	}
	
	public void vaciarCasilla(int x, int y) {
		casillas[x][y] = "";
	}
	
	public boolean comprobarTablero() {
		String row = "";
		int i = 0;
		boolean found = false;
		
		while(i<8 && !found) {
			
			switch(i) {
				case 0:
					row = casillas[0][0]+casillas[0][1]+casillas[0][2];
					break;
				case 1:
					row = casillas[1][0]+casillas[1][1]+casillas[1][2];
					break;
				case 2:
					row = casillas[2][0]+casillas[2][1]+casillas[2][2];
					break;
				case 3:
					row = casillas[0][0]+casillas[1][0]+casillas[2][0];
					break;
				case 4:
					row = casillas[0][1]+casillas[1][1]+casillas[2][1];
					break;
				case 5:
					row = casillas[0][2]+casillas[1][2]+casillas[2][2];
					break;
				case 6:
					row = casillas[0][0]+casillas[1][1]+casillas[2][2];
					break;
				case 7:
					row = casillas[0][2]+casillas[1][1]+casillas[2][0];
					break;
			}
			System.out.println(row);
			if(row.equals("XXX")||row.equals("OOO")) {
				found = true;
			}
			i++;
		}
		return found;
	}
	
	public boolean tableroCompleto() {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (casillas[i][j].isEmpty()) {
	                return false; // Si una casilla está vacía, el tablero no está completo
	            }
	        }
	    }
	    return true; // Todas las casillas están ocupadas, el tablero está completo
	}

	public void reiniciarTablero() {
		
		for(int i=0;i<3.;i++) {
			for(int j=0;j<3.;j++) {
				casillas[i][j] = "";
			}
		}
	}
}

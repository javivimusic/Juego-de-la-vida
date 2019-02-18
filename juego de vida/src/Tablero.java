import java.util.ArrayList;

public class Tablero {
	private int x;
	private int y;
	
	public Tablero(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	/**
	 * 
	 * @param lista
	 * dibujamos el tablero y el estado de cada celula
	 */
	public void dibujarTablero(ArrayList<Celulas> lista) {
		for(Celulas posicion : lista){
			System.out.print(posicion.viva());
			System.out.print("|");
			System.out.print("_");
			if(posicion.getPosY()==9) {
				System.out.print("\n");
			}
		}
	}
	
	/**
	 * 
	 * @param lista
	 * @return
	 * 
	 * evaluamos el contador de vecinos de cada celula 
	 * y cambiamos el estado en el caso de que sea necesario
	 */
	public ArrayList<Celulas> jugada(ArrayList<Celulas> todas) {
		int cont=0;
		ArrayList<Celulas> lista=Celulas.contador(todas);
		for(Celulas posicion : lista){
			cont=posicion.getCont();
			switch(cont) {
			case 0:
			case 1:
				posicion.setEstado(0);
				break;
			case 2:
				break;
			case 3:
				posicion.setEstado(1);
				break;
			default:
				posicion.setEstado(0);
			}
		}
		return lista;
	}
	
	
	
}

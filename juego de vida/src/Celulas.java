import java.util.ArrayList;

public class Celulas {
	private int estado;
	private int posX;
	private int posY;
	private int cont=0;
	
	//constructor
	public Celulas(int estado, int x, int y) {
		this.estado=estado;
		this.posX=x;
		this.posY=y;
	}
	
	//getter y setter
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * 
	 * @return
	 * según el estado de la celula se mostrar viva(*) o muerta(' ')
	 */
	public String viva() {
		String modo;
		if (this.estado == 0) {
			modo=" ";
		}else {
			modo="O";
		}
		return modo;
	}
	
	
	
	/**
	 * 
	 * @param lista
	 * @return
	 * Evaluamos las posiciones de alrededor de cada celula
	 * y añadimos uno al contador en caso de encuente a un vecino
	 * 
	 */
	public static ArrayList<Celulas> contador(ArrayList<Celulas> lista) {
		
		for(Celulas celula1 : lista){
			int cont=0;
			for(Celulas resto : lista){
				if(resto.getPosX()==(celula1.getPosX()-1) && resto.getPosY()==(celula1.getPosY()-1)) {
					if(resto.getEstado()==1)
						cont++;
				}
				if(resto.getPosX()==celula1.getPosX()-1 && resto.getPosY()==celula1.getPosY()) {
					if(resto.getEstado()==1)
						cont++;
				}
				if(resto.getPosX()==celula1.getPosX()-1 && resto.getPosY()==celula1.getPosY()+1) {
					if(resto.getEstado()==1)
						cont++;
				}
				if(resto.getPosX()==celula1.getPosX() && resto.getPosY()==celula1.getPosY()-1) {
					if(resto.getEstado()==1)
						cont++;
				}
				if(resto.getPosX()==celula1.getPosX() && resto.getPosY()==celula1.getPosY()+1) {
					if(resto.getEstado()==1)
						cont++;
				}
				if(resto.getPosX()==celula1.getPosX()+1 && resto.getPosY()==celula1.getPosY()-1) {
					if(resto.getEstado()==1)
						cont++;
				}
				if(resto.getPosX()==celula1.getPosX()+1 && resto.getPosY()==celula1.getPosY()) {
					if(resto.getEstado()==1)
						cont++;
				}
				if(resto.getPosX()==celula1.getPosX()+1 && resto.getPosY()==celula1.getPosY()+1) {
					if(resto.getEstado()==1)
						cont++;
				}
				celula1.setCont(cont);
			}
		}
		return lista;
	}
	
	
}

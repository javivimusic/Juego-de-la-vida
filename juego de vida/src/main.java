import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Tablero t= new Tablero(10,10);
		
		ArrayList<Celulas> lista=new ArrayList<Celulas>();
		int x=0;
		while(x <t.getX()) {
			for(int j=0;j<t.getX();j++) {
				for(int y=0;y<t.getY();y++) {
					int numero = (int) (Math.random() *2);
					Celulas cel=new Celulas(numero,j,y);
					lista.add(cel);
				}
				x++;
			}
		}
		
		int num=0;
		while(num<20) {
			System.out.println("Jugada nº "+num);
			t.dibujarTablero(lista);
			t.jugada(lista);
			num++;
		}
	}
}

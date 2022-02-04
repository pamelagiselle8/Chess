
package ajedrez;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ajedrez {
    Scanner lea = new Scanner (System.in);
    char bn;
    boolean arriba = false, derecha = false, valid = false, esRey = false;
    int opL, opA, opT, opD, opR, tam = 8, filaInicial, columnaInicial, limFila, limColumna;
    int[] límites = new int[2];
    char pieza = ' ', inicio = '-';
    char[][] tablero = new char[tam][tam];
    ImageIcon cinnamon = new ImageIcon("cinnamon.png");
    
    
    // Método para asignar pieza y colocarla en la primera casilla del tablero.
    public void método1(char pieza){
        this.pieza = pieza;
        crearTablero();
        tablero[0][0] = this.pieza;
        mostrarTablero();
    }
    
    // Método validado para pedir casillas
    public boolean pedirCasillas(){
        boolean valid = true;
        char k = ' ';
        int num = 0, cont = 0;
        this.valid = false;
        while(this.valid == false){
            String size = JOptionPane.showInputDialog(null, "Ingrese el número de casillas a mover:", "Ingresar casillas", 3);
            if (size != null) {
                try{
                    num = Integer.parseInt(size);
                    setLimFila(num);
                    this.valid = true;
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "¡Ups! Debe ingresar el número de casillas a mover.", "Entrada inválida", JOptionPane.INFORMATION_MESSAGE, this.cinnamon);
                } 
            }
            else{
                this.valid = true;
                valid = false;
            }
        }
        return valid;
    }
    
    // Método para buscar la pieza, moverla y mostrar el movimiento en el tablero
    public void mover(int x, int y){
        buscarPieza(this.pieza);
        //crearTablero();
        String mensaje = moverPieza(x, y);
        JOptionPane.showMessageDialog(null, mostrarTablero(), mensaje, 1);
    }
    
    // Setter de pieza
    public void setPieza(char pieza) {
        this.pieza = pieza;
    }
    
    // Setter de pieza
    public void setLimFila(int limFila) {
        this.limFila = limFila;
    }
    
    // Crear/reiniciar tablero luego de un movimiento
    public char[][] crearTablero(){
        char[][] tablero = new char[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }
    
    // Método para buscar la pieza dentro del tablero
    public char buscarPieza(char pieza){
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (tablero[i][j] == pieza){
                    filaInicial = i;
                    columnaInicial = j;
                }
            }
        }
        return pieza;
    }
    
    // Método para mover la pieza
    public String moverPieza(int limFila, int limColumna){
        String mensaje = "Pieza movida";
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((filaInicial + limFila < tam) && (columnaInicial + limColumna < tam) && (filaInicial + limFila >= 0) && (columnaInicial + limColumna >= 0)) {
                    if ((i == filaInicial + limFila) && (j == columnaInicial + limColumna)){
                        tablero[i][j] = this.pieza;
                    }
                    else{
                        tablero[i][j] = ' ';
                    }
                    tablero[filaInicial][columnaInicial] = inicio;
                }
                else{
                    mensaje = "No es posible mover la pieza";
                    tablero[filaInicial][columnaInicial] = pieza;
                }
            }
        }
        return mensaje;
    }
    
    // Mostrar tablero
    public String mostrarTablero(){
        String acum = "\n";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                acum += "[" + tablero[i][j] + "]" + "\t" + "\t";
            }
            acum += "\n";
        }
        return acum;
    }
    
    // Métodos que usa Ventana para mostrar el frame de cada pieza
    
    public void mostrarFrameCaballo(){
        Caballo frameCaballo = new Caballo();
        frameCaballo.setVisible(true);
    }
    
    public void mostrarFrameAlfil(){
        Alfil frameAlfil = new Alfil();
        frameAlfil.setVisible(true);
    }
    
    public void mostrarFrameTorre(){
        Torre frameTorre = new Torre();
        frameTorre.setVisible(true);
    }
    
    public void mostrarFrameDama(){
        Dama frameDama = new Dama();
        frameDama.setVisible(true);
    }
    
    public void mostrarFrameRey(){
        Rey frameRey = new Rey();
        frameRey.setVisible(true);
    }
    
    
    // Métodos para el movimiento de cada pieza
    
    public int[] opcionRecta(int opT){
        int[] lim = new int[2];
        switch(opT){
            case 1: {
                limFila = -limFila;
                limColumna = 0;
                break;
            }
            case 2: {
                limColumna = 0;
                break;
            }
            case 3: {
                limColumna = limFila;
                limFila = 0;
                break;
            }
            case 4: {
                limColumna = -limFila;
                limFila = 0;
                break;
            }
        }
        lim[0] = limFila;
        lim[1] = limColumna;
        return lim;
    }
    
    public int[] opcionDiagonal(int opA){
        int[] lim = new int[2];
        limColumna = limFila;
        switch(opA){
            case 1: {
                limFila = -limFila;
                break;
            }
            case 2: {
                limFila = -limFila;
                limColumna = -limColumna;
                break;
            }
            case 3: {
                limColumna = limFila;
                break;
            }
            case 4: {
                limColumna = -limColumna;
                break;
            }
        }
        lim[0] = limFila;
        lim[1] = limColumna;
        return lim;
    }
    
    public int[] opcionL(int opL){
        int[] lim = new int[2];
        switch(opL){
            case 1: {
                limFila = 1;
                limColumna = 2;
                break;
            }
            case 2: {
                limFila = 1;
                limColumna = -2;
                break;
            }
            case 3: {
                limFila = 2;
                limColumna = 1;
                break;
            }
            case 4: {
                limFila = 2;
                limColumna = -1;
                break;
            }
            case 5: {
                limFila = -1;
                limColumna = 2;
                break;
            }
            case 6: {
                limFila = -1;
                limColumna = -2;
                break;
            }
            case 7: {
                limFila = -2;
                limColumna = 1;
                break;
            }
            case 8: {
                limFila = -2;
                limColumna = -1;
                break;
            }
        }
        lim[0] = limFila;
        lim[1] = limColumna;
        return lim;
    }

    public boolean getEsRey() {
        return esRey;
    }

    public void setEsRey(boolean esRey) {
        this.esRey = esRey;
    }
}

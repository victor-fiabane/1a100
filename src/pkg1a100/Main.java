
package pkg1a100;

/**
 *
 * @author Victor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        cont = 1;
        while(cont<=100){
            if(cont % 2 == 0){
                System.out.println(""+cont);
            }
            cont++;
        }
    }
    
}

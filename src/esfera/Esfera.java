
package esfera;

import javax.swing.JOptionPane;
//Clase
public class Esfera {
    //Atributos
        double pi = 3.1416;
        double radio;
        double diametro;
        double area;
        double volumen;
        double circunferencia;

    //Métodos
    public void ingresoDato(){
        radio = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el radio: "));
    }
    
    public void operaciones(){
        diametro =radio * 2;
        area = 4*pi*(radio*radio);
        volumen = (4)*(pi)*(radio*radio*radio)/3;
        circunferencia = pi*diametro;      
    }
    public void mostrarResultados(){
        System.out.println("El diametro de la esfera es: "+ diametro);
        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es :" + volumen);
        System.out.println("La circunferencia de la esfera es: " + circunferencia);                  
    }
    
    public static void main(String[] args) {
        Esfera Usuario = new Esfera();
        
        Usuario.ingresoDato();
        Usuario.operaciones();
        Usuario.mostrarResultados();  
    }
    
}

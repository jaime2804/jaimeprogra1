
import javax.swing.JOptionPane;


public class Profesores {

    public String titulos_licenciaturas;
    public int edad;
    public String correo_electronico;
    public int numero_telefonico;
    public String nombre;

    public static void Agregar_clases() {

    }

    public static void Registrar_departamento() {

    }

    public  void Agregar_Profesor() {
        nombre= JOptionPane.showInputDialog("Digite el nombre del profesor: ");
        titulos_licenciaturas= JOptionPane.showInputDialog("Digite los titulos o licenciaturas: ");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad: "));
        correo_electronico= JOptionPane.showInputDialog("Digite el correo electronico: ");
        numero_telefonico= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico: "));
        
    }

    public  void Mostrar_Profesor() {
        JOptionPane.showMessageDialog(null,"El nombre del profesor es: "+nombre);
        JOptionPane.showMessageDialog(null,"TItulos o licenciaturas"+titulos_licenciaturas );
        JOptionPane.showMessageDialog(null,"La edad del profsor es: "+ edad);
        JOptionPane.showMessageDialog(null,"El correo electronico del profesor es: "+correo_electronico );
        JOptionPane.showMessageDialog(null,"El numero telefonico del profesor es: "+numero_telefonico );
    }
}


import javax.swing.JOptionPane;


public class Contacto {

    public int numero_telefonico;
    public String correo_electronico;
    public String direccion;
    public int fax;
    public String redes_sociales;

    public static void Agregar_Consulta() {

    }

    public static void Agregar_Redes_sociales() {

    }

    public  void Agregar_contacto() {
        numero_telefonico=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico: "));
        correo_electronico= JOptionPane.showInputDialog("Digite el correo electronico: ");
        direccion= JOptionPane.showInputDialog("Digite la direccion: ");
        fax=Integer.parseInt(JOptionPane.showInputDialog("Digite el fax: "));
        redes_sociales= JOptionPane.showInputDialog("Digite las redes sociales: ");
    }

    public  void Mostrar_contacto() {
        JOptionPane.showMessageDialog(null, "El numero telefoncio es: " + numero_telefonico);
        JOptionPane.showMessageDialog(null,"El correo electronico es: "+correo_electronico);
        JOptionPane.showMessageDialog(null,"La direccion es: "+direccion);
        JOptionPane.showMessageDialog(null,"El fax es: "+fax);
        JOptionPane.showMessageDialog(null,"Las redes sociales son: "+redes_sociales);
    }
}

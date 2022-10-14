
import javax.swing.JOptionPane;


public class Becas {

    public int numero_departamento;
    public int numero_telefonico;
    public String nombre_del_participante;

    public static void Seleccionar_estudiante() {

    }

    public static void Salario_de_los_padres() {

    }

    public  void Agregar_becas() {
        numero_departamento= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de departamento: "));
        numero_telefonico=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico: "));
        nombre_del_participante=JOptionPane.showInputDialog("Digite el nombre del participante: ");
    }

    public  void Mostrar_proceso_becas() {
        JOptionPane.showMessageDialog(null, "El numero de departamneto es: " + numero_departamento);
        JOptionPane.showMessageDialog(null,"El numero telefoncio es: "+numero_telefonico);
        JOptionPane.showMessageDialog(null,"El nombre del participante es: "+nombre_del_participante);
    }
}

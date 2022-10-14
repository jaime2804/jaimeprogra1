
import javax.swing.JOptionPane;

public class Adecuaciones {

    public String nombre;
    public int numero_telefonico;
    public String nombre_del_participante;
    public int cedula;
    public String enfermedades_o_alergias;

    public static void Agregar_enfermedad_o_alergia() {

    }

    public static void ver_medicamentos_escolares() {

    }

    public void Agregar_adecuacion_a_estudiante() {
        nombre = JOptionPane.showInputDialog("Digite el nombre: ");
        numero_telefonico = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero telefonico: "));
        nombre_del_participante = JOptionPane.showInputDialog("Digite el nombre del participante: ");
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de cedula: "));
        enfermedades_o_alergias = JOptionPane.showInputDialog("Digite emfermedades o alergias: ");
    }

    public void Mostrar_adecuaciones() {
        JOptionPane.showMessageDialog(null, "El nommbre es: " + nombre);
        JOptionPane.showMessageDialog(null, "El numero telefonico es: " + numero_telefonico);
        JOptionPane.showMessageDialog(null, "El nombre del participante es: " + nombre_del_participante);
        JOptionPane.showMessageDialog(null, "El numero de cedula es: " + cedula);
        JOptionPane.showMessageDialog(null, "El nombre de enfermedades o alergias es: " + enfermedades_o_alergias);
    }
}

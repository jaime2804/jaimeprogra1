import javax.swing.JOptionPane;
public class Matricula_Aquí {

    public String nombre_de_los_estudiantes;
    public int numero_telefonico;
    public String correo_electronico;
    public int edad;
    public String grado_a_cursar;

    public static void Agregar_estudiantes() {

    }

    public static void Agregar_Metodo_de_pago() {

    }

    public  void Mostrar_Matricula() {
    JOptionPane.showMessageDialog(null,"El nombre de los estudiantes a matricular son: "+nombre_de_los_estudiantes);
    JOptionPane.showMessageDialog(null,"El numero telefonico es:"+numero_telefonico);
    JOptionPane.showMessageDialog(null,"El correo electronico es: "+correo_electronico);
    JOptionPane.showMessageDialog(null,"La edad es: "+edad);
    JOptionPane.showMessageDialog(null,"El grado a cursar es: "+grado_a_cursar);
    }

    public  void Agregar_matricula() {
        nombre_de_los_estudiantes= JOptionPane.showInputDialog("Digite el nombre de los estudiantes: ");
        numero_telefonico= Integer.parseInt(JOptionPane.showInputDialog("Digite su numero telefonico : "));
        correo_electronico=  JOptionPane.showInputDialog("Digite su correo electronico: ");
        edad=  Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
        grado_a_cursar = JOptionPane.showInputDialog("Digite el grado a cursar: ");
                
    }
}

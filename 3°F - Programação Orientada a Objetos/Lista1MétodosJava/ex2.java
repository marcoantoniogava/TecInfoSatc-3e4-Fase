import javax.swing.JOptionPane;
public class ex2 {

    public static void main(String[] args) {
        verificarAtleta();
        System.exit(0);
    }

    public static void verificarAtleta() {
        String nome;
        int idade;
        nome  = JOptionPane.showInputDialog("Nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        if ((idade >= 0) && (idade <= 10))
        {
            JOptionPane.showMessageDialog(null, "Nome :"+nome+" Categoria infantil");   }
        if ((idade >= 11) && (idade <= 17))
        {
            JOptionPane.showMessageDialog(null, "Nome :"+nome+" Categoria Juvenil");   }
        if (idade >= 18)
        {
            JOptionPane.showMessageDialog(null, "Nome :"+nome+" Categoria Juvenil");   }
    }
}
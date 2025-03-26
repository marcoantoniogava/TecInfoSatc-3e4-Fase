import javax.swing.JOptionPane;
public class ex1 {

    public static void main(String[] args) {
        verificarIdade();
        System.exit(0);
    }

    public static void verificarIdade() {
        String nome;
        int idade;

        nome  = JOptionPane.showInputDialog("Nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));

        if (idade >= 18)
        {
            JOptionPane.showMessageDialog(null, "Nome :"+nome+" Maior de Idade");   }
        else
        {
            JOptionPane.showMessageDialog(null, "Nome :"+nome+" Menor de Idade");   }
    }

}

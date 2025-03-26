import javax.swing.JOptionPane;

public class ex3 {

    public static void main(String[] args) {
        verificarIMC();
        System.exit(0);
    }

    public static void verificarIMC() {
        String nome;
        double peso, altura;

        nome    = JOptionPane.showInputDialog("Nome  : ");
        peso    = Double.parseDouble(JOptionPane.showInputDialog("Peso   :"));
        altura  = Double.parseDouble(JOptionPane.showInputDialog("Altura :"));

        double valorIMC = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Nome : " + nome + " IMC : "+valorIMC);
    }
}

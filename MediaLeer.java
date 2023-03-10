package AulaLP.br.com.newton;

import javax.swing.JOptionPane;

public class MediaLeer {
    public static void main(String[] args) {
        float nota1, nota2, calculaMedia;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informa uma nota 1 :"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informa uma nota 2 :"));
        calculaMedia = ((nota1 + nota2) / 2 );
        JOptionPane.showMessageDialog(null, "A media das notas é de "+calculaMedia,
                "Calculo da media", JOptionPane.INFORMATION_MESSAGE);
    }
}

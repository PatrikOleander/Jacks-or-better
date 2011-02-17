

package spel;
import javax.swing.*;

public class Inmatning {
    public String kontoInsättning(){
        String insattning;
        insattning = JOptionPane.showInputDialog("Du har inga pengar på kontot. Hur mycket vill du sätta in?");
        return insattning;
    }
}

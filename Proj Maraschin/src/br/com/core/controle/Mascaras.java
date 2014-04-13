package br.com.core.controle;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 * @author Core Systems™
 */
public class Mascaras {
    
    public MaskFormatter mascara(String mascara) {
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter(mascara);
            mask.setPlaceholderCharacter('_');
        } catch (ParseException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Formato inválido de campo inválido.\n"
                    + "Masca inserida: "+mascara+".\n"
                    + ex.getMessage());
        }
        return mask;
    }
    
}

package br.com.core.predefinido;

import br.com.core.visao.FrmUnidadeMedida;
import br.com.core.visao.Principal;
import javax.swing.JLayeredPane;

public class Teste extends Principal{

    @Override
    public JLayeredPane getDeskPane() {
        return super.getDeskPane(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private JLayeredPane deskPane = getDeskPane();
    
    public Teste(){
        deskPane.add(new FrmUnidadeMedida());
    }
    
}

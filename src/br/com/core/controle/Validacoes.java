package br.com.core.controle;

import java.beans.PropertyVetoException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * @author Core System™
 * @version v1.0
 */
public class Validacoes {

    
    
    
    
    public boolean isValidLogin(String usuario, String senha) {
        boolean acesso = false;

        if (usuario.equals("SYSADM") && senha.equals("cores" + geraPassword())) {
            JOptionPane.showMessageDialog(null, "Administrador do Sistema logado com sucesso.");
            acesso = true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário e senha não correspondem.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return acesso;
    }

    // Posiciona iFrame no centro do JDesktopPane
    public void posicao(javax.swing.JFrame frame, javax.swing.JInternalFrame iFrame) {
        iFrame.setLocation((frame.getWidth() / 2) - (iFrame.getWidth() / 2), (frame.getHeight() / 2) - (iFrame.getHeight() / 2) - 30);
    }

    // Verifica se o arquivo de configuracao existe
    public File verificaArquivoDeConfiguracao() {
        File xml = new File("config.xml");
        if (xml.isFile() && xml.exists()) {
            return xml;
        } else {
            return null;
        }
    }

    // Seleciona iFrame ao abrir
    public void selecionaFrame(JInternalFrame iFrame) {
        try {
            iFrame.setSelected(true);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar o iFrame. \nErro:\n" + ex.getMessage());
        }
    }
    
    public String geraPassword() {
        Date data = new Date();
        SimpleDateFormat dia = new SimpleDateFormat("dd"),
                ano = new SimpleDateFormat("yy"),
                min = new SimpleDateFormat("mm"),
                hora = new SimpleDateFormat("HH");
        String pwd = dia.format(data) + min.format(data) + hora.format(data) + ano.format(data);

        return pwd;
    }
}
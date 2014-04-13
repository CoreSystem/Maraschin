package br.com.core.controle;

import java.beans.PropertyVetoException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * @author Core System™
 * @version v1.0
 */
public class Validacoes {

    private boolean opened;

    public boolean isInstanceIn(JDesktopPane deskPane, JInternalFrame iFrame) {
        /*
         * Captura todos os InternalFrames instanciados dentro do DesktopPane
         * E joga numa array de JInternalFrame's
         */
        JInternalFrame[] frames = deskPane.getAllFrames();
        setOpened(false); // Seta o retorno default para a classe
        // Verifica se existe pelo menos um iFrame (JInternalFrame) instanciado no DesktopPane
        if (frames.length < 1) {
            setOpened(false); // Se não tiver nenhum, retorna falso
        } else { // Se tiver algum iFrame instanciado no DesktopPane, executa o bloco abaixo
            // Laço para verificar os iFrames instanciados
            for (int i = 0; i < frames.length; i++) {
                /* Se o frame instanciado na posição "i" da array for igual ao iFrame passado no parametro "iFrame"
                 * A classe retorna valor verdadeiro
                 */
                if (frames[i].getClass().equals(iFrame.getClass())) {
                    setOpened(true);
                }
            }
        }
        return isOpened(); // Retorno do método
    }

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

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
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
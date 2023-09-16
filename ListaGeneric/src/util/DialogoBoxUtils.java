package util;

import javax.swing.JOptionPane;

public class DialogoBoxUtils {
    
    public static int exibirCaixaConfirmacao (String titulo, String msg) {
        JOptionPane.getRootFrame();
        return JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), msg, titulo, JOptionPane.YES_NO_OPTION);
    }
    
    public static void exibirMensagem (String titulo, String msg) {
        JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), msg, titulo,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void exibirMensagemDeErro (String titulo, String msg) {
        JOptionPane.getRootFrame();
        JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), msg, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    public static void exibirMensagemDeAlerta (String titulo, String msg) {
        JOptionPane.getRootFrame();
        JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), msg, titulo, JOptionPane.WARNING_MESSAGE);
    }
}

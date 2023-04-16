package curso_java;

import javax.swing.*;

public class lesson5 {
    public static void main(String[] args){
        int num = Integer.parseInt((JOptionPane.showInputDialog("Informe um número")));
        int ant = num - 1;
        int pos = num + 1;
        JOptionPane.showMessageDialog(null, "O número informado foi " + num + " seu antecessor é "+ant+" e seu posterior é "+pos);
    }
}

package com.company;

import javax.swing.*;

public class convetator {
    public static void main(String[] args) {
        String sBin= JOptionPane.showInputDialog("vvedi binarnje chislo");
        int n=Integer.parseInt(sBin,2);
        JOptionPane.showMessageDialog(null,
                String.format("Decinal:%d\nHex: %s",n,Integer.toHexString(n)));

    }
}

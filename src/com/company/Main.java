package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float suma=0;
        String x= JOptionPane.showInputDialog("Cate numere doriti sa introduceti: ");
        int n = Integer.parseInt(x);
        for (int i = 0; i <n ; i++) {
            String numar = JOptionPane.showInputDialog("Introduceti numarul  #"+(i+1)+" : ");
            suma += Integer.parseInt(numar);

        }
        JOptionPane.showMessageDialog(null, "Media aritmetica este:  "+ suma/n);

    }
}

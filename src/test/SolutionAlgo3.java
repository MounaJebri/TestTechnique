/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author mouna
 */
public class SolutionAlgo3 {

    public SolutionAlgo3() {
    }
    
    public int solution(int[] a) {
        if (a.length == 0) {
            return 0;}
        
        int somme = 0;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            final int val = Math.abs(a[i]);
            somme += val;
            if (maximum < val) {
                maximum = val;}
                a[i] = val;}
        final int[] Compteur = new int[maximum + 1];
        for (int value: a) {
            Compteur[value]++;
        }
        final int[] r = new int[somme + 1];
        for (int i = 1; i < r.length; i++) {
            r[i] = -1;
        }
        for (int x = 1; x < Compteur.length; x++) {
            for (int y = 0; y < r.length; y++) {
                if (r[y] >= 0) {
                    r[y] = Compteur[x];
                } else if 
                    (y - x >= 0 && r[y - x] > 0) {
                    r[y] = r[y - x] - 1;
                }
            }
        }
        int resulta = somme;
        for (int i = 0; i < r.length / 2 + 1; i++) {
            if (r[i] >= 0 && resulta > Math.abs(somme - 2 * i)) {
                resulta = Math.abs(somme - 2 * i);
            }
        }
        return resulta;
    }
    
}

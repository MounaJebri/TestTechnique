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
public class SolutionAlgo2 {

    public SolutionAlgo2() {
    }
    
    
    public int[] solution(int[] a, int[] b) {

        int[] resulta = new int[a.length];

        int p = Maximum(b);
        int n = Maximum(a);
        int[] cache = Cache(n, p);

        for (int i = 0; i<a.length; i++) {
        resulta[i] = cache[a[i]] % (int) Math.pow(2, b[i]);
        }

        return resulta;
    }

    private static int Maximum(int[] array) {
        int maximum = array[0];

        for (int i = 0; i<array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }

        return maximum;
    }

    public static int[] Cache(int n, int p) {
        int[] c = new int[n+1];
        int valactuelle = 1;
        int précedent  = 1;

        int i = 3;
        c[0] = 1;
        c[1] = 1;
        while (i <= n+1){
            int temp = valactuelle;
            valactuelle = (précedent + valactuelle)  % (int) Math.pow(2, p);
            précedent = temp;
            c[i-1] = valactuelle;
            i++;
        }

        return c;
    }
    
}

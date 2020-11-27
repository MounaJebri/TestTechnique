/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.math.*;

/**
 *
 * @author mouna
 */
class Solution {

    public Solution() {
    }
    
    
    public int[] solution(int N, int[] A) {

        final int condition = N + 1;
        
        int[] compteur = new int[N];
         
        int Max = 0;
        int Latest = 0;
       

        for (int i = 0; i < A.length; i++) {
            int val = A[i];
            if (val == condition) {
                Latest = Max ;
            } else {
                int pos = val - 1;
                if (compteur[pos] < Latest)
                    compteur[pos] = Latest + 1;
                else
                    compteur[pos]++;

                if (compteur[pos] > Max) {
                    Max = compteur[pos];
                }
            }

        }

        for (int j = 0; j < N; j++) {
           if (compteur[j] < Latest)
               compteur[j] = Latest;
        }

        return compteur;
    }
    
    
}

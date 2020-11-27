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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Solution Solution = new Solution();              
        int[] A = new int[]{3,4,4,6,1,4,4};       
        int[] aa =Solution.solution(5, A);    
        System.err.println("ALGO 1 : "); 
        for (int i=0;i<=4;i++){System.err.println(aa[i]);}
        
        SolutionAlgo2 Solution2 = new SolutionAlgo2(); 
        int[] A1 = new int[]{4,4,5,5,1};
        int[] B = new int[]{3,2,4,3,1};       
        int[] bb =Solution2.solution(A1, B); 
        System.err.println("ALGO 2 : "); 
        for (int i=0;i<=4;i++){System.err.println(bb[i]);}


        
        SolutionAlgo3 Solution3 = new SolutionAlgo3();
        int[] A2 = new int[]{1,5,2,-2};  
        int  cc =Solution3.solution(A2);
        System.err.println("ALGO 3 : "); 
        System.err.println(cc);
        
        
       
       
         
     }
         
         

     
     
        
     }


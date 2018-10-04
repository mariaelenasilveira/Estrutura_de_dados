/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcrpn;

/**
 *
 * @author C6-PROF
 */
public class Operacao {
    
    private char code;
    private double a, b;
    
    public Operacao(char code, double a, double b) {
        this.code = code;
        this.a = a;
        this.b = b;
    }
    
    public Operacao( double a) {
        this.code = 'e';
        this.a = a;
    }
}

package calcrpn;

import java.io.*;
import java.util.Date;
import java.util.Scanner;


//package calcrpn;

public class CalcRPN {
    private Pilha<Double> aPilha;
    private Pilha<Operacao> hist; // pilha com historico com as operacoes
    
    
    public CalcRPN() {
        aPilha = new Pilha<>();
    }
    
    void mais() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b + a;
        aPilha.empilha(resultado);
        //hist.esmpilha(new operacao(.....));
    }
    
    void menos(){
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b - a;
        aPilha.empilha(resultado);
        //hist.esmpilha(new operacao(.....));
    }
    
    void vezes() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b * a;
        aPilha.empilha(resultado);
        //hist.esmpilha(new operacao(.....));
    }
    
    void dividido() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b / a;
        aPilha.empilha(resultado);
        //hist.desempilha(new operacao(.....));
    }
    
    public Double resultado() {
        return aPilha.topo();
    }
    
    //static double parseDouble(String s) {
            
    //}
        
    
    void exec(String cmd) {
        
        if (cmd.equals("+")) {
            mais();
            System.out.println(resultado());
        } else if (cmd.equals("-")) {
            menos();
            System.out.println(resultado());
        } else if (cmd.equals("*")) {
            vezes();
            System.out.println(resultado());
        } else if (cmd.equals("/")) {
            dividido();
            System.out.println(resultado());
        }  else if (cmd.equals("clear")) {
            aPilha.reinicialize();
            //System.out.println(resultado());
        } else {
            aPilha.empilha(Double.parseDouble(cmd));
        }
        
    }
    
    //void cancela() {
        
    //}
    /*
    static void test() {
        CalcRPN calc = new CalcRPN() ;
        System.out.print("3 2 + = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.mais();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("3 2 - = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.menos();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("3 2 * = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.vezes();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("3 2 / = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.dividido();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("1 2 + 3 4 - / 10 3 - * = ");
        calc.aPilha.empilha(1.0);
        calc.aPilha.empilha(2.0);
        calc.mais();
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(4.0);
        calc.menos();
        calc.dividido();
        calc.aPilha.empilha(10.0);
        calc.aPilha.empilha(3.0);
        calc.menos();
        calc.vezes();
        System.out.println(calc.resultado());
    }

    static void interfaceUsuario() throws IOException {
        CalcRPN calc = new CalcRPN() ;
        String line;
        BufferedReader reader = new BufferedReader
        (new InputStreamReader (System.in));
        while((line = reader.readLine()) != null) {
            if (line.isEmpty())
                continue;
            for (String s : line.split(" "))
                calc.exec(s);
            System.out.println("Pilha = " + calc.aPilha);
        }
        System.out.println("Até logo");
    }*/
    
    public static void main (String[] args) throws IOException {
        CalcRPN calc = new CalcRPN() ;
        System.out.println("Pilha = " + calc.aPilha);
        String line;
        BufferedReader reader = new BufferedReader
        (new InputStreamReader (System.in));
        while((line = reader.readLine()) != null) {
            if (line.isEmpty())
                continue;
            for (String s : line.split(" "))
                calc.exec(s);
            System.out.println("Pilha = " + calc.aPilha);
        }
        System.out.println("Até logo");
       // interfaceUsuario();
    }
    

}


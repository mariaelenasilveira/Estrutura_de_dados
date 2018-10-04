package calcrpn;

import java.util.LinkedList;


public class Pilha<T>{ // generica
    private final LinkedList<T> conteudo;
    
    public Pilha() {
        conteudo = new LinkedList<>();
    }
    
    public void empilha(T novoElemento) {
        conteudo.addFirst(novoElemento); // adiciona no inicio da lista
    }
    
    public T desempilha() {
        return conteudo.removeFirst();
    }
    
    public T topo() {
        return conteudo.getFirst(); //retorna o primeiro elemento da lista
    }
    
    public boolean estaVazia() {
        return conteudo.isEmpty();
    }
    
    public String toString() {
        return conteudo.toString();
    }
    
    void reinicialize(){
        conteudo.clear();
    }
    /*
    public String toStringInverse() {
		String s = "[";
		for (int i = this.conteudo.size() - 1; i >= 0; i--) {
			s += this.conteudo.get(i).toString();
			if (i != 0) {
				s += ", ";
			}
		}
		s += "]";

		return s;
	}

    /*
    static void test1() {
        Pilha<Double> aPilha = new Pilha<Double>();
        aPilha.empilha(1.1);
        aPilha.empilha(2.1);
        aPilha.empilha(3.1);
        aPilha.empilha(4.1);
        aPilha.empilha(5.1);
        double valor = 0.0;
        valor = aPilha.topo();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.topo();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
    }
    
    static void test2() {
        Pilha<Double> aPilha = new Pilha<Double>();
        System.out.println(aPilha);
        aPilha.empilha(1.1);
        System.out.println(aPilha);
        aPilha.empilha(2.1);
        System.out.println(aPilha);
        aPilha.empilha(3.1);
        System.out.println(aPilha);
        double valor = 0.0;
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor );
        System.out.println(aPilha);
        valor = aPilha.desempilha(); System.out.println("Pilha = " + calc.aPilha);
        System.out.println("topo pilha = " + valor );
        System.out.println(aPilha);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor );
        System.out.println(aPilha);
        }
    
    public static void main(String[] args) {
        //test1();
        test2();
    }
    */
    void empilha(float resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}


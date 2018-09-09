#ifndef _LISTACANDIDATOS_H
#define _LISTACANDIDATOS_H
#include <cstring>
#include <sstream>
#include <fstream>
#include <iostream>
#include "NoCandidato.h"
#include "Candidato.h"

using namespace std;

class ListaCandidatos {
  public:
    NoCandidato *head;
 	int cont;
 	NoCandidato * auxHead;

    /*
    ListaCandidatos() {//contrutor
        head = NULL;

    }*/

    ListaCandidatos(string nomeDoArquivo) {//construtor
        head = NULL;

        ifstream fcin(nomeDoArquivo.c_str());
  
        string dados;
        getline(fcin,dados);
        cout << "criacao da lista de candidatos de:" << dados << endl;

        while(getline(fcin,dados)){
            Candidato *novoCandidato = new Candidato(dados);
            adicioneComoHead(novoCandidato);
            //Candidato c(dados);
            //cout << "criacao do candidato: " << c.toString() << endl;

        }
    
	}
    
    void adicioneComoHead(Candidato* x){
    	NoCandidato *novoNo = new NoCandidato(x,head);
    	head = novoNo;
    	auxHead = head;
    }

    bool estaVazia(){
    	if(head==NULL)
    		return true;
    	else
    		return false;
    }

    int tamanho(){
    	auxHead = head;
        if (head != NULL){
            for ( cont = 1; head->next!=NULL ; ++cont)
            {
                head = head->next;
            
            }

        }
        else
            cont = 0;
    	head = auxHead;
    	return cont;
    }
    
    string toString(){
        stringstream stream;
        if (head != NULL){
            stream << head->toString(); 
        }
        else
            stream << head; 
        return stream.str();
    }

    bool remove(string nome, string sobrenome) {
        NoCandidato *it = head;
        if(head==NULL)
            return false;
        else if(head->conteudo->nome==nome && head->conteudo->sobrenome==sobrenome)
        {
            delete head;
            head = it->next;
            return true;
        }
        for(NoCandidato *pessoa=head->next; pessoa!= NULL; pessoa=pessoa->next) {
            if(pessoa->conteudo->nome == nome & pessoa->conteudo->sobrenome == sobrenome){
                it->next=pessoa->next;
                delete pessoa;
                return true;
            }
            it = pessoa;                  
        }
        return false;        
    }

    void filtrarCandidatos(int nota) {
        for(NoCandidato *it= head; it!=NULL; it=it->next) {
            if(it->conteudo->nota < nota) {
                remove(it->conteudo->nome, it->conteudo->sobrenome);
            }

        }
    }

    void concatena(ListaCandidatos *l) {
        
        if(head==NULL)
            head=l->head;
        else {
            for(NoCandidato *it=head; it!=NULL; it=it->next){
                if(it->next==NULL) {
                    it->next=l->head;
                    break;
                }
            }   
        }
    }

};
#endif


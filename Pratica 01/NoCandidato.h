#ifndef _NoCANDIDATO_H
#define _NoCANDIDATO_H
#include <cstring>
#include <sstream>
#include "Candidato.h"

using namespace std;

class NoCandidato {
  public:
    Candidato *conteudo;
    NoCandidato *next; 

    NoCandidato(Candidato *c, NoCandidato *n) { //construtor
      conteudo = c;
      next = n;

    }

    string toString(){
      stringstream stream;
      if (next != NULL){
        stream << conteudo->toString() << " -> " << next->toString(); 
      }
      else
        stream << conteudo->toString() << " -> " << next; 
      return stream.str();
    }
};
#endif
//corrigir o toString, ver se next é NULL e ver um laço ou recussao.
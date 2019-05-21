class AreaCasa_Atributos_If {
static double  valorM2 = 1500;
static void areaCasa (double lateral, double cquarto){

double areaq, areas, areat;

System.out.println("...");
areas = Math.pow(lateral,2);
System.out.println("..."+areas);
areaq = cquarto*(lateral/2);
System.out.println("..."+areaq);
areat = areas + Math.pow(areaq,2);
System.out.println("..."+areat);
}

static double areaPiscina (double raio){

/* O Java possui um atalho para condicionais:
O operador ‘?’
var = condição ? expressão 1 : expressão 2;
Correspondendo a
if (condição) var = expressão 1;
else var = expressão 2;*/

double resp;
resp = raioc >= 0 ) ? Math.PI*Math.pow(raio,2) : -1;
return (resp);

//return(Math.PI*Math.pow(raio,2)); metodo antigo

}

static double valor(double area){
    if(area >= 0)
    return(valorM2*area);
    return(-1); // codigo de erro do programa.
    }

public static void main(String[]args){

double preco;
boolean valorOk = false;

preco = valor(-20);
valorOk = preco >= 0; //troco essa entrada pelo If
//if (preco >= 0) valorOk = true;
  
 if (valorOk) System.out.println("O valor da construção é "+preco);
 else System.out.println("Valor de área negativo");
  }
}

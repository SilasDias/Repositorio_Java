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

static final int ALVENARIA = 0;
static final int VINIL = 1;
static final int FIBRA = 2;
static final int PLASTICO = 3;

static double valorPiscina(double area,int material) {
    double valor;
    
    //Switch sem break e ja sendo interrompido pelo return saido do metodo.
    switch (material) {
    case ALVENARIA: return(area*1500);
    case VINIL: return(area*1100);
    case FIBRA: return(area*750);
    case PLASTICO: return(area*500);
    default: return(-1);
}
}

static double areaPiscina (double raio){

/* O Java possui um atalho para condicionais:
O operador ‘?’
var = condição ? expressão 1 : expressão 2;
Correspondendo a
if (condição) var = expressão 1;
else var = expressão 2;*/

double resp;
resp = (raio >= 0 ) ? Math.PI*Math.pow(raio,2) : -1;
return (resp);

//return(Math.PI*Math.pow(raio,2)); metodo antigo

}

static double valor(double area){
    if(area >= 0)
    return(valorM2*area);
    return(-1); // codigo de erro do programa.
    }

public static void main(String[]args){
/*E se tivéssemos 20 tipos diferentes de materiais?
Repare nos valores dos tipos
de material para a piscina:

static final int ALVENARIA = 0;
static final int VINIL = 1;
static final int FIBRA = 2;
static final int PLASTICO = 3;

São inteiros sequenciais...
Como podemos usar isso?*/

double area = 100;
int tipo = ALVENARIA;

System.out.println("Material\tValor");

while(tipo <= PLASTICO){
    System.out.println(tipo+\t\t+valorPiscina(area,tipo));
    tipo++;
  }
}

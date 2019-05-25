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
    
static double precos[] = {1500, 1100, 750, 500};
    
    if (material < ALVENARIA || material > PLASTICO || are < 0)return(-1);
    return (area*precos[material]);
    
}

static double media(double[] arranjo){
    double resp =0;
    
    for(double valor : arranjo){
    resp += valor;
    }
    return (resp/arranjo.length);
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

for (int i=ALVENARIA; I <= plastico; i++){
    
    System.out.println(precos[i]);

}

System.out.println(media(precos));

}

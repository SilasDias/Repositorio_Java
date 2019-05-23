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

return(Math.PI*Math.pow(raio,2));

}

static double valor(double area){
    if(area >= 0)
    return(valorM2*area);
    return(-1); // codigo de erro do programa.
    }

public static void main(String[]args){

double preco;

preco = valor(-20);
if (preco >= 0)
    System.out.println("O valor da construção é "+preco);
    else
    System.out.println("Valor da area negativo");
  }
}

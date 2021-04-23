public class Calculadora
{
   public String valorDeX(int a, int b, int c){
        String ecuacion;
        double x1 = (( - b) + (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
        double x2 = (( - b) - (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
        ecuacion = " X1 = " + x1 +  " y X2 = " + x2 ;
        return ecuacion;
    }
    public String ecuacionRecta(int x1, int y1, int x2, int y2){
        String EcuacionRecta;
        double a = (y2 - y1);
        double b = (x2 - x1);
        double c = b * ( - y1);
        double d = a * ( - x1);
        double e = - c + d;
        EcuacionRecta = a + " x " + " + ( " + - b +  " y) " + " + ( " + e + " ) " + " = 0 " ;
        return EcuacionRecta;
    }
    public  double  catetoFaltante(double hipotenusa, double  cateto1 ) {
        double CatetoFaltante;
        CatetoFaltante =  Math.sqrt((Math.pow(hipotenusa, 2)) - (Math.pow(cateto1, 2)));
        return CatetoFaltante; 
    }
}

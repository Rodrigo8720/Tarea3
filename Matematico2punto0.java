
public class Matematico2punto0
{
   private Calculadora cal = new Calculadora();
   
   public Matematico2punto0(){
    }
    
   public String ValorDeX(int a, int b, int c){
       
       return cal.valorDeX(a, b, c);
       
    }
   public String ecuacionRecta(int x1, int y1, int x2, int y2){
       
       return cal.ecuacionRecta(x1, y1, x2, y2);
       
    }
   public double catetoFaltante(double hipotenusa, double  cateto1){
       
       return cal.catetoFaltante(hipotenusa, cateto1);
       
    }
}

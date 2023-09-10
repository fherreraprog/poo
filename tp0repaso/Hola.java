package tp0repaso;
public class Hola{
  public static void main(String[] args){
    System.out.println("Bienvenidos a POO Practica");
    for (int i=0;i<10;i++)
      System.out.println(i);
   
     System.out.println( Hola.prueba());
    
  }
  public static String prueba()
  {
    return true ? "si" : "No";
  }
}
import java.util.Scanner;



public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);






    
 System.out.println("Por favor insira sua senha:");

    int senha =  sc.nextInt();
    
  while( senha!= 2022) {
    System.out.println("Senha incorreta");
    System.out.println("Digite novamente:");



    
    senha = sc.nextInt();
  }
if (senha == 2022) {
      System.out.println("etapa 1 de 2");
}



System.out.println(" Seja bem vindo de volta senhor");


System.out.println(" por favor digite o codigo de 4 digitos que te enviamos no seu gmail para confirmar que é você mesmo que esta fazendo login");



int senha1 = sc.nextInt();
while( senha!= 2000){

  System.out.println(" senha incorreta ");
System.out.println(" Digite sua senha novamente ");

senha  = sc.nextInt();
if ( senha == 2000){

  System.out.println(" seja bem vindo de volta ");
    
}  

  }  
    
     sc.close();
  }
}








    
  










  

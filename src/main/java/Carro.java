public class Carro{
// criação da classe Carro

  // criação de atributos
  public String marca;
  public int ano;
  public int marcha;
  public boolean ligado;

  // criação de métodos
  public void ligar(){
    ligado = true;
    System.out.println("Carro ligado");
  }

  public void desligar(){
    ligado = false;
    System.out.println("Carro desligado");
  }

  public void aumentarMarcha(){
    if(marcha < 5){
      marcha++;
      System.out.println("Marcha: " + marcha);
    }else{
      System.out.println("Marcha máxima");
    }
  }

  public void diminuirMarcha(int marchaEscolhida){
    if(marcha > marchaEscolhida){
      marcha--;
      System.out.println("Marcha: " + marcha);
    }else{
      System.out.println("Marcha mínima");
    }
  }
  
}

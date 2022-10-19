package Model;


public class Guerreiro extends Personagem{
   String nome;


   public Guerreiro(int vida,
                    int exp,
                    String raca,
                    int mana,
                    double dinheiro,
                    int forca,
                    int danoEquipamento,
                    ListaDeEquipamento equipamento,
                    String nome) {
      super(vida, exp, raca, mana, dinheiro, forca, danoEquipamento, equipamento);
      this.nome = nome;
   }

   public void calcularForca(int forca, int danoEquipamento){
      forca += danoEquipamento;
      System.out.println(forca);
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      try {
         this.nome = nome;
      }
      catch (NullPointerException e){
         System.out.println("Informe um nome valido!");
      }
   }

   public int getDanoEquipamento() {
      return danoEquipamento;
   }

   public void setDanoEquipamento(int danoEquipamento) {
      this.danoEquipamento = danoEquipamento;
   }

   @Override
   public int getVida() {
      return super.getVida();
   }

   @Override
   public int getExp() {
      return super.getExp();
   }

   @Override
   public String getRaca() {
      return super.getRaca();
   }

   @Override
   public int getMana() {
      return super.getMana();
   }

   @Override
   public double getDinheiro() {
      return super.getDinheiro();
   }

   @Override
   public int getForca() {
      return super.getForca();
   }

   @Override
   public String toString() {
      return "Guerreiro{" +
              "nome='" + nome + '\'' +
              ", equipamento='" + equipamento + '\'' +
              ", danoEquipamento=" + danoEquipamento +
              ", vida=" + vida +
              ", exp=" + exp +
              ", raca='" + raca + '\'' +
              ", mana=" + mana +
              ", dinheiro=" + dinheiro +
              ", forca=" + forca +
              '}';
   }
}

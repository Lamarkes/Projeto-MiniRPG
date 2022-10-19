package Model;


public class Inimigo extends Personagem{
    String nome;

    public Inimigo(int vida,
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    public void setForca(int forca) {
        super.setForca(forca);
    }

    @Override
    public String toString() {
        return "Inimigo{" +
                "nome='" + nome + '\'' +
                ", equipamento='" + equipamento + '\'' +
                ", danoEquipamento=" + danoEquipamento +
                ", vida=" + vida +
                ", exp=" + exp +
                ", raca='" + raca + '\'' +
                ", mana=" + mana +
                ", dinheiro=" + dinheiro +
                ", forca=" + forca +
                ", calcularStatus=" + calcularStatus +
                '}';
    }
}

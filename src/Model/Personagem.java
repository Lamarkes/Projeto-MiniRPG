package Model;

import Exceptions.ValorAbaixoDeZero;
import Interface.ICalcularDano;

public class Personagem implements ICalcularDano{
    int vida;
    int exp;
    String raca;
    int mana;
    double dinheiro;
    ListaDeEquipamento equipamento;
    int danoEquipamento;

    int forca;
    int calcularStatus;

    public Personagem(int vida,
                      int exp,
                      String raca,
                      int mana,
                      double dinheiro,
                      int forca,
                      int danoEquipamento,
                      ListaDeEquipamento equipamento) {
        this.vida = vida;
        this.exp = exp;
        this.raca = raca;
        this.mana = mana;
        this.dinheiro = dinheiro;
        this.forca = forca;
        this.equipamento = equipamento;
        this.danoEquipamento = danoEquipamento;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getRaca() {
        return raca;
    }

    public int getDanoEquipamento() {
        return danoEquipamento;
    }

    public void setDanoEquipamento(int danoEquipamento) {
        this.danoEquipamento = danoEquipamento;
    }



    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "vida=" + vida +
                ", exp=" + exp +
                ", raca='" + raca + '\'' +
                ", mana=" + mana +
                ", dinheiro=" + dinheiro +
                ", equipamento='" + equipamento + '\'' +
                ", danoEquipamento=" + danoEquipamento +
                ", forca=" + forca +
                '}';
    }

    @Override
    public void calcularDano(int danoEquipamento, int danoForca, int vida) throws ValorAbaixoDeZero {
        int danoTotal = danoEquipamento + danoForca/2;
        vida -= danoTotal;
        System.out.println("O dano foi de: "+ danoTotal);
        if (vida <=0){
            throw new ValorAbaixoDeZero("Vida chegou a zero");
    }
        System.out.println("Sua vida agora e: "+vida);

    }
}



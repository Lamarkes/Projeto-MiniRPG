package Model;

public class ListaDeEquipamento {

    String[] listaDeEquipamento;

    public ListaDeEquipamento(int quantidadeDeArmas) {
        listaDeEquipamento = new String[quantidadeDeArmas];
    }

    public void getListaDeEquipamento() {
        for(int i=0; i<listaDeEquipamento.length;i++){
            System.out.println(listaDeEquipamento[i]);
        }
    }

    public void setListaDeEquipamento(int posicao, String equipamento) {
        try {
            this.listaDeEquipamento[posicao] = equipamento;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("So existem apenas 3 armas");
        }
    }

    @Override
    public String toString() {
        this.getListaDeEquipamento();
        return null;
    }
}

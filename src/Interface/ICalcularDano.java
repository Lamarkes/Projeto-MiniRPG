package Interface;

import Exceptions.ValorAbaixoDeZero;

public interface ICalcularDano {

    void calcularDano(int danoEquipamento, int danoForca, int vida) throws ValorAbaixoDeZero;

}

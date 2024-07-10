package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Multifuncional equipamento = new Multifuncional();
        Impressora impressora = equipamento;
        Digitalizadora digitalizadora = equipamento;
        Copiadora copiadora = equipamento;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}

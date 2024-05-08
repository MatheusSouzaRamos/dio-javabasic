package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main (String [] args){
        Impressora deskjet = new DeskJet();
        Impressora laserjet = new LaserJet();

        Digitalizadora scan = new Scanner();

        Copiadora xerox = new Xerox();

        EquipamentoMultifuncional mult = new EquipamentoMultifuncional();
        mult.imprimir();
        xerox = mult;

        xerox.copiar();
    }   
}

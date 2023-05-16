package Ex003;

import java.util.List;
import java.util.ArrayList;

public class Televisao {
   
    public boolean onOff;
    public int volume;
    public int canalAtual;
    public int volumeMaximo;
    public List<String> canais;

    public Televisao() {
        this.onOff = false;
        this.volume = 0;
        this.canalAtual = 0;
        this.volumeMaximo = 100;
        this.canais = new ArrayList<>();
        canais.add("SBT");
        canais.add("Rede TV");
        canais.add("Globo");
        canais.add("Band");
        canais.add("Rede Vida");
    }

    public void ligarTelevisao() {
        onOff = true;
    }

    public void desligarTelevisao() {
        onOff = false;
    }

    public void aumentarVolume() {
        if (onOff && (volume < volumeMaximo)) {
            volume = volume + 1;
        }
    }

    public void diminuirVolume() {
        if (onOff && (volume > 0)) {
            volume = volume - 1;
        }
    }

    public void subirCanal() {
        if (onOff && (canalAtual < canais.size() - 1)) {
            canalAtual = canalAtual + 1;
        }
    }

    public void diminuirCanal() {
        if (onOff && (canalAtual > 0)) {
            canalAtual = canalAtual - 1;
        }
    }

    public void mostrarInfo() {
        System.out.println("Televisao: " + (onOff ? "Ligada" : "Desligada"));
        System.out.println("Volume: " + volume);
        System.out.println("Canal Atual: " + canais.get(canalAtual));
    }
}

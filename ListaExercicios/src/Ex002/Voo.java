package Ex002;

public class Voo {
    public String data;
    public String horario;
    public int passageiros;

    public Voo(String data, String horario) {
        this.data = data;
        this.horario = horario;
        this.passageiros = 0;
    }

    public void AddPassageiros(int num) {
        if ((passageiros + num) <= 100) {
            passageiros = passageiros + num;
            System.out.println("\nPassageiros Adicionados!\nTotal: " + passageiros);
        } else {
            System.out.println("\nExcesso de Passageiros!");
        }
    }

    public void RemPassageiros(int num) {
        if (num <= passageiros) {
            passageiros = passageiros - num;
            System.out.println("\nPassageiros Removidos!\nTotal: " + passageiros);
        } else {
            System.out.println("\nQuantidade de Passageiros Excedida!");
        }
    }

    public String toString() {
        return "\nVoo1: \nData: " + data + "\nHorario: " + horario + "\nPassageiros: " + passageiros;
    }
}

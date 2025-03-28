package aulaProva;

public class polimorfismoeheranca {
    public static void main(String[] args) {
        Veiculo c = new Carro();
        c.buzinar();
        Animal a = new Animal();
        a.emitirSom();
        Animal b = new Cachorro();
        b.emitirSom();
        Gato d = new Gato();
        d.meow();
    }
}

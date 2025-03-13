public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Livro livro1 = new Livro("Dom Casmurro", 256);
        Pessoa pessoa1 = new Pessoa("Izabel");

        pessoa1.lerLivro(livro1);
        pessoa1.exibirInformacoes();
    }
}

class Livro {
    private String nome;
    private int numeroPaginas;

    public Livro(String nome, int numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}

class Pessoa {
    private String nome;
    private int qtdLivrosLidos;
    private Livro livro;

    public Pessoa(String nome) {
        this.nome = nome;
        this.qtdLivrosLidos = 0;
    }

    public void lerLivro(Livro livro) {
        this.livro = livro;
        this.qtdLivrosLidos++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de livros lidos: " + qtdLivrosLidos);
        if (livro != null) {
            System.out.println("Último livro lido: " + livro.getNome());
            System.out.println("Número de páginas: " + livro.getNumeroPaginas());
        } else {
            System.out.println("Nenhum livro lido ainda.");
        }
    }
}

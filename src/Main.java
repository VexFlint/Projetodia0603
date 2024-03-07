import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtendo dados da Pessoa
        Pessoa pessoa = new Pessoa();
        System.out.print("Digite o nome da pessoa: ");
        pessoa.nome = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        pessoa.idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Obtendo dados da Musica
        Musica musica = new Musica();
        System.out.print("Digite o título da música: ");
        musica.titulo = scanner.nextLine();
        System.out.print("Digite a duração da música em segundos: ");
        musica.duracao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite o compositor da música: ");
        musica.compositor = scanner.nextLine();

        // Obtendo dados do Album
        Album album = new Album();
        System.out.print("Digite o gênero do álbum: ");
        album.genero = scanner.nextLine();
        System.out.print("Digite o ano do álbum: ");
        album.ano = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite o nome do álbum: ");
        album.nome = scanner.nextLine();
        System.out.print("Digite o nome do artista: ");
        album.artista = scanner.nextLine();

        // Adicionando a música ao álbum
        album.musicas.add(musica);

        // Exibindo todos os dados do álbum
        album.mostraTodosOsDados();

        // Fechando o Scanner
        scanner.close();
    }
}

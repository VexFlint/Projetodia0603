import java.util.ArrayList;
public class Album {
    String genero;
    int ano;
    String nome;
    String artista;
    ArrayList<Musica> musicas = new ArrayList<>();
    void mostraTodosOsDados() {
        System.out.println("Detalhes do Álbum:");
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Nome: " + nome);
        System.out.println("Artista: " + artista);
        System.out.println("Músicas:");

        for (Musica musica : musicas) {
            System.out.println("  - " + musica.titulo + " (Compositor: " + musica.compositor + ")");
        }
    }
}

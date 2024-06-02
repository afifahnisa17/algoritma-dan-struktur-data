package Film;

public class Film {
    int id;
    String judul;
    double rating;
    Film prev, next;

    Film (Film prev, int id, String judul, double rating, Film next ){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}

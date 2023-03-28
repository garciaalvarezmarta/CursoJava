package MyPackage;
import java.util.Comparator;

public class PeliculaComparator implements Comparator<Pelicula>{
    public int compare(Pelicula p1, Pelicula p2) {
        return p1.getTitulo().compareTo(p2.getTitulo());
    }

}

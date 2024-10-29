package marcozagaria.u2_w2_d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BlogPost {
    private int id;
    private String categoria;
    private String titolo;
    private String contenuto;
    private String tempoDiLettura;
    private String cover;

    public BlogPost(String categoria, String titolo, String contenuto, String tempoDiLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }

}

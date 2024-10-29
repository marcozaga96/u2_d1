package marcozagaria.u2_w2_d1.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BlogPostPayload {
    private String categoria;
    private String titolo;
    private String contenuto;
    private LocalDateTime tempoDiLettura;
}

package br.com.erudio.bookservice.response;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Cambio implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String from;

    private String to;

    private Double conversionFactor;

    private Double convertedValue;

    private String environment;
}

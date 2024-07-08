package org.fractal.mockitospringb.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data @ToString @EqualsAndHashCode
public class Weather {
    private String status;
    private Integer minTemp;
    private Integer maxTemp;

}

package com.example.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Visual {    
    private int length;
    private int width ;
    private String material;
    private String handle_material;
    private boolean bloodstream;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        return hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width, material, handle_material, bloodstream);
    }
}

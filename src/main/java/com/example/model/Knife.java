package com.example.model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Knife {
    private int id;
    private String type;
    private int handy;
    private String origin;
    private Type visual;
    private boolean value;

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
        return Objects.hash(id, type, handy, origin, visual, value);
    }
}

package com.example.model;

import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Knifes {
    private List<Knife> knifes;
    
    public int size() {
        return knifes.size();
    }
    
    public Knife get(int index) {
        return knifes.get(index);
    }

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
        return Objects.hash(knifes);
    }
}

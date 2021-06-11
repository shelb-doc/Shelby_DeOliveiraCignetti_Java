package com.mimikyu.magics.models;

import java.util.Objects;

public class Words {
    private int id;
    private String word;
    private String def;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words = (Words) o;
        return id == words.id && Objects.equals(word, words.word) && Objects.equals(def, words.def);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, def);
    }

    @Override
    public String toString() {
        return "Words{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", def='" + def + '\'' +
                '}';
    }
}

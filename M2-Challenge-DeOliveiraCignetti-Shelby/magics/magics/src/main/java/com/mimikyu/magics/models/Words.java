package com.mimikyu.magics.models;


import java.util.Objects;

public class Words {

    private int id;
    private String word;
    private String def;
    private String origin;
    private String used;

    public Words(int id, String word, String def, String origin, String used) {
        this.id = id;
        this.word = word;
        this.def = def;
        this.origin = origin;
        this.used = used;
    }

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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words = (Words) o;
        return id == words.id && Objects.equals(word, words.word) && Objects.equals(def, words.def) && Objects.equals(origin, words.origin) && Objects.equals(used, words.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, def, origin, used);
    }

    @Override
    public String toString() {
        return "Words{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", def='" + def + '\'' +
                ", origin='" + origin + '\'' +
                ", used='" + used + '\'' +
                '}';
    }
}

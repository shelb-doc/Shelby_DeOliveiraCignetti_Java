package com.mimikyu.magics.models;

import java.util.Objects;

public class Quotes {
    private int id;
    private String quote;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quotes quotes = (Quotes) o;
        return id == quotes.id && Objects.equals(quote, quotes.quote) && Objects.equals(author, quotes.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quote, author);
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

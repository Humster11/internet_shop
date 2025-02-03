package org.skypro.skyshop.info;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {
    private final String nameArticle;
    private final String textArticle;

    public Article(String nameArticle, String textArticle) {
        this.nameArticle = nameArticle;
        this.textArticle = textArticle;
    }

    @Override
    public String toString() {
        return nameArticle + " \n" + textArticle;
    }

    @Override
    public String getSearchTerm() {
        return toString();
    }

    @Override
    public String getTypeContent() {
        return "ARTICLE";
    }

}

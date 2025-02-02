package org.skypro.skyshop.product;

public interface Searchable {

    String getSearchTerm();

    String getTypeContent();

    default void getStringRepresentation(){
        System.out.println("Имя Searchable объекта - тип Searchable объекта");
    };

}

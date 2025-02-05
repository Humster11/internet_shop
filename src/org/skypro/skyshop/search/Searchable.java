package org.skypro.skyshop.search;

public interface Searchable {

    String getSearchTerm();

    String getTypeContent();

    String getNameSearchable();

    default String getStringRepresentation(){
        return this.getNameSearchable()+" - "+this.getTypeContent();
    };

}

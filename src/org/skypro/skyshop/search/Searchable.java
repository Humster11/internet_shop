package org.skypro.skyshop.search;

public interface Searchable {

    String getSearchTerm();

    String getTypeContent();

    default String getNameSearchable(){
        return this.getStringRepresentation();
    };

    default String getStringRepresentation(){
        return this.getNameSearchable()+" - "+this.getTypeContent();
    };

}

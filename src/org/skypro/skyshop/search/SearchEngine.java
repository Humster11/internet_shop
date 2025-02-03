package org.skypro.skyshop.search;

public class SearchEngine {
    private Searchable[] SearchableArray;
    private int count = 0;
    private String[] resultSearh = new String[5];

    public SearchEngine(int size) {
        this.SearchableArray = new Searchable[size];
    }

    public void add(Searchable searchableElement) {
        if (count >= SearchableArray.length) {
            System.out.println("Поисковый массив заполнен");
        }
        for (int i = 0; i < SearchableArray.length; i++) {
            if (SearchableArray[i] == null) {
                SearchableArray[i] = searchableElement;
                count = count + 1;
                break;
            }
        }
    }

    public String[] search(String searchQuery) {
        int countSearchable = 0;
        for (int i = 0; i <= SearchableArray.length - 1; i++) {
            if (SearchableArray[i].getSearchTerm().contains(searchQuery)) {
                resultSearh[i] = i+". Тип контента "+SearchableArray[i].getTypeContent()+" \n"+SearchableArray[i].getSearchTerm();
                if (countSearchable >= resultSearh.length) {
                    break;
                }
            }
        }
        return resultSearh;
    }

    /*@Override
    public String toString(){

    }*/
}

package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFound;

import java.util.ArrayList;

public class SearchEngine {
    private ArrayList<Searchable> SearchableArray = new ArrayList<Searchable>();
    private int count = 0;
    private ArrayList<String> resultSearh = new ArrayList<String>();

    public SearchEngine() {
    }

    public void add(Searchable searchableElement) {
        SearchableArray.add(searchableElement);
        count = count + 1;

    }

    public ArrayList<String> search(String searchQuery) {
        int countSearchable = 0;
        for (int i = 0; i <= SearchableArray.size() - 1; i++) {
            if (SearchableArray.get(i).getSearchTerm().contains(searchQuery)) {
                resultSearh.add("\n" + i + ". Тип контента " + SearchableArray.get(i).getTypeContent() + " \n" + SearchableArray.get(i).getSearchTerm());
            }
        }
        return resultSearh;
    }

    public Searchable searchInSearhable(String search) throws BestResultNotFound {
        Searchable result = null;
        for (int i = 0; i <= SearchableArray.size() - 1; i++) {
            if (SearchableArray.get(i).getSearchTerm().contains(search)) {
                result = SearchableArray.get(i);
                break;
            }

        }
        if (result == null) {
            throw new BestResultNotFound("Объект поиска не найден");
        }

        return result;
    }
}

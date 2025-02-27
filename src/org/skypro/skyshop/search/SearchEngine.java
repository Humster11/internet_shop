package org.skypro.skyshop.search;


import org.skypro.skyshop.exception.BestResultNotFound;

import java.util.*;

public class SearchEngine {
    private Set<Searchable> SearchableArray = new HashSet<>();
    private int count = 0;

    public SearchEngine() {
    }

    public void add(Searchable searchableElement) {
        SearchableArray.add(searchableElement);
        count = count + 1;
    }

    public TreeSet<String> search(String searchQuery) {
        TreeSet<String> serachableSet = new TreeSet<>(new Searchable.ReverseStringComparator());

        for (Searchable elementSearch : SearchableArray) {
            if (elementSearch.getSearchTerm().contains(searchQuery)) {
                serachableSet.add(elementSearch.getSearchTerm());
            }
        }
        return serachableSet;
    }

    public Searchable searchInSearhable(String search) throws BestResultNotFound {
        Searchable result = null;
        for (Searchable elementSearch : SearchableArray) {
            if (elementSearch.getSearchTerm().contains(search)) {
                result = elementSearch;
                break;
            }

        }
        if (result == null) {
            throw new BestResultNotFound("Объект поиска не найден");
        }

        return result;
    }


}

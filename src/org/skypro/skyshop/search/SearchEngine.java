package org.skypro.skyshop.search;

import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public Map<String, String> search(String searchQuery) {
        int countSearchable = 0;
        Map<String, String> serachableMap = new HashMap<>();

        for (int i = 0; i <= SearchableArray.size() - 1; i++) {
            if (SearchableArray.get(i).getSearchTerm().contains(searchQuery)) {
                serachableMap.put(SearchableArray.get(i).getTypeContent(),SearchableArray.get(i).getSearchTerm());
            }
        }
        return serachableMap;
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

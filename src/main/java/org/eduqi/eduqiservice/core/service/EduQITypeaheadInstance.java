package org.eduqi.eduqiservice.core.service;

import cleo.search.Element;
import cleo.search.Indexer;
import cleo.search.store.ArrayStoreElement;
import cleo.search.typeahead.Typeahead;


public interface EduQITypeaheadInstance<E extends Element> {
    
    public Indexer<E> getIndexer();
    public Typeahead<E> getSearcher();
    public ArrayStoreElement<E> getElementStore();
}

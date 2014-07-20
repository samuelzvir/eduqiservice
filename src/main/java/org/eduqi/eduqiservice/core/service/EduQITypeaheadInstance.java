package org.eduqi.eduqiservice.core.service;

import cleo.search.Element;
import cleo.search.Indexer;
import cleo.search.store.ArrayStoreElement;
import cleo.search.typeahead.Typeahead;


public interface EduQITypeaheadInstance<E extends Element> {
    
    /**
     * @return the typeahead indexer.
     */
    public Indexer<E> getIndexer();
    
    /**
     * @return the typeahead searcher.
     */
    public Typeahead<E> getSearcher();
    
    /**
     * @return the underlying element store.
     */
    public ArrayStoreElement<E> getElementStore();
}

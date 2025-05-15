// https://www.codewars.com/kata/515bb423de843ea99400000a/train/java

import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {
    List<I> collection;
    int itemsPerPage;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (itemCount() == 0) {
            return 0;
        }
        return (int) Math.ceil((double) itemCount() / itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        }
        if (pageIndex == pageCount() - 1) {
            return itemCount() % itemsPerPage == 0 ? itemsPerPage : itemCount() % itemsPerPage;
        }
        return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        int page = itemIndex / itemsPerPage;
        if (itemIndex >= itemCount() || itemIndex < 0) {
            return -1;
        } else {
            return itemIndex / itemsPerPage;
        }
    }
}

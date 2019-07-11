/*
* The following program list the order of category Name ascending.It outputs
* the unsorted array list, and then the Sorted array list via comparator method
* through java built in sort operations. It has an output explanation of why
* java built in sort is more apropriate than buble or quick sort.
*/
package javasort;

/**
 * @Date 11/07/2019.
 * @author Jeff/Antony Jones 92019124.
 */
class CatalogueItem implements Comparable{
      
    private final Integer id;//Set variable d to Interger type.
    private final String itemName;//Set variable itemName to String type.
    private final String category;//Set variable category to String type.
    
    // getter method getItemId.
    public int getItemId(){
    return id;
    }
    //getter method for getItemName.
    public String getItemName(){
    return itemName;
    }
    //getter method for getCategory.
    public String getCategory(){
    return category;
    }
    //Compare to method. compares getItemId to getItemId.
      @Override
    public int compareTo(Object o) {
        CatalogueItem e = (CatalogueItem) o;
        return getItemName().compareTo(e.getItemName());
    }
    
    // constructor
    public CatalogueItem(Integer newId,String newName, String newCategory){

        id = newId;//Set variable id the newId.
        itemName = newName;//Set variable itemName to newName.
        category = newCategory;//Set variable category to newCategory.
    }
    
}

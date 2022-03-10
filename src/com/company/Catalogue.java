package com.company;

public class Catalogue {
  private Item[] catalogue;
  public Catalogue(int size){
    this.catalogue= new Item[size];
  }
  public Item[] getCatalogue(){
    return this.catalogue;
  }
  public void addItem(Item item){
    Item[] addItem = new Item[this.catalogue.length+1];
    for (int i = 0; i< catalogue.length; i++){
      if (this.catalogue[i] == null){
        catalogue[i]=item;
      return;
      }
    }
  }
  public Item[] getFullList(){
   return this.catalogue;
  }
  public Item[] getAvailableItems(){
    return null;
  }
  public void findItem(){

  }
  public void borrowItem(){
    Item item = new Item("name","catagory");
    item.setAvailable(false);
  }
  public void returnItem(){

  }
}


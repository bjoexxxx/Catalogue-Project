package com.company;

public class Item {
  private String name;
  private String catagory;
  private boolean available;
  public Item(String name, String catagory){
    this.name = name;
    this.catagory = catagory;
    this.available = true;

  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setCatagory(String catagory){
    this.catagory = catagory;
  }
  public String getCatagory(){
    return this.catagory;
  }
  public void setAvailable(boolean available){
    this.available = available;
  }
  public boolean getAvailable(){
    return this.available;
  }
  public String toString(){
    return this.catagory+" Catagory: "+this.name;
  }
}

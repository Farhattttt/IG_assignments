package com.insightglobal.day4;



public class Product {
    Integer id;
    String name;
    
    public Product(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + "]";
    }
    
    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product other = (Product) obj;
        return this.id.equals(other.id) && this.name.equals(other.name);
    }
}


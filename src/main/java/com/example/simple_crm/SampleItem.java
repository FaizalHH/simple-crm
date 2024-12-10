package com.example.simple_crm;

import org.springframework.stereotype.Component;

/* This means that the class is a Spring Bean
 * Spring will automatically create an instance of this class and store it in the Spring Container.  It can then be injected into other classes.
 */
@Component
public class SampleItem {
    private int id;
    private String name;
    private double price;
    private String desc;

    public SampleItem() {
    }

    public SampleItem(int id, String name, double price, String desc) {
      this.id = id;
      this.name = name;
      this.price = price;
      this.desc = desc;
    }

    public int getId() {
      return this.id;
    }

    public void setId(int id) {
     this.id = id;
    }

    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public double getPrice() {
      return this.price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public String getDesc() {
      return this.desc;
       }

    public void setDesc(String desc) {
      this.desc = desc;
    }

}

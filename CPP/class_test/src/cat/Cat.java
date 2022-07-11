/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat;

/**
 *
 * @author AS
 */
public class Cat {
    private String name;
    private int age;
    private String color;
    private float weight;
    
    public void space(){
        System.out.println(name+"is speaking");
        
    }
    public void move(){
        System.out.println(name+" is running");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    
    public Cat(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

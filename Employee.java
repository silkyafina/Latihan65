/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22166017.pbo.lat65;

/**
 *
 * @author User
 * Nama     : Silky Afina Saly
 * NIM      : 22166017
 * Prodi    : Sistem Informasi
 * Matkul   : PBO 1
 */
public class Employee {
    private String name;
     
    public Employee(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public void work(){
        
    }
}
class Manager extends Employee{
    
    public Manager(String name) {
        super(name);
    }
@Override
    public void work(){
    System.out.println(getName()+"is managing the team");
    }
}
class Developer extends Employee{
    
    public Developer(String name) {
        super(name);
    }
@Override
    public void work(){
        System.out.println(getName()+"is coding");
    }
}
class Designer extends Employee{
    
    public Designer(String name) {
        super(name);
    }
@Override
    public void work(){
        System.out.println(getName()+"is designing ");
    }

public static void main(String[]args){
    Manager m = new Manager("Shafira ");
    Developer d = new Developer("Izzah ");
    Designer D = new Designer("Silky ");
    
    m.work();
    d.work();
    D.work();

}
}
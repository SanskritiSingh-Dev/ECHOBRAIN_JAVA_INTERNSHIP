package INHERITANCE;

public class Developer extends Employee{
    boolean serverRoomEAccess;
    boolean productionDepartment;
    
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
        System.out.println(serverRoomEAccess);
        System.out.println(productionDepartment);
    }

    
}

package TYPECASTING;

class Animal {
    Animal(){
        System.out.println("Animal is admitted to th hospital");
    }
    void treatement(){
        System.out.println("Animal is getting treatement.");
    }
}

class Dog extends Animal{
    String name;
    Dog(String name){
        this.name = name;
        System.out.println("dog name" + this.name);
    }
    void dogCheckup(){
        System.out.println(name +"dog is getting special treatement.");
    }
}
public class UsingArray {
    public static void main(String[] args) {
        Animal patient[] = new Animal[2];
        patient[0] = new Dog("Tommy");
        patient[1] = new Dog("Bruno");
        System.out.println("\n general treatement");
        for(int i = 0; i < patient.length; i++){
            patient[i].treatement();
        }
        System.out.println("special treatement");
        Dog d = (Dog) patient[0];
        Dog d1 = (Dog) patient[1];
        d.dogCheckup();
        d1.dogCheckup();
    }
    
}

/*Animal admitted to hospital
Dog patient name: Tommy
Animal admitted to hospital
Dog patient name: Bruno

General Treatment:
Animal is getting treatment
Animal is getting treatment

Special Checkup:
Tommy is getting special dog checkup 
Bruno is getting pecial dog checkup*/
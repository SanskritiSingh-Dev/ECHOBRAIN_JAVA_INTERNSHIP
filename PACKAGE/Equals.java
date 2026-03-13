package PACKAGE;
class Equals {
    int id ;
    //constructor
    Equals(int id){
        this.id= id;
    }
    public boolean equals(Object obj){
        Equals s = (Equals)obj;
        return this.id == s.id;
    }
    public static void main(String[] args) {
        Equals s1 = new Equals(1);
        Equals s2 = new Equals(1);

        System.out.println(s1.equals(s2));
    }
}


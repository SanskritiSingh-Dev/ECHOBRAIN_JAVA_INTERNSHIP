public class Rectange {
    double len;
    double bre;
    
    //constructor
    public Rectange(double len, double bre){
        this.len = len;
        this.bre = bre;
    }

    public void area(){
        double area = len * bre;
        System.out.println("area is : " + area);
    }

    public static void main(String[] args) {
        Rectange r = new Rectange(6, 10);
        r.area();
    }
	
}


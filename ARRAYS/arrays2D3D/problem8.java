package arrays2D3D;

public class problem8 {
    public static void main(String[] args) {
        String[][][] arr3D = new String[2][][];
        arr3D[0] = new String[3][];//java batch
        arr3D[1] = new String[2][];//sql batch

        arr3D[0][0] = new String[2]; //java batch 1st student attended 2 classes
        arr3D[0][1] = new String[3]; //java batch 2nd student attended 3 classes
        arr3D[0][2] = new String[1]; //java batch 3rd student attended 1 class  

        arr3D[1][0] = new String[4]; //sql batch 1st student attended 4 classes
        arr3D[1][1] = new String[2]; //sql batch 2nd student attended 2 classes 
        
        //filling the 3D array with class names
        arr3D[0][0][0] = "Java Basics";
        arr3D[0][0][1] = "OOP Concepts";

        //java batch 2nd student attended 3 classes
        arr3D[0][1][0] = "Data Structures";
        arr3D[0][1][1] = "Algorithms";
        arr3D[0][1][2] = "System Design";

        } 
    
}

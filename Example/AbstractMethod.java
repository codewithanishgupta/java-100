interface  Anish {

    void display();
}

class ABC implements  Anish {
    
    public void display (){
        System.out.println("Anish");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        Anish A = new ABC();
        A.display();
    }
}
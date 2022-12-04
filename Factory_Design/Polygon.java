 interface Polgyon{
public String GetType();
}
class Triangle implements Polgyon{
public String GetType(){
    return "Triangle";
}}
class Square implements Polgyon{
    public String GetType(){
        return "Square";
    }}
 class Pentagon implements Polgyon{
        public String GetType(){
            return "Pentagon";
}}

class factory{

public static Polgyon getOjectPolgyon(int data){

    Polgyon ob = null;

        switch(data){

            case 3:
             ob = new Triangle();
             break;
             
             case 4:
             ob = new Square();
             break;

             case 5:
             ob = new Pentagon();
             break;
             
             default:
             System.out.println("Sorry!!");
             break;
        }
    return ob;
}
}

class calling {
public static void main(String[] args) {
    
    Polgyon interface1 = factory.getOjectPolgyon(3);
    System.out.println(interface1.GetType());

    Polgyon interface2 = factory.getOjectPolgyon(4);
    System.out.println(interface2.GetType());

    Polgyon interface3 = factory.getOjectPolgyon(5);
    System.out.println(interface3.GetType());


}

}
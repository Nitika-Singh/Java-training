public class LunchTime {
    public static void main(String[] args) {
        Thali southThali  = new Thali();
        southThali.papadCount = 1;
        southThali.rice = "Brown rice";

        // There is no reference of this object from stack
        //southThali.curd = new Cup();

        //southThali.curd.quantity  = 10; //NPE
        Cup curd = new Cup();
        curd.quantity = 50;

        Cup rasam = new Cup();
        rasam.quantity = 100;

        southThali.curd = curd;
        southThali.rasam = rasam;

        southThali.curd.quantity = 200;
    }
}

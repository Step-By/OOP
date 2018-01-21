public class HomeWork {
    public static void main1(String[] args) {

        PC pc = new PC();
        pc.m = 2270;
        pc.kb = "Defender";
        MotherBoard asus = new MotherBoard();
        pc.mb = asus;
        pc.mb.va = "MSI";
        pc.mb.p = 7430;
        pc.mb.hdd = 120;
        System.out.println(pc.m);
        System.out.println(pc.kb);
        System.out.println(pc.mb.hdd);
        System.out.println(pc.mb.p);
        System.out.println(pc.mb.va);
    }
    public static void main2(String[] args) {
     Human human=new Human();
     Mobile mobile=new Mobile();
     Bag bag=new Bag();
     Pencil pencil=new Pencil();
     Point  point=new Point();
     bag.pn=pencil;
     bag.pt=point;
     bag.mb=mobile;
     human.myBag=bag;
        System.out.println(human.myBag.owner);
        System.out.println(human.myBag.mb.owner);
        System.out.println(human.myBag.mb.number);
        System.out.println(human.myBag.pn.color);
        System.out.println(human.myBag.pt.color);


    }

    public static void main(String[] args) {
        Car car=new Car();
        System.out.println( car.color);
        System.out.println( car.equipment );
        System.out.println( car.guarantee);
        System.out.println( car.volume_motor);
        System.out.println( car.model);

    }
}

class PC {
    MotherBoard mb;
    // Monitor
    int m;
    // KeyBord
    String kb;
}

class MotherBoard {
    //Processor
    int p;
    //VideoAdapter
    String va;
    // HDD
    int hdd;
}

//--------------------------------------------------------------------
//Возьмите любое существительное и опишите для него класс.
// (список полей)
class Car {
    int model=535;
    String color="Red";
    double volume_motor=2.5;
    String equipment="Full";
     int guarantee=5;
}

    //----------------------------------------------------------------------
/*Класс Человек (ссылка на телефон)
    Класс Телефон (поле номертелефона, поле владелец)
    Класс Сумка(поле владелец)
    Класс Ручка (Они в сумке)
    Класс Карандаш (Они в сумке)*/



class Human {
   Mobile mob;
    Bag myBag;
}

class Mobile {
    int number=143759;
    String owner="It's my phone";
}

class Bag {
    Mobile mb;
    Point pt;
    Pencil pn;
    String owner="That's my bag";
}

class Point {
    String color="Blue";
}

class Pencil {
    String color="Red";
}


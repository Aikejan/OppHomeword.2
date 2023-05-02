public class Main {
    public static void main(String[] args) {
       /* MyClass деген класс тузунуз

        Ал класста озунуз жонундо маалымат сактаган полелер болсун
        (атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)

        Параметри эки башка болгон эки конструктор тузунуз

        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз

        Эки объектке эки башка конструктор иштесин.

        Объекттердин маанилерин консольго чыгарыныз.*/

        Peaksoft  peaksoft = new Peaksoft("English");
        Peaksoft [] peaksofts={peaksoft};

        MyClass myClass1 = new MyClass("Aikezhan","Akhmatova",45,peaksofts,"lagman");
        System.out.println(myClass1);
        MyClass myClass = new MyClass();
        myClass.firstName= "Aikezhan";
        myClass.lastName= "Akhmatova";
        myClass.age = 45;
        myClass.peaksofts = peaksofts;
        myClass.dishhes = "Lagmman";
        System.out.println(myClass);


    }
}
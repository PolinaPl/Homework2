public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("ЗАДАЧА 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("ЗАДАЧА 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("ЗАДАЧА 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println("ЗАДАЧА 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        System.out.println("ЗАДАЧА 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = 10*frog;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("ЗАДАЧА 6");
        var a = 78.2;
        System.out.println("Масса одного боксера " + a + "кг");
        var b = 82.7;
        System.out.println("Масса второго боксера " + b + "кг");
        var ab = a + b;
        System.out.println("Общая масса двух бойцов " + ab + "кг.");
        var c = b - a;
        System.out.println("Разница в массе двух бойцов " + c + "кг");
        System.out.println("ЗАДАЧА 7");
        var w = b % a;
        System.out.println("Разница в массе двух бойцов " + w + "кг");
        System.out.println("ЗАДАЧА 8");
        var hoursJob = 640;
        var hoursWorker = 8;
        var allWorker = hoursJob / hoursWorker;
        System.out.println("Всего работников в компании -  " + allWorker + " человек.");
        allWorker = allWorker + 94;
        hoursJob = allWorker * hoursWorker;
        System.out.println("Если в компании работает  " + allWorker + " человек, то всего " + hoursJob +
                " часов работы может быть поделено между сотрудниками.");














    }
}
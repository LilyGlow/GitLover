package javacake.isaid.javajustdoit.javanica.calc;

public class Calc_kkal {
    //это большой калькулятор, в нем весь перечень методов расчета калоража, нутриентов, микро и макро элементов
    //в классе должны быть толко:
    //1. Методы, которые будут вызываться в экземплры по линку на продукты
    //2. Переменные, передаваемые в методы
    //3. Константы

    float kkal, gramm, protein, fat, carbs;

    float full_kkal() {
        return (kkal / 100) * gramm; //нажратое непосильным трудом в ккалорийном счислении
    }

    public float percentage() {//процент нутриентов на продукт
        //Юля, функция возвращает только одно значение переменной, либо разбиваю на три,
        // либо три переменных класса и одна функция
        //входные значения для расчета исходящей величины
        float prot_proc, fat_proc, carbs_proc;
        prot_proc = protein * 4 / kkal * 100;
        fat_proc = fat * 9 / kkal * 100;
        carbs_proc = carbs * 4 / kkal * 100;

        return prot_proc;
    }

    float nutrients_gramm() { //грамм нутриентов на количество съеденного
        float prot_gr, fat_gr, carbs_gr;
        prot_gr = protein / 100 * gramm;
        fat_gr = fat / 100 * gramm;
        carbs_gr = carbs / 100 * gramm;
        return prot_gr;
    }

    //переменные данных пользователя
    String sex;
    float height, weight;
    int age;

    public double recommendations() {//sex
        double BMR;
        // int age;
        // String[] sex={"m","w"};
        // String m=sex[0];
        switch (sex) {
            case "m":
                BMR = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
                break;
            case "w":
                BMR = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
                break;
            default:
                System.out.println("Error, unknown sex " + sex);
                BMR = 0;
        }
        //переменна тут не нужна, перепили
        return BMR;
    }


    //float kkal_per_100gramm(){
    //     return protein*4+fat*9+carbs*4;
    // }

}
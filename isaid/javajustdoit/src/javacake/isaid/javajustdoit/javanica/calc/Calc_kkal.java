package javacake.isaid.javajustdoit.javanica.calc;

public class Calc_kkal {

  float kkal, gramm, protein,fat,carbs;

  float full_kkal()
  {
      return (kkal/100)*gramm; //нажратое непосильным трудом в ккалорийном счислении
  }
  public float  percentage(){//процент нутриентов на продукт
      float prot_proc,fat_proc,carbs_proc;
      prot_proc=protein*4/kkal*100;
      fat_proc=fat*9/kkal*100;
      carbs_proc=carbs*4/kkal*100;
  }
  float nutrients_gramm(){ //грамм нутриентов на количество съеденного
      float prot_gr,fat_gr,carbs_gr;
      prot_gr=protein/100*gramm;
      fat_gr=fat/100*gramm;
      carbs_gr=carbs/100*gramm;
    }

    float recomendations(){
      float age, height, weight, BMR;
      string sex;
      switch (sex){
          case m:
              return BMR=88.362+(13.397*weight)+(4.799*height)-(5.677*age);
              break;

      }



    }


  //float kkal_per_100gramm(){
 //     return protein*4+fat*9+carbs*4;
 // }

}
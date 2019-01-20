//Library of time --المكتبة البرمجية للتاريخ
import java.time.LocalDate

fun main(args : Array<String>) {

  //Calculate the age function -- دالة حساب العمر
  fun FindMYage() {

    // CALL DATE FUNCTION -- استدعاء دالة التاريخ
    var date: String = LocalDate.now().toString()

    //Separate the content of date -- تقسيم محتوى التاريخ
    var separate = date.split("-")

    // THE CURRENT DATE IN VARIABLES -- التاريخ الحالي في متغيرات

    var currentYEAR: Int = separate[0].toInt()//السنة الحالية
    var currentMONTH: Int = separate[1].toInt()//الشهر الحالي
    var currentDAY: Int = separate[2].toInt()//اليوم الحالي

    // THE CUSTOMER DATE IN VARIABLES -- تاريخ المستخدم في متغيرات

    print("Enter your birthday year please :  ")
    var CustomerYEAR: Int = readLine()!!.toInt()//سنة ميلاد المستخدم
    print("Enter your birthday month please :  ")
    var CustomerMONTH: Int = readLine()!!.toInt()//شهر ميلاد المستخدم
    print("Enter your birthday day please :  ")
    var CustomerDAY: Int = readLine()!!.toInt()//يوم ميلاد المستخدم

    //The results -- النتائج
    var FinalYEAR: Int = 0
    var FinalMONTH: Int = 0
    var FinalDAY: Int = 0

    // The length of the month  (number of days) -- عدد ايام الشهر
    var MLenth:Int = 0

    // The length of the month february (number of days) -- عدد ايام شهر فيفري
    var x:Int = 0
    if((CustomerYEAR % 4) == 0){
      x = 29
    }else {
      x = 28
    }


    when(CustomerMONTH){
      1 -> MLenth = 31 // The length of the month January (number of days) -- عدد ايام شهر جانفي
      2 -> MLenth = x  // The length of the month february (number of days) -- عدد ايام شهر فيفري
      3 -> MLenth = 31 // The length of the month March (number of days) -- عدد ايام شهر مارس
      4 -> MLenth = 30 // The length of the month April (number of days) -- عدد ايام شهر أفريل
      5 -> MLenth = 31 // The length of the month May (number of days) -- عدد ايام شهر ماي
      6 -> MLenth = 30 // The length of the month June (number of days) -- عدد ايام شهر جوان
      7 -> MLenth = 31 // The length of the month July (number of days) -- عدد ايام شهر جويلية
      8 -> MLenth = 31 // The length of the month August (number of days) -- عدد ايام شهر أوت
      9 -> MLenth = 30 // The length of the month September (number of days) -- عدد ايام شهر سبتمبر
      10-> MLenth = 31 // The length of the month October (number of days) -- عدد ايام شهر أكتوبر
      11-> MLenth = 30 // The length of the month November (number of days) -- عدد ايام شهر نوفمبر
      12-> MLenth = 31 // The length of the month December (number of days) -- عدد ايام شهر ديسمبر
    }

    //What if we are in same month -- ماذا لو كنا في نفس الشهر
    if (currentMONTH == CustomerMONTH) {
      //What if we are in same day -- ماذا لو كنا في نفس اليوم
      if (currentDAY == CustomerDAY) {
        println("Happy birth day son !!")
      }
      //The number of today bigger than number of user day -- رقم اليوم أكبر من رقم يوم المستخدم
      else if (currentDAY > CustomerDAY) {
        FinalYEAR = currentYEAR - CustomerYEAR
        FinalMONTH = 0
        FinalDAY = currentDAY - CustomerDAY

      }
      //The number of today smaller than number of user day -- رقم اليوم أصغر من رقم يوم المستخدم
      else if (currentDAY < CustomerDAY) {

        FinalYEAR = (currentYEAR - CustomerYEAR) - 1
        FinalMONTH = 11
        FinalDAY = (currentDAY + MLenth) - CustomerDAY

      }


    }
    //The number of month bigger than number of user month -- رقم الشهر أكبر من رقم شهر المستخدم
    else if (currentMONTH > CustomerMONTH) {

      //The number of today smaller than number of user day -- رقم اليوم أكبر من رقم يوم المستخدم
      if (currentDAY >= CustomerDAY) {
        FinalYEAR = currentYEAR - CustomerYEAR
        FinalMONTH = currentMONTH - CustomerMONTH
        FinalDAY = currentDAY - CustomerDAY
      }
      //The number of today smaller than number of user day -- رقم اليوم أصغر من رقم يوم المستخدم
      else if (currentDAY < CustomerDAY) {
        FinalYEAR = (currentYEAR - CustomerYEAR)
        FinalMONTH = (currentMONTH - CustomerMONTH) - 1
        FinalDAY = (currentDAY + MLenth) - CustomerDAY

      }

    }
    //The number of month smaller than number of user month -- رقم الشهر أصغر من رقم شهر المستخدم
    else if (currentMONTH < CustomerMONTH) {

      //The number of today bigger than number of user day -- رقم اليوم أكبر من رقم يوم المستخدم
      if (currentDAY >= CustomerDAY) {
        FinalYEAR = (currentYEAR - CustomerYEAR) - 1
        FinalMONTH = (currentMONTH + 12) - CustomerMONTH
        FinalDAY = currentDAY - CustomerDAY

      }
      //The number of today smaller than number of user day -- رقم اليوم أصغر من رقم يوم المستخدم
      else if (currentDAY < CustomerDAY) {
        FinalYEAR = (currentYEAR - CustomerYEAR) - 1
        FinalMONTH = ((currentMONTH + 12) - CustomerMONTH) - 1
        FinalDAY = (currentDAY + MLenth ) - CustomerDAY

      }

    }

    println("your age is : $FinalYEAR Years  , $FinalMONTH Months  and  $FinalDAY Days")
    println(" *** ---------------------------------------------------------- ***")

    FindMYage()
  }

  //Call function -- استدعاء الدالة
  FindMYage()

}
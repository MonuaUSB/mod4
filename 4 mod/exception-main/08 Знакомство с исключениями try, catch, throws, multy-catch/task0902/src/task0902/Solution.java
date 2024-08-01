package task0902;

/* 
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.


Requirements:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать имя метода, вызвавшего его.
4. Для получения имени вызвавшего метода, используй метод getMethodName.*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        return getMethodName();
        //напишите тут ваш код
    }

    public static String method2() {
        method3();
        return getMethodName();
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        return getMethodName();
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        return getMethodName();
        //напишите тут ваш код
    }

    public static String method5() {
        //напишите тут ваш код
        return getMethodName();
    }
    public static String getMethodName() {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println("Вызываемый метод: "+methodName);
        return methodName;
    }
}

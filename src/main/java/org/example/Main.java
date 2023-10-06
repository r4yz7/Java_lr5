package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        IFirst<Integer> addNumbers = (a,b,c)->a+b+c;
//       int sum = addNumbers.calc(12,4,3);
//       System.out.println("Sum: " + sum);
//       IFirst<Integer> multNumbers = (a,b,c)->a*b*c;
//       int mult = multNumbers.calc(2,3,4);
//       System.out.println("Mult: " + mult);
//
//       IDate<LocalTime> time = LocalTime::now;
//       LocalTime currentTime =  time.getTimeAndDate();
//       System.out.println("Current time: " + currentTime);
//       IDate<LocalDate> date = LocalDate::now;
//       LocalDate currentDate = date.getTimeAndDate();
//       System.out.println("Current date: " + currentDate);

        //2

//        ISecond<Integer> max = new ISecond<Integer>() {
//
//            public Integer find(Integer a, Integer b) {
//                if(a>b)
//                    return a;
//                return b;
//            }
//        };
//        int m = max.find(2,4);
//        System.out.println("Max: " + m);
//        ISecond<Integer>min = new ISecond<Integer>() {
//            @Override
//            public Integer find(Integer a, Integer b) {
//                if(a<b)
//                    return a;
//                return b;
//            }
//        };
//        m = min.find(3,4);
//        System.out.println("Min: " + m);
//
//        ICalculate<Integer> fact = new ICalculate<Integer>() {
//            @Override
//            public Integer calc(Integer a) {
//                int fact=1;
//                for (int i = a;i>1;i--){
//                  fact*=i;
//                }
//                return fact;
//            }
//        };
//        int res = fact.calc(4);
//        System.out.println("Factorial: " + res);
//
//        IPrime<Integer> prime = new IPrime<Integer>() {
//            @Override
//            public boolean isPrime(Integer a) {
//                if (a <= 1) {
//                    return false;
//                }
//                for (int i = 2; i * i <= a; i++) {
//                    if (a % i == 0) {
//                        return false;
//                    }
//                }
//                return true;
//            }
//        };
//
//        boolean t = prime.isPrime(12);
//        if(t)
//            System.out.println("Is prime");
//        else
//            System.out.println("Not prime");

        //3

//        IThird<Integer> max = new IThird<Integer>() {
//            @Override
//            public Integer calc(Integer a, Integer b, Integer c) {
//                int t = a;
//                if(t<b)
//                    t =b;
//                else if( t<c)
//                    t= c;
//                return t;
//            }
//        } ;
//
//        int m = max.calc(3,5,2);
//        System.out.println("Max: " + m);
//
//        IThird<Integer> min = (a, b, c) -> {
//            int t = a;
//            if(t>b)
//                t =b;
//            else if( t>c)
//                t= c;
//            return t;
//        };
//
//        m = min.calc(3,5,2);
//        System.out.println("MIN: " +m);

        //4

        IPairedNumbers<Integer> p = (a)->a % 2 == 0;
        boolean t = p.paired(3);
        if(t)
            System.out.println("Paired");
        else
            System.out.println("Not paired");

        IFindDiapason<Integer> find = (a,b,c)-> {
            return a <= c && b >= c;
        };
        boolean c = find.check(1,5,6);
        if (c)
            System.out.println("included in the range");
        else
            System.out.println("out of range");

        IMultiply<Integer> multiply = (a,b)->a%b==0;
        boolean l = multiply.mult(8,3);
        if (l)
            System.out.println("Multiply");
        else
            System.out.println("Not multiply");
    }
}
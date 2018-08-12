package Servlets;

public class equlas {

    public static void main(String[] args) {
        String a = "aa";
        String b = "aa";
        String c = new String("aa");

        //这个输出结果为true，a,b两个变量都保存在常量池中
        System.out.println(a == b);
        //这个输出为false，a变量保存在常量池中，而c变量保存在堆中
        //所以和a对比的不是c的内容而是c所在堆的地址
        System.out.println(a == c);
        //这个输出的是true，equals会通过地址获取堆中保存的内容，然后进行比较
        System.out.println(a.equals(c));
        //因为a和b都只是普通的变量，而c则是一个引用类型变量，所以a,b之间可以直接用==来比较值是否相等
        //而c是引用类型变量如果用 == 来与a或b进行比较c进行比较的就不是里面的值，而是其在堆中的地址
        //equlas方法不重写的话比较的就是变量在堆中的地址，但是String重写了父类的equlas方法
        //使其在比较引用类变量的时候能将里面的值遍历取出来进行比较
    }

}

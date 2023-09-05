public class Overloading {
    //The name of the function will be same, but the parameter will be different.
    public static void main(String[] args) {
        fun (20);
        fun ("Sandeep");
        int ans=sum(10,29);
        int ans1=sum(12,23,12);
        System.out.println (ans);
        System.out.println (ans1);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println ("First One");
        System.out.println (a);
    }
    static void fun(String name){
        System.out.println ("Second One");
        System.out.println (name);
    }
}

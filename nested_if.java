public class nested_if {
    public static void main(String[] args) {
        int salary = 12000;
        if (salary>10000){
            salary=salary+2000;
        } else if (salary>15000) {
            salary=salary+3000;
        }else{
            salary=salary+1000;
        }
        System.out.println (salary);
    }
}

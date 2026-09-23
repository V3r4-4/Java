public  class Swap {
    public static void main(String[] args) {
        //Recommended to use a temporary variable
        int a=10;
        int b=20;
        int tem = a;
        a=b;
        b=tem;
        System.out.println("Values of a and b before swapping are a=10 and b=20 ");
        System.out.println("Value a after swapping is " + a);
        System.out.println("Value b after swapping is " + b);
    }
}


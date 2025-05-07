package sapient;

 class Hashcode {
    public int value ;

    public int hashCode(){
        return 42;
    }
}

 class Hashcode2 {
    public int value ;

    public int hashcode(){
        return (int) value^5;
    }
}

class HashcodeClient{
    public static void main(String[] args) {
        System.out.println("HashcodeClient");
    }
}
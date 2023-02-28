public class ObjA {
    String s1=new String("abc");
    String s2 = new String("xyz");
    String s3 = new String("pqr");
    int a=5;

    @Override
    public boolean equals(Object o){
        if(this == 0) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ClassA A1=(ClassA) o;
        return a == A1.a && Objects.equals(s1,A1.s1) && Objects.equals(s2,A1.s2) && Objects.equals(s3,A1.s3);
    }
}

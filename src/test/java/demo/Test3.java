package demo;


class Animal
{
    String name = "animal";
    String makeNoise()  { return "generic noise"; }
}
class Dog extends Animal
{
    String name = "dog";
    String makeNoise() {  return "bark"; }
}
public class Test3
{
    public static void main(String[] args)
    {
        Animal an = new Dog();
        System.out.println(an.name+" "+an.makeNoise());

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 equals s3: " + (s1.equals(s3)));


    }
}

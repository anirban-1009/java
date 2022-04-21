class Parent
{
    int a=99;
    void invite()
    {
        System.out.println("card invitation!!");
    }
}

class Child extends Parent
{
    void invite()
    {
        System.out.println("sms invitation");
        System.out.println(super.a);
    }

    void m1()
    {
        super.invite();
    }
}

class Override
{
    public static void main(String[ ] args){
        Child c = new Child();
        Parent p = new Parent();
        c.invite();
        p.invite();
        c.m1();
    }
}
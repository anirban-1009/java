class Thr11
{
    public static void main(String d[])
    {
        Myt1 tt = new Myt1();
        tt.run();
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try{Thread.sleep(500);}
            catch(Exception h){}
        }
    }
}
class Myt1 implements Runnable
{
    public void run()
    {System.out.println(Thread.currentThread().getName()+"in myt1");
    for(int i=110;i<120;i++)
    {
        System.out.println(i);
        try{Thread.sleep(500);}
        catch(Exception h){}
    }
}
}
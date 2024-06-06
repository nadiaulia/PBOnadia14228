package week9;

public class BangunDatar
{
    private int panjang;
    private int lebar;
    private double diameter;
    private int sisi;
    protected static final double pi = 3.14;

    public BangunDatar(int sisi)
    {
        this.sisi = sisi;
    }

    public BangunDatar(int lebar, int panjang)
    {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public BangunDatar(double diameter)
    {
        this.diameter = diameter;
    }

    public int luas(int a) //persegi
    {
        return a*a;
    }

    public int luas(int a, int b) //persegi panjang
    {
        return a*b;
    }

    public double luas(double a, double b)//segitiga
    {
        return (a*b)/2;
    }
    
    public double luas(double a)// lingkaran
    {
        return pi*a*a;
    }

    public int kelilingpersegi(int a)
    {
        return a*a*a*a;
    }

    public int kelilingsegipanjang(int a, int b)
    {
        return 2*(a+b);
    }

    public double kelilinglingkaran(double a)
    {   
        return 2*pi*a;
    }

    public int getPanjang()
    {
        return panjang;
    }

    public int getLebar()
    {
        return lebar;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public int getSisi()
    {
        return sisi;
    }
}
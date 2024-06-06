package week9;

public class BangunRuang extends BangunDatar
{
    public BangunRuang(int sisi)
    {
      super(sisi);
    } 

    public BangunRuang(int lebar, int panjang)
    {
      super(lebar, panjang);
    } 

    public BangunRuang(double diameter)
    {
        super(diameter);
    }

    public double volumeKubus(double sisi)
    {
        return Math.pow(sisi,3);
    }

    public int volumeBalok(int panjang, int lebar, int tinggi)
    {
        return panjang*lebar*tinggi;
    }

    public double volumeBola(double diameter)
    {
        double radius = diameter/2;
        return (4.0/3.0) * pi * Math.pow(radius,3);
    }

    public int kelilingKubus(int sisi)
    {
        return 12*sisi;
    }

    public int kelilingBalok(int panjang, int lebar, int tinggi)
    {
        return 4*(panjang+lebar+tinggi);
    }

    public double kelilingBola(double diameter)
    {
        double radius = diameter/2.0;
        return 2 * pi * radius;
    }
}


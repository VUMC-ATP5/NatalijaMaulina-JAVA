package majasDarbs.classHomework;

public class Trijsturis {
    int a;
    int  b;
    int  c;
    int p ;
    double s;

    public Trijsturis() {
    }

    public Trijsturis(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = (a+b+c)/2;
        this.s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public boolean vaiVienadmalu(){
        return true;
    }
    public boolean vaiVienadsanu(){
        return true;
    }
}

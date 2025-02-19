

//Blueprint class
class Sphere{
    double r;
    public double surfArea(){
        double sa= 4*3.14*(r*r);
        return sa;
    }

    public double surfArea(double rad){      //Function overloading (Parameters should be changed, return type distinction is optional
        double sa = 4*3.14*(rad*rad);
        return sa;                            //Methods can have their local variables, same variable name applies in different methods
    }

    public double volume(){
        double vol = (4/3)*3.14*(r*r*r);
        return vol;
    }

    public double volume(double ra){
        double vol =  (4/3)*3.14*(ra*ra*ra);
        return vol;
    }
}


class Cube{
    double a;
    public double totalArea(){
        double tsa=6*(a*a);
        return tsa;
    }

    public double totalArea(double side){
        double tsa = 6*(side*side);
        return tsa;
    }

    public double volume(){
        double vol = a*a*a;
        return vol;
    }

    public double volume(double side){
        double vol =  side*side*side;
        return vol;
    }

    public double LateralArea(){
        double lsa= 4*(a*a);
        return lsa;
    }

    public double LateralArea(double side){
        double lsa= 4*(side*side);
        return lsa;
    }

}

class Cuboid{
    double l;
    double b;
    double h;

    public double totalArea(){
        double tsa=2*(l*b + b*h + l*h);
        return tsa;
    }

    public double totalArea(double len, double bred, double heit){
        double tsa = 2*(len*bred + bred*heit + len*heit);
        return tsa;
    }

    public double volume(){
        double vol = l*b*h;
        return vol;
    }

    public double volume(double len, double bred, double heit){
        double vol =  len*bred*heit;
        return vol;
    }

    public double LateralArea(){
        double lsa= 2*h*(l+b);
        return lsa;
    }

    public double LateralArea(double l, double b, double h){
        double lsa= 2*h*(l+b);
        return lsa;
    }

}


class Cone{
    double r;
    double h;
    double sh=Math.sqrt((r*r + h*h));

    public double totalArea(){
        double tsa=3.14*r*(sh + h);
        return tsa;
    }

    public double totalArea(double rad, double sl, double high){
        double tsa = 3.14*rad*(high + sl);
        return tsa;
    }

    public double volume(){
        double vol = (1/3)*3.14*(r*r)*h;
        return vol;
    }

    public double volume(double rad, double high){
        double vol =  (1/3)*3.14*(rad*rad)*high;
        return vol;
    }

    public double CurvedArea(){
        double lsa= 3.14*h*sh;
        return lsa;
    }

    public double CurvedArea(double high,double slen){
        double lsa= 3.14*high*slen;
        return lsa;
    }
}

class Cylinder{
    double r;
    double h;
    public double totalArea(){
        double sa=2*3.14*r*(h+r);
        return sa;
    }

    public double totalArea(double rad, double high){
        double sa = 2*3.14*rad*(high + rad);
        return sa;
    }

    public double volume(){
        double vol = 3.14*(r*r)*h;
        return vol;
    }

    public double volume(double rad, double high){
        double vol =  3.14*(rad*rad)*high;
        return vol;
    }
}






public class Shapes3d {
    public static void main(String[] args){
        Sphere ob = new Sphere();
        ob.r = 67.89;                          //Providing value to the radius (input declared for class)
        System.out.println(ob.surfArea());
        System.out.println(ob.surfArea(45.77));     //Arguments are always given more preference than the class' own input
    }

}

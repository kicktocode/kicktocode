public class TrafficLight {
    String colour;
    float time;
    TrafficLight(String colour,float time)
    { this.colour=colour;
        this.time=time;
    }
    public String getcolour(){
        return colour;
    }
    public void setColour(String colour)
    {
        this.colour=colour;
    }
    public double gettime()
    {
        return time;
    }
    public void setTime(float time)
    {
        this.time=time;

    }
   public boolean Isgreen(String colour){
        return colour.equals("green");
   }
    public boolean Isred(String colour){
        return colour.equals("red");
    }
}
class checkTraffic{
    public static void main(String[]args){
        TrafficLight obj=new TrafficLight("green",20);

        System.out.println("colour is red now: "+obj.Isred("red"));

        System.out.println("time duration :"+obj.gettime());

        obj.Isgreen("green");
        System.out.println("colour is green now: "+obj.Isgreen("red"));
        obj.setTime(25);
        System.out.println("time duration :"+obj.gettime());
    }
}
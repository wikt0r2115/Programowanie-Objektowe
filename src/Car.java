public class Car {
    private String Name;
    private String Year;
    private String Fuel;
    private String Color;

    Car(){
        this.Name = "Ford";
        this.Year = "2003";
        this.Fuel = "Diesel";
        this.Color = "Niebieski";
    }
    Car(String Name,String Year,String Fuel){
        this.Name = Name;
        this.Year = Year;
        this.Fuel = Fuel;
        this.Color = "Bialy";
    }
    Car(String Name,String Year,String Fuel,String Color){
        this.Name = Name;
        this.Year = Year;
        this.Fuel = Fuel;
        this.Color = Color;
    }

    public String InfoCar(){
        return this.getName()+" "+
                this.getYear()+" "+
                this.getFuel()+" "+
                this.getColor();
    }
    public String getName(){
        return this.Name;
    }
    public String getYear(){
        return this.Year;
    }
    public String getFuel(){
        return this.Fuel;
    }
    public String getColor(){
        return this.Color;
    }
}

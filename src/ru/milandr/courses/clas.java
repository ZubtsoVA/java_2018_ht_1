public class animal
{
        private String name;
        private int legs;
        private boolean fur;
        private String type;
        private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFur() {
        return fur;
    }

    public int getLegs() {
        return legs;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public animal(){}
    public animal(String name, String type, double weight)
    {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }
}
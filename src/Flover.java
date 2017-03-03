
public class Flover implements Cloneable{ //
    private String name;
    private int age;
    private double high;
    private boolean cvet;

    public Flover(String name, int age, double high, boolean cvet) {
        this.name = name;
        this.age = age;
        this.high = high;
        this.cvet = cvet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public boolean isCvet() {
        return cvet;
    }

    public void setCvet(boolean cvet) {
        this.cvet = cvet;
    }

    @Override
    public Flover clone() throws CloneNotSupportedException {
        return (Flover)super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flover flover = (Flover) o;

        if (age != flover.age) return false;
        if (Double.compare(flover.high, high) != 0) return false;
        if (cvet != flover.cvet) return false;
        return name.equals(flover.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + age;
        temp = Double.doubleToLongBits(high);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (cvet ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flover{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                ", cvet=" + cvet +
                '}';
    }
}

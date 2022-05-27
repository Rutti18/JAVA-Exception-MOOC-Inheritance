
// EXERCISE - Sensors and Temperature (4 Parts)

public class StandardSensor implements Sensor {

    private int number;

    public StandardSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    	return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public int read() {
        return this.number;
    }

    public static void main(String[] args) {
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);

        System.out.println(ten.read());
        System.out.println(minusFive.read());

        System.out.println(ten.isOn());
        ten.setOff();
        System.out.println(ten.isOn());
	}
}
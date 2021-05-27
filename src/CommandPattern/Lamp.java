package CommandPattern;

// In this scenario this class acts as Reciever.
public class Lamp {
    private float lightLevel = 0f;
    private boolean isTurnedOn = false;

    public void turnOn(){
        if(!isTurnedOn){
            this.isTurnedOn = true;
            this.lightLevel = 0.5f;
        }
        else{
            this.isTurnedOn = true;
        }
    }

    public void turnOff(){
        this.isTurnedOn = false;
        this.lightLevel= 0f;
    }

    public void decreaseLight(){
        if (this.lightLevel - 0.5f <= 0){
            this.isTurnedOn = false;
            this.lightLevel = 0f;
        } else{
            this.lightLevel -= 0.5f;
        }
    }

    public void increaseLight(){
        if (this.lightLevel + 0.5f > 5f){
            this.lightLevel = 5f;
        } else {
            this.lightLevel += 0.5f;
        }
    }

    public float getLightLevel() {
        return lightLevel;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "lightLevel=" + lightLevel +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}

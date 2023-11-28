public class Processor {
    private String make;
    private String model;
    private float frequency;
    private int cacheSize;

    public Processor(String make, String model, float frequency, int cacheSize){
        this.make = make;
        this.model = model;
        this.frequency = frequency;
        this.cacheSize = cacheSize;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public float getFrequency(){
        return frequency;
    }

    public int getCacheSize(){
        return cacheSize;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setFrequency(float frequency){
        this.frequency = frequency;
    }

    public void setCacheSize(int cacheSize){
        this.cacheSize = cacheSize;
    }

    public void compile(){

    }

    public String toString(){
            return getMake()+"\n"+getModel()+"\n"+getFrequency()+"\n"+getCacheSize();
        }
}

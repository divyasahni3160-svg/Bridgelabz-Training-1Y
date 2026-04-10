abstract class Checkpoint {
     private String checkpointId;
    private String locationName;
    private double distanceFromLast;
    private double expectedDuration;
    private double actualDuration;
public Checkpoint(String id,String name,double dist,double expected,double actual){
    this.checkpointId=id;
    this.locationName=name;
    this.distanceFromLast=dist;
    this.expectedDuration=expected;
    this.actualDuration=actual;
}
    public abstract boolean iscritical();
    public abstract double calculatePenality();
    public boolean isDelayed(){
        return actualDuration>expectedDuration;
    }
}

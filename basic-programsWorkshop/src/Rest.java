public class Rest extends Checkpoint{
    public  RestChecpoint(String id, String name, double dist, double exp, double act){
        super(id,name,dist,exp,act);
    }
    @Override
    public boolean iscritical() {
        return false;
    }

    @Override
    public double calculatePenality() {
        double delay = actualDuration-expectedDuration;
        return (delay > 30) ? (delay * 0.5) : 0.0;
    }
}

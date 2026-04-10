public class RouteLinkedlist {
    static void main(String[] args) {
        String driverName="Divya";
        String driverid="abc";
        RouteLinkedlist<Checkpoint> route = new RouteLinkedlist<>();
        route.addCheckpoint(new DeliveryCheckpoint(("c1","warehouse",40.0,60,70));
        route.addCheckpoint(new FuelCheckpoint(("c2","pump",20.0,15,10));
        route.addCheckpoint(new RestCheckpoint(("c3","ac",40.0,60,70));
        double totalDist= route.computeTotalDistance();
        double totalenalty= route.computeTotalpenalty();
        double routeScore = totalDist-totalenalty;
        System.out.println(totalDist);
        System.out.println(routeScore);
        


    }
}

import java.util.HashMap;
import java.util.Set;

public class ItineraryForTicket {
    public static void main(String[] args) {
        HashMap<String, String> fromTo = new HashMap<>();
        fromTo.put("Chennai", "Bengaluru");
        fromTo.put("Mumbai", "Delhi");
        fromTo.put("Goa", "Chennai");
        fromTo.put("Delhi", "Goa");
        HashMap<String, String> toFrom = new HashMap<>();
        String startingPoint = new String("");
        Set<String> set = fromTo.keySet();
        for(String name: set)
            toFrom.put(fromTo.get(name), name);
        for(String name: set){
            if(!toFrom.containsKey(name)){
                startingPoint = name;
                break;
            }
        }
        System.out.print(startingPoint);
        while(true){
            if(fromTo.containsKey(startingPoint)){
                System.out.print("->" + fromTo.get(startingPoint));
                startingPoint = fromTo.get(startingPoint);
            }else{
                break;
            }
        }
        System.out.print("->End");
    }
}

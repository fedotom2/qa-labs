import java.util.ArrayList;
import java.util.List;

public class ManagerException {
    private static final List<String> criticalExceptiions = new ArrayList<String>();
    private int criticalCounter = 0;
    private int nonCriticalCounter = 0;

    public int getCriticalCounter() {
        return criticalCounter;
    }

    public int getNonCriticalCounter() {
        return nonCriticalCounter;
    }
    public void addList(String name) {
        criticalExceptiions.add(name);
    }

    public boolean isCritical(Exception e) {
        return criticalExceptiions.contains(e.getClass().getCanonicalName());
    }
    public void count(Exception e) {
        if (isCritical(e)) {
            criticalCounter++;
        }
        else {
            nonCriticalCounter++;
        }
    }

}

import java.util.ArrayList;
import java.util.List;

public class Story implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<String> scenes = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String sceneName) {
        for (Observer o : observers) {
            o.update(sceneName);
        }
    }

    public void addScene(String sceneName) {
        scenes.add(sceneName);
        System.out.println("Scene Added: " + sceneName);
        notifyObservers(sceneName);
    }

    public List<String> getScenes() {
        return scenes;
    }
}

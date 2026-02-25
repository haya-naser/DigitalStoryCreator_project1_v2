public class SceneListUI implements Observer {

    @Override
    public void update(String sceneName) {
        System.out.println("Scene List Updated: " + sceneName);
    }
}

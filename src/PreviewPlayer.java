public class PreviewPlayer implements Observer {

    @Override
    public void update(String sceneName) {
        System.out.println("Preview Updated for Scene: " + sceneName);
    }
}

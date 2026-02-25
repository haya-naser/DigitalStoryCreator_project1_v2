public class Main {
    public static void main(String[] args) {
        Story myStory = new Story();

        PreviewPlayer preview = new PreviewPlayer();
        SceneListUI sceneUI = new SceneListUI();

        myStory.attach(preview);
        myStory.attach(sceneUI);

        myStory.addScene("Opening Scene");
        myStory.addScene("Climax Scene");
    }
} 

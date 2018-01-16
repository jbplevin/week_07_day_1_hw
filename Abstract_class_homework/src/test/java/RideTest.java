import org.junit.Before;

public class RideTest {
    Dodgem dodgem;
    GhostTrain ghostTrain;
    Rollercoaster rollercoaster;
    Waltzer waltzer;

    @Before
    public void before(){
        dodgem = new Dodgem();
        ghostTrain = new GhostTrain();
        rollercoaster = new Rollercoaster();
        waltzer = new Waltzer();
    }

}

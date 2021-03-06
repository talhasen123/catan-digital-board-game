package DevelopmentCards;

import GameFlow.FlowManager;
import GameFlow.Game;
import GameFlow.Response;
import SceneManagement.SoundManager;
import ServerCommunication.ServerHandler;

public class YearOfPlenty implements Playable {
    // Properties

    // Constructor
    public YearOfPlenty()
    {
    }

    // Methods
    /**
     * This function plays the DevelopmentCards.YearOfPlenty card, which allows player to gain 2 resources of their choice.
     */
    @Override
    public void play() {
        FlowManager flowManager = new FlowManager();
        if (ServerHandler.getInstance().getStatus() != ServerHandler.Status.RECEIVER) {
            flowManager.addMust(Response.MUST_RESOURCE_SELECTION_PLENTY);
        }
        SoundManager.getInstance().playEffect(SoundManager.Effect.YEAR_OF_PLENTY);
    }
}

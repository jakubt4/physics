package physics.world.impl;

import physics.gui.WorldGUI;
import physics.world.api.WorldObjectListenerApi;

public class WorldObjectListener implements WorldObjectListenerApi {

    private final WorldGUI gui;

    public WorldObjectListener(final WorldGUI gui) {
        this.gui = gui;
    }

    @Override
    public void onAddingWorldObject(final WorldObject obj) {
        this.gui.add(obj);
    }
}

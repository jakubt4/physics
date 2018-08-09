package physics;

import physics.gui.WorldGUI;
import physics.world.api.WorldApi;
import physics.world.impl.World;
import physics.world.impl.WorldObject;
import physics.world.impl.WorldSize;

public class Main {

    public static void main(final String[] args) {
        final WorldGUI worldGUI = new WorldGUI();
        final WorldApi world = new World(new WorldSize(500, 500), worldGUI);
        worldGUI.init(world);

        final WorldObject obj = new WorldObject("obj", 100, 100);
        world.addWorldObject(obj);
    }

}

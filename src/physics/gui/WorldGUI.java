package physics.gui;

import javax.swing.JFrame;

import physics.world.api.WorldApi;
import physics.world.api.WorldObjectListenerApi;
import physics.world.api.WorldSizeApi;
import physics.world.impl.WorldObject;
import physics.world.impl.WorldObjectMove;

@SuppressWarnings("serial")
public class WorldGUI extends JFrame implements WorldObjectListenerApi {

    public void init(final WorldApi world) {
        final WorldSizeApi size = world.getSize();
        this.setSize(size.getX(), size.getY());

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @SuppressWarnings("resource")
    @Override
    public void onAddingWorldObject(final WorldObject obj) {
        obj.setSize(10, 10);
        this.add(obj);
        new WorldObjectMove(obj, this).run();
    }
}

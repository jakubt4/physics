package physics.world.api;

import physics.world.impl.WorldObject;

public interface WorldObjectListenerApi {

    void onAddingWorldObject(WorldObject obj);
}

package Modules.Anims;

import Views.Character;

public abstract class Base_AnimModule extends Thread{
    private final Character character;
    public Base_AnimModule(Character character){
        this.character = character;
    }

    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            try {
                character.nextFire();
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
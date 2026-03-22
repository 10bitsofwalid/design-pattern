package AbstractFactoryDP3;

// TODO: Define FLACFileFactory class which implements MusicFileAbstractFactory

    // TODO: Implement the createMusicFile method to return a new FLACFile instance


public class FLACFileFactory implements MusicFileAbstractFactory{
    public  MusicFile createMusicFile(){
        return new FLACFile();
    }
}
